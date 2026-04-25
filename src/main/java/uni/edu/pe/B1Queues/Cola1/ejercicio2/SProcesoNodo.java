package uni.edu.pe.B1Queues.Cola1.ejercicio2;

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
