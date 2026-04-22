package model;

public class ReproductorGlobal {
    private static ReproductorGlobal instancia;
    private Usuario usuarioActivo;
    private Contenido contenidoActual;

    private ReproductorGlobal() {
    }

    public static ReproductorGlobal getInstancia() {
        if (instancia == null) {
            instancia = new ReproductorGlobal();
        }
        return instancia;
    }

    public void iniciarSesion(Usuario usuario) {
        this.usuarioActivo = usuario;
        System.out.println("Sesión iniciada para: " + usuario.getNombre());
    }

    public void reproducirContenido(Contenido contenido) {
        if (usuarioActivo == null) {
            System.out.println("No hay usuario con sesión iniciada.");
            return;
        }

        this.contenidoActual = contenido;
        System.out.println("Usuario activo: " + usuarioActivo.getNombre());
        contenido.reproducir();
        System.out.println();
    }

    public Usuario getUsuarioActivo() {
        return usuarioActivo;
    }

    public Contenido getContenidoActual() {
        return contenidoActual;
    }
}

