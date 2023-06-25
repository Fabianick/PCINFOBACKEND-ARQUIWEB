package pe.edu.upc.pcinfo.dtos;

public class UsuarioComentarioDTO {

    private String apellidop;
    private String apellidom;
    private int comentarioCount;

    public UsuarioComentarioDTO() {
    }


    public UsuarioComentarioDTO(String apellidop, String apellidom, int comentarioCount) {
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.comentarioCount = comentarioCount;
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
}
