package uni.edu.pe.B1Queues.Cola1;

public class SNodo<T> {
    public T nombre;
    public SNodo<T> siguiente = null;
    public SNodo(T identifier){
        this.nombre = identifier;
    }

    @Override
    public String toString() {
        return ("{ Código: " + nombre + "}");
    }
}
