package model;

public class CancionFactory extends ContenidoFactory{


    @Override
    public Contenido crearContenido(String id, String titulo, double duracionSeg, String artista, String album) {
        return new Cancion (id, titulo, duracionSeg, artista, album);
    }
}
