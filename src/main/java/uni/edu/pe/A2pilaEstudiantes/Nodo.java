package uni.edu.pe.A2pilaEstudiantes;

public class Nodo {
    int cod;
    Nodo pre;

    public Nodo(int cod){
        this.cod=cod;
    }

    @Override
    public String toString() {
        return "Nodo{" +
                "cod=" + cod +
                '}';
    }

}
