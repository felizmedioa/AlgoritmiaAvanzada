package uni.edu.pe.B1Queues.Cola1.ejercicio3;

/**
 * PROBLEMA 3: EL SOBREVIVIENTE (Problema de Josephus)
 * ---------------------------------------------------
 * OBJETIVO:
 * Hay 'N' personas sentadas en un círculo esperando ser eliminadas.
 * Se empieza a contar desde la persona 1. Se salta a (K-1) personas,
 * y la persona número 'K' es eliminada. El ciclo se repite con las
 * personas restantes, empezando la cuenta desde la siguiente persona
 * viva, hasta que solo queda un sobreviviente.
 *
 * RESTRICCIONES TÉCNICAS:
 * 1. NO usar fórmulas matemáticas de recurrencia.
 * 2. NO usar Arreglos (Arrays), ni Listas (ArrayList/LinkedList).
 * 3. DEBES resolverlo simulando el proceso utilizando ÚNICAMENTE
 * una instancia de tu clase genérica: SQueue<Integer>
 *
 * EJEMPLO DE PRUEBA:
 * Entrada: N = 5, K = 2
 * Proceso:
 * - Inicio: [1, 2, 3, 4, 5]
 * - Se elimina el 2. Quedan: [1, 3, 4, 5]
 * - Se elimina el 4. Quedan: [1, 3, 5]
 * - Se elimina el 1. Quedan: [3, 5]
 * - Se elimina el 5. Queda:  [3]
 * Salida esperada: 3
 */

public class Ejecuta {


    static void main(String[] args) {


        Ronda<Integer> RondaPersonas = new Ronda<>(3);

        for (int i = 1; i <= 10; i++) {
            RondaPersonas.enqueue(i);
        }

        int longer = RondaPersonas.getSize();

        RondaPersonas.recorre();
        for (int i = 1; i < longer; i++) {
            RondaPersonas.killPerson(RondaPersonas.getPeriodo());
            RondaPersonas.recorre();
        }


    }
}
