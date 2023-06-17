package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "comentario")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "comentario",length = 60, nullable = false)
    private String comentario;
    @Column(name = "fecha")
    private LocalDate fecha;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Comentario() {
    }

    public Comentario(int id, String comentario, LocalDate fecha, Usuario usuario) {
        this.id = id;
        this.comentario = comentario;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
