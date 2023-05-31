package pe.edu.upc.pcinfo.entities;
import javax.persistence.*;
import java.time.LocalDate;
@Entity
@Table(name = "comentarios")
public class Comentario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "comentario", nullable = false, length = 60) //
    private String comentario;
    @Column(name = "fecha")
    private LocalDate fecha;

    public Comentario() {
    }

    public Comentario(int id, String comentario, LocalDate fecha) {
        this.id = id;
        this.comentario = comentario;
        this.fecha = fecha;
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
}
