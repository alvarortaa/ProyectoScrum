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

	public Tarea() {
			}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Prioridad getPrioridad() {
		return prioridad;
	}

	public void setPrioridad(Prioridad prioridad) {
		this.prioridad = prioridad;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	public boolean isPresencial() {
		return presencial;
	}

	public void setPresencial(boolean presencial) {
		this.presencial = presencial;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}
	
	
	
	
	
	
	

}
