package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;

@Entity
@Table(name = "clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "estado_actividad", nullable = false)
    private Boolean estado_actividad;

    @Column(name = "presupuesto", nullable = false)
    private int presupuesto;
    @Column(name = "preferencias", length = 60,  nullable = false)
    private String preferencias;
    @Column(name = "tipo_pcs", length = 60, nullable = false)
    private String tipo_pcs;

    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;

    public Cliente() {
    }

    public Cliente(int id, Boolean estado_actividad, int presupuesto, String preferencias, String tipo_pcs, Usuario usuario) {
        this.id = id;
        this.estado_actividad = estado_actividad;
        this.presupuesto = presupuesto;
        this.preferencias = preferencias;
        this.tipo_pcs = tipo_pcs;
        this.usuario = usuario;
    }

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
