package model;

public class Podcast extends Contenido{
    private String presentador;
    private int numeroEpisodio;

    public Podcast(String id, String titulo, double duracionSeg, String presentador, int numeroEpisodio) {
        super(id, titulo, duracionSeg);
        this.presentador = presentador;
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void reproducir() {
        System.out.print("Reproduciendo "+titulo+" con "+presentador);
    }
}
