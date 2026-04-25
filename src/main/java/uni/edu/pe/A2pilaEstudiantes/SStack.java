package uni.edu.pe.A2pilaEstudiantes;

import java.util.Scanner;

public class SStack implements IStack {

    Nodo top;

    int size=0      ;

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void action(){
        System.out.println("Ingresa la accion a realizar:");

        Scanner sc = new Scanner(System.in);

        Integer option = sc.nextInt();
        if(option==1){
            System.out.println("Ingresa el codigo del estudiante a agregar:");
            int elem = sc.nextInt();
            push(elem);
            action();
        } else if(option==2){
            pop();
            action();
        } else if(option==3){
            System.out.println("Recorriendo...");
            recorre();
            action();
        } else if(option==4){
            System.out.println("Que tan apilado quiere el nodo:");
            int elem = sc.nextInt();
            getNodo(elem);
            action();
        } else if (option==5) {
            System.out.println("Finalizando...");
        }  else if (option==6) {
            System.out.println("Obteniendo Nota mas alta...");
            System.out.println(getCod());
            action();
        } else if (option==7) {
            System.out.println("Obteniendo tamaño...");
            System.out.println(getSize());
            action();
        } else {
            System.out.println("Opcion no válida");
            action();
        }


    }

    public void push(int cod){
        if(isEmpty()) {
            //System.out.println("Esta vacio, agregando codigo Nº" + cod);
            Nodo newNodo = new Nodo(cod);

            top = newNodo;

            size++;
        } else {
            Nodo newNodo = new Nodo(cod);
            newNodo.pre = top;
            top = newNodo;
            size++;
        }
    }

    public int getSize(){
        return size;
    }

    public int getCod(){
        return top.cod;
    }

    public Integer pop(){
        if(isEmpty()){
            System.out.println("No hay elementos para desapilar");
            return null;
        } else {
            Nodo temp = top;
            top = top.pre;
            temp.pre = null;
            size--;
            return temp.cod;
        }
    }

    public void recorre(){
        Nodo elem = top;
        System.out.println("La pila tiene " + size + " elementos:");

        while(elem != null){
            System.out.println(elem.cod);
            elem = elem.pre;
        }
    }

    public Integer getNodo(int pos){
        if(pos + 1 > size){
            System.out.println("Posicion no Válida");
            return null;
        } else if (isEmpty()) {
            System.out.println("Pila Vacía");
            return null;
        } else {
            int count = 0;
            Nodo temp = top;
            while (count != pos){
                count++;
                temp = temp.pre;
            }
            System.out.println(temp.cod);
            return temp.cod;

        }

    }
}
