package model;

public class AudioLibro extends Contenido{
    private String autor;
    private String narrador;

    public AudioLibro(String id, String titulo, double duracionSeg, String autor, String narrador) {
        super(id, titulo, duracionSeg);
        this.autor = autor;
        this.narrador = narrador;
    }

    @Override
    public void reproducir() {
        System.out.print("Reproduciendo "+titulo+" de "+autor+ " por "+narrador);
    }
}
