package uni.edu.pe.Queues.Cola1.ejercicio1;

/*
Problema 1: Inversión de Ingeniería (Simular una Pila usando Colas) - MidEl Problema:Debes crear una clase PilaMágica que se comporte exactamente como una Pila estándar (LIFO: Último en entrar, primero en salir) con los métodos push(x) y pop().La restricción: Como estructura de almacenamiento interno, solo puedes instanciar y usar dos objetos de tu clase SQueue (cola1 y cola2). No puedes usar arreglos ni recursividad.Análisis del reto:Las colas procesan por el frente y las pilas por el final. Tienes que forzar a que el elemento que acabas de encolar sea el primero en desencolarse.Para lograrlo, al hacer push(x), debes encolar x en la cola vacía, y luego vaciar todos los elementos de la otra cola detrás de x. Esto asegura que el elemento más nuevo siempre quede en el frente. Este problema evalúa tu capacidad para combinar operaciones $O(1)$ de colas para alterar el comportamiento temporal de los datos.
 */

public class Ejecuta {
    static void main(String[] args) {
        PilaFalsa<Integer> pila1 = new PilaFalsa<>();

        pila1.push(111);
        pila1.push(222);
        pila1.push(333);
        pila1.push(333);

        pila1.recorre();

        System.out.println(pila1.pop());

        pila1.recorre();
        System.out.println("<-------------------------->");
        System.out.println(pila1.peak);
        System.out.println("<-------------------------->");
        System.out.println("La cabeza es: " + pila1.getHead() + "\nY la cola es: " + pila1.getTail());


    }
}
