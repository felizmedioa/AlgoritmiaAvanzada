package uni.edu.pe.pilaEstudiantes;

public class PilaSimple {

    Nodo top;

    int size=0      ;

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
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

            return temp.cod;

        }

    }
}
