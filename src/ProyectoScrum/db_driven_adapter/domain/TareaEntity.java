package ProyectoScrum.db_driven_adapter.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import ProyectoScrum.core.domain.Estado;
import ProyectoScrum.core.domain.Prioridad;
import ProyectoScrum.core.domain.Tarea;

@Entity
public class TareaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "prioridad")
    private Prioridad prioridad;

    @Column(name = "duracion")
    private int duracion;

    @Column(name = "estado")
    private Estado estado;

    @Column(name = "presencial")
    private boolean presencial;

    // Constructor que recibe una instancia de Tarea como parámetro
    public TareaEntity(Tarea tarea) {
        this.descripcion = tarea.getDescripcion();
        this.id = tarea.getId();
        this.prioridad = tarea.getPrioridad();
        this.duracion = tarea.getDuracion();
        this.presencial = tarea.isPresencial();
        
        this.estado = tarea.getEstado();
    }

 // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    // Método para convertir la entidad a una instancia de Tarea
    public Tarea toTarea() {
        return new Tarea(this.descripcion, this.id, this.prioridad, this.duracion, this.presencial);
    }

    public TareaEntity withNewValues(Tarea nuevaTarea) {
        this.descripcion = nuevaTarea.getDescripcion();
        this.prioridad = nuevaTarea.getPrioridad();
        this.duracion = nuevaTarea.getDuracion();
        this.presencial = nuevaTarea.isPresencial();
        this.estado = nuevaTarea.getEstado();
        return this;
    }
}
