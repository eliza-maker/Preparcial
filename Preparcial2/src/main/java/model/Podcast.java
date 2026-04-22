package model;

public class Podcast extends Contenido{
    private String presentador;
    private String numeroEpisodio;

    public Podcast(String id, String titulo, double duracionSeg, String presentador, String numeroEpisodio) {
        super(id, titulo, duracionSeg);
        this.presentador = presentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void reproducir() {
        System.out.print("Reproduciendo "+titulo+" con "+presentador);
    }
}
