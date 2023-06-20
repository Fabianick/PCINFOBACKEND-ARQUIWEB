package pe.edu.upc.pcinfo.entities;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "dni",length = 8,nullable = false)
    private int dni;
    @Column(name = "nombre",length = 60,nullable = false)
    private String nombre;
    @Column(name = "apellidop",length = 60,nullable = false)
    private String apellidop;
    @Column(name = "apellidom",length = 60,nullable = false)
    private String apellidom;
    @Column(name = "correo",length = 60,nullable = false)
    private String correo;
    @Column(name = "sexo",length = 60,nullable = false)
    private String sexo;
    @Column(name = "edad",length = 60,nullable = false)
    private int edad;
    @Column(name = "contrasenia",length = 60,nullable = false)
    private String contrasenia;
    @Column(name = "pais",length = 60,nullable = false)
    private String pais;


    public Usuario() {
    }

    public Usuario(int id, int dni, String nombre, String apellidop, String apellidom, String correo, String sexo, int edad, String contrasenia, String pais) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.apellidop = apellidop;
        this.apellidom = apellidom;
        this.correo = correo;
        this.sexo = sexo;
        this.edad = edad;
        this.contrasenia = contrasenia;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
