package model;

public class AudioFactory extends ContenidoFactory{

    @Override
    public Contenido crearContenido(String id, String titulo, double duracionSeg, String autor, String narrador) {
        return new AudioLibro(id, titulo, duracionSeg, autor, narrador);
    }
}
