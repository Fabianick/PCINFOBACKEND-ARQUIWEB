package pe.edu.upc.pcinfo.dtos;

public class UsuarioReporteDTO {
    private String nombre;
    private int reporteCount;
    private String apellidop;
    private String descripcion;

    public UsuarioReporteDTO() {
    }

    public UsuarioReporteDTO(String nombre, int reporteCount, String apellidop, String descripcion) {
        this.nombre = nombre;
        this.reporteCount = reporteCount;
        this.apellidop = apellidop;
        this.descripcion = descripcion;
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

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
