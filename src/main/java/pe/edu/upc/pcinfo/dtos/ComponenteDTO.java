package pe.edu.upc.pcinfo.dtos;

import pe.edu.upc.pcinfo.entities.Recomendacion;

import javax.persistence.*;

public class ComponenteDTO {

    private int id;
    private Recomendacion recomendacion;
    private String marca;
    private int puntaje;
    private String descripcion;
    private String conjuntodeproductos;
    private String generacion;
    private String nombreprocesador;
    private String litografia;
    private int preciorecomendacion;
    private int velocidadmemoriaram;
    private String tipochipset;
    private String compatibilidad;
    private String tipommr;
    private int velocidadrelojgpu;
    private int tamanioram;
    private String tamanioplacamadre;
    private String zocalo;
    private String tamaniomemoria;
    private String tipoalmacenamiento;
    private String tipofuente;
    private String color;
    private String tamanio;
    private String certificacion;
    private int vatios;
    private String sistemamodular;


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
