package model;

public class Cancion extends Contenido{
    private String artista;
    private String album;

    public Cancion(String id, String titulo, double duracionSeg, String artista, String album) {
        super(id, titulo, duracionSeg);
        this.artista = artista;
        this.album = album;
    }

    @Override
    public void reproducir() {
        System.out.print("Reproduciendo "+titulo+" de "+artista);
    }



}
