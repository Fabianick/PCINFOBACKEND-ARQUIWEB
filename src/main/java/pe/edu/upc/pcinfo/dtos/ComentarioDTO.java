package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Cliente;

import java.time.LocalDate;

public class ComentarioDTO {
    private int id;
    private String comentario;
    private LocalDate fecha;

    private Cliente cliente;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
