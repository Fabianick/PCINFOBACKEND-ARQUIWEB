package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;

@Entity
@Table(name = "recomendaciones")
public class Recomendacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "nmRecomend",nullable = false)
    private int nmRecomend;
    @Column(name = "msnRecomnd",length = 60, nullable = false)
    private String msnRecomnd;

    @ManyToOne
    @JoinColumn(name = "idCuestionario")
    private Cuestionario cuestionario;

    public Recomendacion() {
    }

    public Recomendacion(int id, int nmRecomend, String msnRecomnd, Cuestionario cuestionario) {
        this.id = id;
        this.nmRecomend = nmRecomend;
        this.msnRecomnd = msnRecomnd;
        this.cuestionario = cuestionario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNmRecomend() {
        return nmRecomend;
    }

    public void setNmRecomend(int nmRecomend) {
        this.nmRecomend = nmRecomend;
    }

    public String getMsnRecomnd() {
        return msnRecomnd;
    }

    public void setMsnRecomnd(String msnRecomnd) {
        this.msnRecomnd = msnRecomnd;
    }

    public Cuestionario getCuestionario() {
        return cuestionario;
    }

    public void setCuestionario(Cuestionario cuestionario) {
        this.cuestionario = cuestionario;
    }
}
