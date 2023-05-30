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

    public Recomendacion() {
    }

    public Recomendacion(int id, int nmRecomend, String msnRecomnd) {
        this.id = id;
        this.nmRecomend = nmRecomend;
        this.msnRecomnd = msnRecomnd;
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
}
