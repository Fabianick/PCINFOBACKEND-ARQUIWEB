package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "reporte")
public class Reporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "descripcion",length =100,nullable = false )
    private String descripcion;
    @Column(name = "fecha")
    private LocalDate fecha;
    @Column(name = "estado",length = 60,nullable = false)
    private String estado;
    @ManyToOne
    @JoinColumn(name = "idAdministrador")
    private Administrador administrador;

    public Reporte() {
    }

    public Reporte(int id, String descripcion, LocalDate fecha, String estado, Administrador administrador) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.estado = estado;
        this.administrador = administrador;
    }

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

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
}

