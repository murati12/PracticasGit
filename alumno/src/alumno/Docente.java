package alumno;

public class Docente {

	int horasClase;
	String nombre;
	
	public Docente() {
		
	}
	
	public Docente(int horasClase, String nombre) {
		this.horasClase = horasClase;
		this.nombre = nombre;
	}

	public int getHorasClase() {
		return horasClase;
	}

	public void setHorasClase(int horasClase) {
		this.horasClase = horasClase;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}