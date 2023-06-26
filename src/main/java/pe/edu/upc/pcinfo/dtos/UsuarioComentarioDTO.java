package pe.edu.upc.pcinfo.dtos;

import java.time.LocalDate;
import java.util.Date;

public class UsuarioComentarioDTO {


    private String nombre;
    private String apellidop;
    private String apellidom;
    private int comentarioCount;
    private String comentario;
    private LocalDate fecha;

    public UsuarioComentarioDTO() {
    }

    public UsuarioComentarioDTO(String nombre, String apellidop, String apellidom, int comentarioCount, String comentario, LocalDate fecha) {
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.comentarioCount = comentarioCount;
        this.comentario = comentario;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidop() {
        return apellidop;
    }

    public void setApellidop(String apellidop) {
        this.apellidop = apellidop;
    }

    public String getApellidom() {
        return apellidom;
    }

    public void setApellidom(String apellidom) {
        this.apellidom = apellidom;
    }

    public int getComentarioCount() {
        return comentarioCount;
    }

    public void setComentarioCount(int comentarioCount) {
        this.comentarioCount = comentarioCount;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
}
