package uni.edu.pe.D1Dlists;

public class DNode<T> {
    DNode<T> next;
    DNode<T> prev;
    T value;

    public DNode(T value) {
        this.value = value;
    }
}
