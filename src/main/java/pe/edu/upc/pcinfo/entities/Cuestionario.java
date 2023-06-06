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
    private String Uso_de_pc;
    @Column(name = "presupuesto",length = 60, nullable = false)
    private String Presupuesto;
    @Column(name = "tamano_del_pc",length = 60, nullable = false)
    private String Tamano_del_PC;
    @Column(name = "diseno",length = 60, nullable = false)
    private String Diseno;
    @Column(name = "tipo_de_refrigeracion",length = 60, nullable = false)
    private String Tipo_de_refrigeracion;
    @Column(name = "overclocking")
    private boolean Overclocking;
    @Column(name = "marca_procesador",length = 60, nullable = false)
    private String Marca_Procesador;
    @Column(name = "programas_used",length = 60, nullable = false)
    private String Programas_used;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Cliente cliente;

    public Cuestionario() {
    }

    public Cuestionario(int id, String tipo_form, String uso_de_pc, String presupuesto, String tamano_del_PC, String diseno, String tipo_de_refrigeracion, boolean overclocking, String marca_Procesador, String programas_used, Cliente cliente) {
        this.id = id;
        this.tipo_form = tipo_form;
        this.Uso_de_pc = uso_de_pc;
        this.Presupuesto = presupuesto;
        this.Tamano_del_PC = tamano_del_PC;
        this.Diseno = diseno;
        this.Tipo_de_refrigeracion = tipo_de_refrigeracion;
        this.Overclocking = overclocking;
        this.Marca_Procesador = marca_Procesador;
        this.Programas_used = programas_used;
        this.cliente = cliente;
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
        return Uso_de_pc;
    }

    public void setUso_de_pc(String uso_de_pc) {
        Uso_de_pc = uso_de_pc;
    }

    public String getPresupuesto() {
        return Presupuesto;
    }

    public void setPresupuesto(String presupuesto) {
        Presupuesto = presupuesto;
    }

    public String getTamano_del_PC() {
        return Tamano_del_PC;
    }

    public void setTamano_del_PC(String tamano_del_pc) {
        Tamano_del_PC = tamano_del_pc;
    }

    public String getDiseno() {
        return Diseno;
    }

    public void setDiseno(String diseno) {
        Diseno = diseno;
    }

    public String getTipo_de_refrigeracion() {
        return Tipo_de_refrigeracion;
    }

    public void setTipo_de_refrigeracion(String tipo_de_refrigeracion) {
        Tipo_de_refrigeracion = tipo_de_refrigeracion;
    }

    public boolean isOverclocking() {
        return Overclocking;
    }

    public void setOverclocking(boolean overclocking) {
        Overclocking = overclocking;
    }

    public String getMarca_Procesador() {
        return Marca_Procesador;
    }

    public void setMarca_Procesador(String marca_Procesador) {
        Marca_Procesador = marca_Procesador;
    }

    public String getProgramas_used() {
        return Programas_used;
    }

    public void setProgramas_used(String programas_used) {
        Programas_used = programas_used;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
