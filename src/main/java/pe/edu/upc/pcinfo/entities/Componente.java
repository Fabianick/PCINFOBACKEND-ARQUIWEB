package pe.edu.upc.pcinfo.entities;



import javax.persistence.*;

@Entity
@Table(name = "componente")
public class Componente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "recomendacion")
    private Recomendacion recomendacion;

    @Column(name = "marca")
    private String marca;

    @Column(name = "puntaje")
    private int puntaje;

    @Column(name = "descripcion")
    private String descripcion;

    @Column(name = "conjuntodeproductos")
    private String conjuntodeproductos;

    @Column(name = "generacion")
    private String generacion;

    @Column(name = "nombreprocesador")
    private String nombreprocesador;

    @Column(name = "litografia")
    private String litografia;

    @Column(name = "preciorecomendacion")
    private int preciorecomendacion;

    @Column(name = "velocidadmemoriaram")
    private int velocidadmemoriaram;

    @Column(name = "tipochipset")
    private String tipochipset;

    @Column(name = "compatibilidad")
    private String compatibilidad;

    @Column(name = "tipommr")
    private String tipommr;

    @Column(name = "velocidadrelojgpu")
    private int velocidadrelojgpu;

    @Column(name = "tamanioram")
    private int tamanioram;

    @Column(name = "tamanioplacamadre")
    private String tamanioplacamadre;

    @Column(name = "zocalo")
    private String zocalo;

    @Column(name = "tamaniomemoria")
    private String tamaniomemoria;

    @Column(name = "tipoalmacenamiento")
    private String tipoalmacenamiento;

    @Column(name = "tipofuente")
    private String tipofuente;

    @Column(name = "color")
    private String color;

    @Column(name = "tamanio")
    private String tamanio;

    @Column(name = "certificacion")
    private String certificacion;

    @Column(name = "vatios")
    private int vatios;

    @Column(name = "sistemamodular")
    private String sistemamodular;

    public Componente() {
    }


    public Componente(int id, Recomendacion recomendacion, String marca, int puntaje, String descripcion, String conjuntodeproductos, String generacion, String nombreprocesador, String litografia, int preciorecomendacion, int velocidadmemoriaram, String tipochipset, String compatibilidad, String tipommr, int velocidadrelojgpu, int tamanioram, String tamanioplacamadre, String zocalo, String tamaniomemoria, String tipoalmacenamiento, String tipofuente, String color, String tamanio, String certificacion, int vatios, String sistemamodular) {
        this.id = id;
        this.recomendacion = recomendacion;
        this.marca = marca;
        this.puntaje = puntaje;
        this.descripcion = descripcion;
        this.conjuntodeproductos = conjuntodeproductos;
        this.generacion = generacion;
        this.nombreprocesador = nombreprocesador;
        this.litografia = litografia;
        this.preciorecomendacion = preciorecomendacion;
        this.velocidadmemoriaram = velocidadmemoriaram;
        this.tipochipset = tipochipset;
        this.compatibilidad = compatibilidad;
        this.tipommr = tipommr;
        this.velocidadrelojgpu = velocidadrelojgpu;
        this.tamanioram = tamanioram;
        this.tamanioplacamadre = tamanioplacamadre;
        this.zocalo = zocalo;
        this.tamaniomemoria = tamaniomemoria;
        this.tipoalmacenamiento = tipoalmacenamiento;
        this.tipofuente = tipofuente;
        this.color = color;
        this.tamanio = tamanio;
        this.certificacion = certificacion;
        this.vatios = vatios;
        this.sistemamodular = sistemamodular;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Recomendacion getRecomendacion() {
        return recomendacion;
    }

    public void setRecomendacion(Recomendacion recomendacion) {
        this.recomendacion = recomendacion;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getConjuntodeproductos() {
        return conjuntodeproductos;
    }

    public void setConjuntodeproductos(String conjuntodeproductos) {
        this.conjuntodeproductos = conjuntodeproductos;
    }

    public String getGeneracion() {
        return generacion;
    }

    public void setGeneracion(String generacion) {
        this.generacion = generacion;
    }

    public String getNombreprocesador() {
        return nombreprocesador;
    }

    public void setNombreprocesador(String nombreprocesador) {
        this.nombreprocesador = nombreprocesador;
    }

    public String getLitografia() {
        return litografia;
    }

    public void setLitografia(String litografia) {
        this.litografia = litografia;
    }

    public int getPreciorecomendacion() {
        return preciorecomendacion;
    }

    public void setPreciorecomendacion(int preciorecomendacion) {
        this.preciorecomendacion = preciorecomendacion;
    }

    public int getVelocidadmemoriaram() {
        return velocidadmemoriaram;
    }

    public void setVelocidadmemoriaram(int velocidadmemoriaram) {
        this.velocidadmemoriaram = velocidadmemoriaram;
    }

    public String getTipochipset() {
        return tipochipset;
    }

    public void setTipochipset(String tipochipset) {
        this.tipochipset = tipochipset;
    }

    public String getCompatibilidad() {
        return compatibilidad;
    }

    public void setCompatibilidad(String compatibilidad) {
        this.compatibilidad = compatibilidad;
    }

    public String getTipommr() {
        return tipommr;
    }

    public void setTipommr(String tipommr) {
        this.tipommr = tipommr;
    }

    public int getVelocidadrelojgpu() {
        return velocidadrelojgpu;
    }

    public void setVelocidadrelojgpu(int velocidadrelojgpu) {
        this.velocidadrelojgpu = velocidadrelojgpu;
    }

    public int getTamanioram() {
        return tamanioram;
    }

    public void setTamanioram(int tamanioram) {
        this.tamanioram = tamanioram;
    }

    public String getTamanioplacamadre() {
        return tamanioplacamadre;
    }

    public void setTamanioplacamadre(String tamanioplacamadre) {
        this.tamanioplacamadre = tamanioplacamadre;
    }

    public String getZocalo() {
        return zocalo;
    }

    public void setZocalo(String zocalo) {
        this.zocalo = zocalo;
    }

    public String getTamaniomemoria() {
        return tamaniomemoria;
    }

    public void setTamaniomemoria(String tamaniomemoria) {
        this.tamaniomemoria = tamaniomemoria;
    }

    public String getTipoalmacenamiento() {
        return tipoalmacenamiento;
    }

    public void setTipoalmacenamiento(String tipoalmacenamiento) {
        this.tipoalmacenamiento = tipoalmacenamiento;
    }

    public String getTipofuente() {
        return tipofuente;
    }

    public void setTipofuente(String tipofuente) {
        this.tipofuente = tipofuente;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getCertificacion() {
        return certificacion;
    }

    public void setCertificacion(String certificacion) {
        this.certificacion = certificacion;
    }

    public int getVatios() {
        return vatios;
    }

    public void setVatios(int vatios) {
        this.vatios = vatios;
    }

    public String getSistemamodular() {
        return sistemamodular;
    }

    public void setSistemamodular(String sistemamodular) {
        this.sistemamodular = sistemamodular;
    }
}
