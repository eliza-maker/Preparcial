package model;

public class RuidoDecorator extends Decorator{

    public RuidoDecorator(IReproductor envuelto) {
        super(envuelto);
    }

    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Efecto de aislamiento de ruido aplicado");
    }
}
