package model;

public abstract class Contenido {
    protected String id;
    protected String titulo;
    protected double duracionSeg;

    public Contenido(String id, String titulo, double duracionSeg) {
        this.id = id;
        this.titulo = titulo;
        this.duracionSeg = duracionSeg;
    }

    public String getId() {
        return id;
    }


    public String getTitulo() {
        return titulo;
    }


    public double getDuracionSeg() {
        return duracionSeg;
    }


    public abstract void reproducir();


}

