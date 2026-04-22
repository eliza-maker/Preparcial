package model;

public class ProxyReproductor implements IReproductor {
    private IReproductor reproductorReal;
    private Usuario usuario;
    private int saltosRealizados;
    private static final int MAX_SALTOS_GRATIS = 3;

    public ProxyReproductor(IReproductor reproductorReal, Usuario usuario) {
        this.reproductorReal = reproductorReal;
        this.usuario = usuario;
        this.saltosRealizados = 0;
    }

    @Override
    public void reproducir(Contenido contenido) {
        if (usuario == null) {
            System.out.println("No hay sesión iniciada.");
            return;
        }

        if (usuario.esPremium()) {
            reproductorReal.reproducir(contenido);
            return;
        }

        System.out.println("Mostrando anuncio para usuario gratuito...");

        if (contenido instanceof AudioLibro) {
            System.out.println("Los audiolibros son solo para usuarios premium.");
            return;
        }

        reproductorReal.reproducir(contenido);
    }

    public boolean puedeSaltar() {
        if (usuario.esPremium()) {
            return true;
        }
        return saltosRealizados < MAX_SALTOS_GRATIS;
    }

    public void saltar() {
        if (puedeSaltar()) {
            saltosRealizados++;
            System.out.println("Salto realizado. Total de saltos: " + saltosRealizados);
        } else {
            System.out.println("Límite de saltos alcanzado para usuarios gratuitos.");
        }
    }
}