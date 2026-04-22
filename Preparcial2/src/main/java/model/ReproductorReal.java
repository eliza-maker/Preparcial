package model;

public class ReproductorReal implements IReproductor{
    @Override
    public void reproducir(Contenido c) {
        System.out.println("Reproduciendo"+ c.getTitulo());
        c.reproducir();
    }
}