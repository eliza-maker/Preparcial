package model;

public class GravesDecorator extends Decorator{
    public GravesDecorator(IReproductor envuelto) {
        super(envuelto);
    }

    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Aumento de graves aplicado");
    }
}
