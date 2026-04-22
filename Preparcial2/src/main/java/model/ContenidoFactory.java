package model;

public abstract class ContenidoFactory {
    public abstract Contenido crearContenido(String id, String titulo, double duracionSeg, String atributo1, String atributo2);
}
