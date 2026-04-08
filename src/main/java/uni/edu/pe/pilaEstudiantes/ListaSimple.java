package uni.edu.pe.pilaEstudiantes;

public class ListaSimple {

    Nodo first;
    Nodo last;

    int size;

    public boolean isEmpty(){
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int cod){
        if(isEmpty()) {
            System.out.println("Esta vacio");
            Nodo newNodo = new Nodo(cod);

        } else {
            Nodo newNodo = new Nodo(cod);
            newNodo.next =
        }

    }
}
