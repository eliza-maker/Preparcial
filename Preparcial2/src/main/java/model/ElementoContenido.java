package model;

public class ElementoContenido implements  ComponentePlayList{
    private Contenido contenido;

    public ElementoContenido(Contenido contenido) {
        this.contenido = contenido;
    }

    public Contenido getContenido() {
        return contenido;
    }

    @Override
    public double duracionTotal() {
        return contenido.getDuracionSeg();
    }

    @Override
    public void mostrar(String Indent) {
        System.out.println("Indent"+ contenido.getTitulo()+"("+contenido.getDuracionSeg()+" s )");
    }
}
