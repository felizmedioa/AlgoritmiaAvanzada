package uni.edu.pe.C1ListasSimplesEjercicios;

public class SList<T> implements IList<T>{

    int size;
    SNode<T> first;
    SNode<T> last;

    @Override
    public void addFirst(T e) {
        if(isEmpty()){
            first = createNode(e);
            last = first;
        } else {
            SNode<T> newNodo = createNode(e);
            newNodo.next = first;
            first = newNodo;
        }
        size++;
    }

    @Override
    public SNode<T> createNode(T e) {
        return new SNode<>(e);
    }

    @Override
    public boolean isEmpty() {
        return (size == 0);
    }



    @Override
    public void addLast(T e) {
        SNode<T> newNodo = new SNode<>(e);
        if(isEmpty()){
            last = newNodo;
            first = last;
        } else {
            last.next = newNodo;
            last = newNodo;
        }
        size++;
    }

    @Override
    public void removeFirst() {
        if (isEmpty()){
            System.out.println("Lista Vacia, Imposible remover");
        } else {
            first = first.next;
            size--;
        }
    }

    @Override
    public void removeLast() {
        if(isEmpty()){
            System.out.println("Lista vacía");
        } else {
            if(size == 1){
                first = null;
                last = null;
                size--;
                return;
            }
            SNode<T> temp = first;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            temp.next = null;
            size--;
            last = temp;
        }
    }

    @Override
    public void recorre() {
        if(isEmpty()) return;
        SNode<T> temp = first;
        String text = ("first -> ");
        while(temp.next != null){
            text = (text + temp.identifier + ", ");
            temp = temp.next;
        }
        text = (text + temp.identifier + " <- last");
        System.out.println(text);
    }

    @Override
    public void remove(T e) {
        if(isEmpty()){
            System.out.println("Lista vacía: No se puede buscar");
            return;
        } else if(first.identifier.equals(e)){
            removeFirst();
            return;
        }
        SNode<T> temp1 = first;
        boolean encontrado = false;
        while(temp1.next != null && !encontrado){
            if(temp1.next.identifier.equals(e)) encontrado = true;
            else temp1 = temp1.next;
        }
        if(encontrado) {
            temp1.next = temp1.next.next;
            size--;
            if (temp1.next == null){
                last = temp1;
            }
        } else {
            System.out.println("Elemento no encontrado: No se puede quitar");
        }
    }

    @Override
    public void removeAll(T e) {
        if(isEmpty()) {
            System.out.println("Lista vacía");
            return;
        }
        boolean exist = false;
        while (first.identifier.equals(e)){
            removeFirst();
            exist = true;
        }
        if(first == null) return;
        SNode<T> temp = first;

        while(temp.next != null){
            if(temp.next.identifier.equals(e)) {
                exist = true;
                temp.next = temp.next.next;
                size--;
                if(temp.next == null) last = temp;
            }
            else {
                temp = temp.next;
            }
        }
        if(exist == false) System.out.println("La lista no contiene este elemento");
    }

}
