package pe.edu.upc.pcinfo.dtos;

import javax.persistence.Column;

public class RecomendacionDTO {

    private int id;
    private int nmRecomend;
    private String msnRecomnd;

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
