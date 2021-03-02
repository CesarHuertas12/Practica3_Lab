package practica3;
import java.util.Random;

public class Rfc {
	
	public static String generarRfc(Persona p) {
		Random ran = new Random();
		String rfc = new String();
		
		rfc = codificarNombre(p.getApellidoP(),p.getApellidoM(),p.getNombre(),rfc);
		rfc = codificarNacimiento(p.getNacimiento(), p.getGenero(), p.getEstado(),rfc);
		rfc += ran.nextInt(10);
		rfc += ran.nextInt(10);
		rfc += ran.nextInt(10);
		
		return rfc;
	}
	
	private static String codificarNombre(String ap, String am, String n, String rfc) {
		char vocales[] = {'a','e','i','o','u'};
		boolean validar = false;
		rfc += ap.charAt(0);
		
		for(int i = 1; i < ap.length(); i++) {
			for(int j = 0; j < vocales.length; j++) {
				if(ap.charAt(i) == vocales[j]) {
					rfc += ap.charAt(i);
					validar = true; 
					break;
				}
			}
			if(validar == true) {
				break;
			}
		}
		rfc += am.charAt(0);
		rfc += n.charAt(0);
		
		return rfc.toUpperCase();
	}
	
	private static String codificarNacimiento(String nc, String g, String e, String rfc) {
		for(int i = 0; i < nc.length(); i++) {
			if(nc.charAt(i) != '/') {
				rfc += nc.charAt(i);
			}
		}
		rfc += g;
		rfc += e;
		
		return rfc;
	}
}
