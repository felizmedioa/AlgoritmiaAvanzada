package uni.edu.pe.B1Queues.Cola1.ejercicio3;

import uni.edu.pe.B1Queues.Cola1.SQueue;

public class Ronda<T> extends SQueue<T> {

    private int periodo;

    public Ronda(int period) {
        this.periodo = period;
    }

    public int getPeriodo() {
        return periodo;
    }

    public T killPerson(int period){
        for(int i = 1; i < period; i++){
            this.enqueue(this.dequeue());
        }
        return this.dequeue();
    }

}
