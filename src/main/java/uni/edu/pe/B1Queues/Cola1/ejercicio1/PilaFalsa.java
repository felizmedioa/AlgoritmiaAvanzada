package uni.edu.pe.B1Queues.Cola1.ejercicio1;

import uni.edu.pe.B1Queues.Cola1.SNodo;
import uni.edu.pe.B1Queues.Cola1.SQueue;

public class PilaFalsa<T> extends SQueue<T> {

    SNodo<T> peak;
    int size = 0;

    public void push(T code){
        this.enqueue(code);
        peak = this.tail;
        int rotaciones = size;
        for(int i = 0; i < rotaciones; i++){
            this.enqueue(dequeue());
        }
        size++;
    }

    public T pop(){
        T temp = dequeue();
        peak = head;
        size--;
        return temp;
    }

    @Override
    public void recorre() {
        SNodo<T> temp = peak;
        while (temp != null){
            System.out.println(temp);
            temp = temp.siguiente;
        }
    }
}
