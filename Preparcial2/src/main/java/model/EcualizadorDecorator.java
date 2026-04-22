package model;

public class EcualizadorDecorator extends Decorator{
    public EcualizadorDecorator(IReproductor envuelto) {
        super(envuelto);
    }

    @Override
    public void reproducir(Contenido c) {
        super.reproducir(c);
        System.out.println("Ecualizador aplicado");
    }
}
