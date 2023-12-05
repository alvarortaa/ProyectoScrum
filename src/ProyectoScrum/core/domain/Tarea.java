package ProyectoScrum.core.domain;



public class Tarea {
	
	private String descripcion;
	private int id;
	private Prioridad prioridad;
	private int duracion;
	private boolean presencial;
	private Estado estado;
	
	public Tarea(String descripcion, int id, Prioridad prioridad, int duracion, boolean presencial) {
		super();
		this.descripcion = descripcion;
		this.id = id;
		this.prioridad = prioridad;
		this.duracion = duracion;
		this.presencial = presencial;
		this.estado=Estado.en_espera;
		
	}
	
	
	
	
	
	

}
