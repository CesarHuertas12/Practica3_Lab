package practica3;

public class Persona {
	String nombre;
	String apellidoM;
	String apellidoP;
	String nacimiento;
	String genero;
	String estado;
	String curp;
	String rfc;
	
	public Persona(String n,String aP,String aM ,String nc, String g, String e) {
		nombre = n;
		nacimiento = nc;
		genero = g;
		estado = e;
		apellidoM = aM;
		apellidoP = aP;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidoM() {
		return apellidoM;
	}

	public String getApellidoP() {
		return apellidoP;
	}

	public String getNacimiento() {
		return nacimiento;
	}

	public String getGenero() {
		return genero;
	}

	public String getEstado() {
		return estado;
	}

	public String getCurp() {
		return curp;
	}

	public String getRfc() {
		return rfc;
	}
	
	public void setCurp(String curp) {
		this.curp = curp;
	}
	
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
}
