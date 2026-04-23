package uni.edu.pe.Queues.Cola1.ejercicio2;

import uni.edu.pe.Queues.Cola1.SNodo;
import uni.edu.pe.Queues.Cola1.SQueue;

public class colaProcesos<T> extends SQueue<T> {

    int timeLimit;

    public colaProcesos(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    /*
    public T ejecutarCiclo(){

        SNodo<T> temp = new SNodo<>(this.dequeue());

        if(temp.nombre >){

        }

    }
    */
}
