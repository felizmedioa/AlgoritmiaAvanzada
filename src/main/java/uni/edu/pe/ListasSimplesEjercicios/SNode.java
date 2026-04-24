package uni.edu.pe.ListasSimplesEjercicios;

public class SNode<T> {

    T identifier;
    SNode<T> next;

    public SNode(T e){
        this.identifier = e;
    }

}
