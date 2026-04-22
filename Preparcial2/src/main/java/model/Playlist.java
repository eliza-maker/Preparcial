package model;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements ComponentePlayList{
    private String nombre;
    private List<ComponentePlayList> hijos = new ArrayList<>();

    public Playlist(String nombre, List<ComponentePlayList> hijos) {
        this.nombre = nombre;
        this.hijos = hijos;
    }

    public void agregar(ComponentePlayList c) { hijos.add(c); }
    public void quitar(ComponentePlayList c) { hijos.remove(c); }

    @Override
    public double duracionTotal() {
        int total = 0;
        for (ComponentePlayList c : hijos) {
            total += c.duracionTotal(); // llamada RECURSIVA
        }
        return total;
    }

    @Override
    public void mostrar(String Indent) {
        System.out.println(Indent + "Playlist:" + nombre);
        for (ComponentePlayList c : hijos) {
            c.mostrar(Indent + " ");
        }
    }
}
