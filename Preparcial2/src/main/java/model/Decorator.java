package model;

public abstract class Decorator implements  IReproductor{
    protected IReproductor envuelto;

    public Decorator(IReproductor envuelto) {
        this.envuelto = envuelto;
    }

    @Override
    public void reproducir(Contenido c) {
        envuelto.reproducir(c);
    }
}
