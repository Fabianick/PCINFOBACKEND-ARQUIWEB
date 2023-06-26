package pe.edu.upc.pcinfo.dtos;

public class RecomendacionCuestionarioDTO {

    private int valoracion_user;
    private String programas_used;

    private String tipo_form;

    private int promedio_valoracion;

    public RecomendacionCuestionarioDTO() {
    }

    public RecomendacionCuestionarioDTO(int valoracion_user, String programas_used, String tipo_form, int promedio_valoracion) {
        this.valoracion_user = valoracion_user;
        this.programas_used = programas_used;
        this.tipo_form = tipo_form;
        this.promedio_valoracion = promedio_valoracion;
    }

    public int getValoracion_user() {
        return valoracion_user;
    }

    public void setValoracion_user(int valoracion_user) {
        this.valoracion_user = valoracion_user;
    }

    public String getProgramas_used() {
        return programas_used;
    }

    public void setProgramas_used(String programas_used) {
        this.programas_used = programas_used;
    }

    public String getTipo_form() {
        return tipo_form;
    }

    public void setTipo_form(String tipo_form) {
        this.tipo_form = tipo_form;
    }

    public int getPromedio_valoracion() {
        return promedio_valoracion;
    }

    public void setPromedio_valoracion(int promedio_valoracion) {
        this.promedio_valoracion = promedio_valoracion;
    }
}
