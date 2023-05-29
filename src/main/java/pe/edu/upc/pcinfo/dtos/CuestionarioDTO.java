package pe.edu.upc.pcinfo.dtos;

public class CuestionarioDTO {
    private int id;
    private String tipo_form;
    private String Uso_de_pc;
    private String Presupuesto;
    private String Tamano_del_PC;
    private String Diseno;
    private String Tipo_de_refrigeracion;
    private boolean Overclocking;
    private String Marca_Procesador;
    private String Programas_used;

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

    public void setTamano_del_PC(String tamano_del_PC) {
        Tamano_del_PC = tamano_del_PC;
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
}
