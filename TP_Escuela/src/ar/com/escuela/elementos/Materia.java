package ar.com.escuela.elementos;

public class Materia {
	
	private String nombre;
	private String dia;
	private String horario;
	private String fecha;
	
	public Materia(String nombre, String dia, String horario, String fecha) {
		
		this.nombre = nombre;
		this.dia = dia;
		this.horario = horario;
		this.fecha = fecha;
		
	}
	
	public String getDia() {
		return dia;
	}
	
	public void setDia(String dia) {
		this.dia = dia;
	}
	
	public String getHorario() {
		return horario;
	}
	
	public void setHorario(String horario) {
		this.horario = horario;
	}
	
	public String getFecha() {
		return fecha;
	}
	
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Materia: " + this.nombre + "\n" 
			+  "Horario: " + this.horario + "\n"
			+  "Día: " + this.dia + "\n" 
			+  "Fecha: " + this.fecha + "\n"			
			;
	}
	
	
			
	

}
