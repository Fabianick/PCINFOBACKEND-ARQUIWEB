package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;

@Entity
@Table(name = "recomendacion")
public class Recomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "valoracion_user",nullable = false)
    private int valoracion_user;
    @Column(name = "notas_adicionales",length = 60, nullable = false)
    private String notas_adicionales;

    @ManyToOne
    @JoinColumn(name = "idCuestionario")
    private Cuestionario cuestionario;

    public Recomendacion() {
    }

    public Recomendacion(int id, int valoracion_user, String notas_adicionales, Cuestionario cuestionario) {
        this.id = id;
        this.valoracion_user = valoracion_user;
        this.notas_adicionales = notas_adicionales;
        this.cuestionario = cuestionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getValoracion_user() {
        return valoracion_user;
    }

    public void setValoracion_user(int valoracion_user) {
        this.valoracion_user = valoracion_user;
    }

    public String getNotas_adicionales() {
        return notas_adicionales;
    }

    public void setNotas_adicionales(String notas_adicionales) {
        this.notas_adicionales = notas_adicionales;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
}
