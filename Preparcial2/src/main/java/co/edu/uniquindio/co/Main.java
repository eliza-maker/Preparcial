package co.edu.uniquindio.co;

import model.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

                Usuario usuarioGratis = new Usuario("U01", "Melany", Usuario.TipoSuscripcion.GRATIS);
                Usuario usuarioPremium = new Usuario("U02", "Isabella", Usuario.TipoSuscripcion.PREMIUM);

                Contenido cancion = new Cancion("C01", "4 babys", 279, "Maluma", "Sencillo");
                Contenido podcast = new Podcast("P01", "Programación Orientada a Objetos", 1800, "Robinson", "1");
                Contenido audioLibro = new AudioLibro("A01", "Amanecer en la cosecha", 40000, "Suzanne Collins", "Elizabeth");

                ReproductorGlobal reproductor1 = ReproductorGlobal.getInstancia();
                ReproductorGlobal reproductor2 = ReproductorGlobal.getInstancia();

                System.out.println("¿Es la misma instancia? " + (reproductor1 == reproductor2));

                reproductor1.iniciarSesion(usuarioGratis);

                reproductor1.reproducirContenido(cancion);
                reproductor1.reproducirContenido(podcast);
                reproductor2.reproducirContenido(audioLibro);
            }
}

