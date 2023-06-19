package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;

@Entity
@Table(name="cuestionario")
public class Cuestionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "tipo_form",length = 60, nullable = false)
    private String tipo_form;
    @Column(name = "uso_de_pc",length = 60, nullable = false)
    private String uso_de_pc;
    @Column(name = "presupuesto",length = 60, nullable = false)
    private String presupuesto;
    @Column(name = "tamano_del_pc",length = 60, nullable = false)
    private String tamano_del_pc;
    @Column(name = "diseno",length = 60, nullable = false)
    private String diseno;
    @Column(name = "tipo_de_refrigeracion",length = 60, nullable = false)
    private String tipo_de_refrigeracion;
    @Column(name = "overclocking",length = 60, nullable = false)
    private String overclocking;
    @Column(name = "marca_procesador",length = 60, nullable = false)
    private String marca_procesador;
    @Column(name = "programas_used",length = 60, nullable = false)
    private String programas_used;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    public Cuestionario() {
    }

    public Cuestionario(int id, String tipo_form, String uso_de_pc, String presupuesto, String tamano_del_pc, String diseno, String tipo_de_refrigeracion, String overclocking, String marca_procesador, String programas_used, Usuario usuario) {
        this.id = id;
        this.tipo_form = tipo_form;
        this.uso_de_pc = uso_de_pc;
        this.presupuesto = presupuesto;
        this.tamano_del_pc = tamano_del_pc;
        this.diseno = diseno;
        this.tipo_de_refrigeracion = tipo_de_refrigeracion;
        this.overclocking = overclocking;
        this.marca_procesador = marca_procesador;
        this.programas_used = programas_used;
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo_form() {
        return tipo_form;
    }

    public void setTipo_form(String tipo_form) {
        this.tipo_form = tipo_form;
    }

    public String getUso_de_pc() {
        return uso_de_pc;
    }

    public void setUso_de_pc(String uso_de_pc) {
        this.uso_de_pc = uso_de_pc;
    }

    public String getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getTamano_del_pc() {
        return tamano_del_pc;
    }

    public void setTamano_del_pc(String tamano_del_pc) {
        this.tamano_del_pc = tamano_del_pc;
    }

    public String getDiseno() {
        return diseno;
    }

    public void setDiseno(String diseno) {
        this.diseno = diseno;
    }

    public String getTipo_de_refrigeracion() {
        return tipo_de_refrigeracion;
    }

    public void setTipo_de_refrigeracion(String tipo_de_refrigeracion) {
        this.tipo_de_refrigeracion = tipo_de_refrigeracion;
    }

    public String getOverclocking() {
        return overclocking;
    }

    public void setOverclocking(String overclocking) {
        this.overclocking = overclocking;
    }

    public String getMarca_procesador() {
        return marca_procesador;
    }

    public void setMarca_procesador(String marca_procesador) {
        this.marca_procesador = marca_procesador;
    }

    public String getProgramas_used() {
        return programas_used;
    }

    public void setProgramas_used(String programas_used) {
        this.programas_used = programas_used;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
