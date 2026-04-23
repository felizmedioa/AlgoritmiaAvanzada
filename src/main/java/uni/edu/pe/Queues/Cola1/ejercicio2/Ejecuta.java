package uni.edu.pe.Queues.Cola1.ejercicio2;

/*
 * OBJETIVO: Procesar tareas con un tiempo límite (Quantum).
 * LÓGICA:
 * 1. Encolar objetos 'Proceso' (id, tiempo).
 * 2. Mientras la cola no esté vacía:
 * - Desencolar proceso.
 * - Restar Quantum al tiempo.
 * - Si tiempo > 0, volver a ENCOLAR al final.
 */
// SQueue<Proceso> planificador = new SQueue<>();

import uni.edu.pe.Queues.Cola1.SNodo;
import uni.edu.pe.Queues.Cola1.SQueue;

public class Ejecuta {

    public boolean compare(SProcesoNodo a, int b){
        if(a.getTimeProcces() > b) return  true;
        return false;
    }

    public void main(String[] args) {
        colaProcesos<SProcesoNodo> ColaTareas = new colaProcesos<>(3);

        ColaTareas.enqueue(new SProcesoNodo("001", 5));
        ColaTareas.enqueue(new SProcesoNodo("002", 11));
        ColaTareas.enqueue(new SProcesoNodo("003", 2));
        ColaTareas.enqueue(new SProcesoNodo("004", 8));
        ColaTareas.enqueue(new SProcesoNodo("005", 7));
        ColaTareas.enqueue(new SProcesoNodo("006", 13));


        ColaTareas.recorre();

        SQueue<String> Tareas = new SQueue<>();

        while(ColaTareas.getSize() > 0){
            SProcesoNodo temp = ColaTareas.dequeue();
            if(this.compare(temp, ColaTareas.timeLimit)){


                System.out.println("Tarea " + temp.id + " {" +  temp.timeProcces + " -> "+ (temp.timeProcces-ColaTareas.timeLimit) + "}");
                temp.timeProcces -= ColaTareas.timeLimit;
                ColaTareas.enqueue(temp);
            } else {
                Tareas.enqueue("Tarea " + temp.id + " completada");
                System.out.println("Tarea " + temp.id + " completada");
            }
        }

        Tareas.recorre();


    }

}
