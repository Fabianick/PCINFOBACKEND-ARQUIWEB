package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Usuario;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

public class ClienteDTO {

    private int id;

    private Boolean estado_actividad;

    private int presupuesto;

    private String preferencias;

    private String tipo_pcs;

    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Boolean getEstado_actividad() {
        return estado_actividad;
    }

    public void setEstado_actividad(Boolean estado_actividad) {
        this.estado_actividad = estado_actividad;
    }

    public int getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(int presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getPreferencias() {
        return preferencias;
    }

    public void setPreferencias(String preferencias) {
        this.preferencias = preferencias;
    }

    public String getTipo_pcs() {
        return tipo_pcs;
    }

    public void setTipo_pcs(String tipo_pcs) {
        this.tipo_pcs = tipo_pcs;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
