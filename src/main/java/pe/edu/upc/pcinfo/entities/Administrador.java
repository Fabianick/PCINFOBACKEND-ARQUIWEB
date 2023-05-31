package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name="administradores")
public class Administrador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "profesion")
    private String profesion;
    @Column(name = "area_trabajo")
    private String area_trabajo;
    @Column(name = "horario")
    private String horario;
    @Column(name = "cumpleanos")
    private LocalDate cumpleanos;
    @Column(name = "estado_vacaciones")
    private boolean estado_vacaciones;
    @Column(name = "estado_contrato")
    private boolean estado_contrato;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;


    public Administrador() {
    }

    public Administrador(int id, String profesion, String area_trabajo, String horario, LocalDate cumpleanos, boolean estado_vacaciones, boolean estado_contrato, Usuario usuario) {
        this.id = id;
        this.profesion = profesion;
        this.area_trabajo = area_trabajo;
        this.horario = horario;
        this.cumpleanos = cumpleanos;
        this.estado_vacaciones = estado_vacaciones;
        this.estado_contrato = estado_contrato;
        this.usuario = usuario;
    }

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
