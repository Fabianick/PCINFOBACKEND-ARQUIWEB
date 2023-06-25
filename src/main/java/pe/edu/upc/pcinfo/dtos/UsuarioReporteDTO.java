package pe.edu.upc.pcinfo.dtos;

public class UsuarioReporteDTO {
    private String nombre;
    private int reporteCount;

    public UsuarioReporteDTO() {
    }

    public UsuarioReporteDTO(String nombre, int reporteCount) {
        this.nombre = nombre;
        this.reporteCount = reporteCount;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getReporteCount() {
        return reporteCount;
    }

    public void setReporteCount(int reporteCount) {
        this.reporteCount = reporteCount;
    }
}
