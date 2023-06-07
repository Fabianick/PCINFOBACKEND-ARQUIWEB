package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Cuestionario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class RecomendacionDTO {

    private int id;
    private int valoracion_user;
    private String notas_adicionales;




    private Cuestionario cuestionario;

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
