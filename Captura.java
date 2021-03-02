package practica3;
import java.util.Scanner;


public class Captura {
	
	public static String capNombre() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su nombre: ");
		return sc.nextLine();
	}
	
	public static String capApellidoP() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su apellido paterno: ");
		return sc.nextLine();
	}
	
	public static String capApellidoM() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su apellido materno: ");
		return sc.nextLine();
	}
	
	public static String capNacimiento() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su fecha de nacimiento (ej:AA/MM/DD): ");
		return sc.nextLine();
	}
	
	public static String capEstado() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\nAGUASCALIENTES AS\tBAJA CALIFORNIA BC\tBAJA CALIFORNIA SUR BS\tCAMPECHE CC\tCOAHUILA CL\nCOLIMA CM\tCHIAPAS CS\tCHIHUAHUA CH\t"+
		        "DISTRITO FEDERAL DF\tDURANGO DG\nGUANAJUATO GT\tGUERRERO GR\tHIDALGO HG\tJALISCO JC\tMÉXICO MC\nMICHOACÁN MN\tMORELOS MS\tNAYARIT NT\tNUEVO LEÓN NL\tOAXACA OC\n"+
		        "PUEBLA PL\tQUERÉTARO QT\tQUINTANA ROO QR\tSAN LUIS POTOSÍ SP\tSINALOA SL\nSONORA SR\tTABASCO TC\tTAMAULIPAS TS\tTLAXCALA TL\tVERACRUZ VZ\nYUCATÁN YN\tZACATECAS ZS\tNACIDO EN EL EXTRANJERO NE\n");
		System.out.print("Ingrese la clave de su estado de nacimiento segun la tabla: ");
		return sc.nextLine();
	}
	
	public static String capGenero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Ingrese su genero (ej: M/F): ");
		return sc.nextLine();
	}
}
