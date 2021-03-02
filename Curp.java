package practica3;
import java.util.Random;

public class Curp{
	
	public static String generarCurp(Persona p) {
		String curp = new String();
		
		curp = codificarNombre(p.getApellidoP(),p.getApellidoM(),p.getNombre(),curp);
		curp = codificarNacimiento(p.getNacimiento(), p.getGenero(), p.getEstado(),curp);
		curp = codificarConsonantes(p.getApellidoP(),p.getApellidoM(),p.getNombre(),curp);
		
		return curp;
	}
	
	private static String codificarNombre(String ap, String am, String n, String curp) {
		char vocales[] = {'a','e','i','o','u'};
		boolean validar = false;
		curp += ap.charAt(0);
		
		for(int i = 1; i < ap.length(); i++) {
			for(int j = 0; j < vocales.length; j++) {
				if(ap.charAt(i) == vocales[j]) {
					curp += ap.charAt(i);
					validar = true; 
					break;
				}
			}
			if(validar == true) {
				break;
			}
		}
		curp += am.charAt(0);
		curp += n.charAt(0);
		
		return curp.toUpperCase();
	}
	
	private static String codificarNacimiento(String nc, String g, String e, String curp) {
		for(int i = 0; i < nc.length(); i++) {
			if(nc.charAt(i) != '/') {
				curp += nc.charAt(i);
			}
		}
		curp += g;
		curp += e;
		
		return curp;
	}
	
	private static String codificarConsonantes(String ap, String am, String n, String curp) {
		Random ran = new Random();
		
		curp += obtenerCaracter(ap);
		curp += obtenerCaracter(am);
		curp += obtenerCaracter(n);
		curp += ran.nextInt(10);
		curp += ran.nextInt(10);
		
		return curp.toUpperCase();
	}
	
	private static char obtenerCaracter(String var) {
		char vocales[] = {'a','e','i','o','u'};
		int contador = 0;
		
		for(int i = 1; i < var.length(); i++) {
			for(int j = 0; j < vocales.length; j++) {
				if(var.charAt(i) != vocales[j]) {
					contador++;
					if(contador == 5) {
						return var.charAt(i);
					}
				}
			}
			contador = 0;
		}
		return 0; 
	}
}
