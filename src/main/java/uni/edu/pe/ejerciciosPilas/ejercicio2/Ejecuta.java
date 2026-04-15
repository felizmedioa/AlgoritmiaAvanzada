package uni.edu.pe.ejerciciosPilas.ejercicio2;

public class Ejecuta {

    static void main(String[] args) {
        Integer[] lista = {6,5,2,8,3};


        SStack pila = new SStack();

        for(Integer n : lista) {
            pila.push(n);
        }

        pila.recorre();
        pila.ordenarNums();
        pila.recorre();

    }

}
