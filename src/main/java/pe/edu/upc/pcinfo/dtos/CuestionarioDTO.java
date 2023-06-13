package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Cliente;

public class CuestionarioDTO {
    private int id;
    private String tipo_form;
    private String uso_de_pc;
    private String presupuesto;
    private String tamano_del_pc;
    private String diseno;
    private String tipo_de_refrigeracion;
    private String overclocking;
    private String marca_procesador;
    private String programas_used;

    private Cliente cliente;

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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
