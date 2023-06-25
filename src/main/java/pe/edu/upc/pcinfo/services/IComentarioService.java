package pe.edu.upc.pcinfo.services;

import pe.edu.upc.pcinfo.entities.Comentario;

import java.util.List;

public interface IComentarioService {


    public void insert(Comentario comentario);

    List<Comentario> list();

    public void delete(int idComentario);

    public Comentario listId(int idComentario);



}
