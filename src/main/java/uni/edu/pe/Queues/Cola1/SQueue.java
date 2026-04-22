package uni.edu.pe.Queues.Cola1;

public class SQueue<T> implements IQueue<T>{

    protected SNodo<T> head;
    protected SNodo<T> tail;
    int size = 0;

    @Override
    public void enqueue(T name) {
        if(isEmpty()){
            head = new SNodo<>(name);
            tail = head;
        } else {
            SNodo<T> newNodo = new SNodo<>(name);
            tail.siguiente = newNodo;
            tail = newNodo;
        }
        size++;
    }

    @Override
    public T dequeue() {
        if(isEmpty()){
            System.out.println("Pila vacia");
            return null;
        } else {
            SNodo<T> temp = head;
            head = head.siguiente;
            temp.siguiente = null;
            return temp.nombre;
        }

    }

    @Override
    public boolean isEmpty() {
        if(size == 0) return true;
        return false;
    }

    @Override
    public T getHead() {
        return head.nombre;
    }

    @Override
    public T getTail() {
        return tail.nombre;
    }

    @Override
    public void recorre() {
        SNodo<T> temp = head;
        String text = "[";
        while(temp != null){
            if(temp == tail){
                text = text + temp.nombre + "]";
            } else {
                text = text + temp.nombre + ", ";
            }
            temp = temp.siguiente;
        }
        System.out.println(text);
    }
}
