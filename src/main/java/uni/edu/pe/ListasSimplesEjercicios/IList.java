package uni.edu.pe.ListasSimplesEjercicios;

public interface IList<T> {

    public void addFirst(T e);
    public SNode<T> createNode(T e);
    public boolean isEmpty();
    public void addLast(T e);
    public void removeFirst();
    public void removeLast();
    public String toString();
    public void recorre();
    public void remove(T e);

}
