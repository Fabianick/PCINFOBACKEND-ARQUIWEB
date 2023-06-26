package pe.edu.upc.pcinfo.dtos;

public class RecomendacionCuestionarioDTO {

    private int valoracion_user;
    private String programas_used;

    public RecomendacionCuestionarioDTO() {
    }

    public RecomendacionCuestionarioDTO(int valoracion_user, String programas_used) {
        this.valoracion_user = valoracion_user;
        this.programas_used = programas_used;
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
}
