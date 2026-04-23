package uni.edu.pe.Queues.Cola1;

public interface IQueue<T> {

    public void enqueue(T name);
    public T dequeue();
    public boolean isEmpty();
    public T getHead();
    public T getTail();
    public void recorre();
    public int getSize();
}
