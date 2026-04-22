package model;

public class Usuario {
    public enum TipoSuscripcion {GRATIS, PREMIUM}

    private String id;
    private String nombre;
    private TipoSuscripcion suscripcion;

    public Usuario(String id, String nombre, TipoSuscripcion suscripcion) {
        this.id = id;
        this.nombre = nombre;
        this.suscripcion = suscripcion;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esPremium() {
        return suscripcion== TipoSuscripcion.PREMIUM;
    }
}
