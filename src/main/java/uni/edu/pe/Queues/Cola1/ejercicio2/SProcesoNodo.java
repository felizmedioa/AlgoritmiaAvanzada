package uni.edu.pe.Queues.Cola1.ejercicio2;

import uni.edu.pe.Queues.Cola1.SNodo;

public class SProcesoNodo {

    String id;
    int timeProcces;

    public  SProcesoNodo(String id, int timeProcces) {
        this.id = id;
        this.timeProcces = timeProcces;
    }

    public String getId() {
        return id;
    }

    public int getTimeProcces() {
        return timeProcces;
    }

    @Override
    public String toString() {
        return ("{" + this.id + ": " + this.timeProcces + " ms }\n");
    }
}
