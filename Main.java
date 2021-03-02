package practica3;

public class Main {

	public static void main(String[] args) {
		Persona p = new Persona(Captura.capNombre(),Captura.capApellidoP(),Captura.capApellidoM(),Captura.capNacimiento(),Captura.capGenero(),Captura.capEstado());
		p.setCurp(Curp.generarCurp(p));
		p.setRfc(Rfc.generarRfc(p));
		
		System.out.println("Su Curp es: " + p.getCurp());
		System.out.println("Su Rfc es: " + p.getRfc());
	}

}
