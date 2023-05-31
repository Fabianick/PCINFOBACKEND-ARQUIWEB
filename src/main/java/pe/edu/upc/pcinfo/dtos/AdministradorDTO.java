package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Usuario;

import java.time.LocalDate;

public class AdministradorDTO {

    private int id;
    private String profesion;
    private String area_trabajo;
    private String horario;
    private LocalDate cumpleanos;
    private boolean estado_vacaciones;
    private boolean estado_contrato;

    private Usuario usuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getArea_trabajo() {
        return area_trabajo;
    }

    public void setArea_trabajo(String area_trabajo) {
        this.area_trabajo = area_trabajo;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public LocalDate getCumpleanos() {
        return cumpleanos;
    }

    public void setCumpleanos(LocalDate cumpleanos) {
        this.cumpleanos = cumpleanos;
    }

    public boolean isEstado_vacaciones() {
        return estado_vacaciones;
    }

    public void setEstado_vacaciones(boolean estado_vacaciones) {
        this.estado_vacaciones = estado_vacaciones;
    }

    public boolean isEstado_contrato() {
        return estado_contrato;
    }

    public void setEstado_contrato(boolean estado_contrato) {
        this.estado_contrato = estado_contrato;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}

