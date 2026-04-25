package uni.edu.pe.A1pilaLibros;

public interface IStack {

    public void push(SLibro newLibro);
    public SLibro pop();
    public boolean isEmpty();
    public Integer getSize();
    public SLibro getPeak();
    public void clear(); //Limpiar la pila completa
    public boolean contain(String name); //Verificar si la pila contiene cierto libro
    public SLibro getBase(); //Obtener el libro del fondo
    public void swipTopTwo(); //Intercambiar Posicion entre el Top1 y Top2
    public void reverse(); //Revierte el orden de la pila

}
