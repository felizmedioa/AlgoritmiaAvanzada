package uni.edu.pe.D1Dlists;

public class DList<T> {

    //Centinelas

    private DNode<T> header;
    private DNode<T> trailer;
    int size = 0;

    public DList() {
        header = new DNode<>(null);
        trailer = new DNode<>(null);
        header.next = trailer;
        trailer.prev = header;
    }

    public T getFirst(){
        if(isEmpty()){
            System.out.println("Lista vacía");
            return null;
        }
        return header.next.value;
    }

    public T getLast(){
        if(isEmpty()){
            System.out.println("Lista vacía");
            return null;
        }
        return trailer.prev.value;
    }

    public void addFirst(T e){
        DNode<T> newNodo = new DNode<>(e);
        newNodo.prev = header;
        newNodo.next = header.next;
        header.next.prev = newNodo;
        header.next = newNodo;
        size++;
    }

    public void addLast(T e){
        DNode<T> newNodo = new DNode<>(e);
        newNodo.prev = trailer.prev;
        newNodo.next = trailer;
        trailer.prev.next = newNodo;
        trailer.prev = newNodo;
        size++;
    }

    public boolean isEmpty(){
        return (size == 0);
    }

    public void removeFirst(){
        if(isEmpty()){
            System.out.println("Lista vacía");
        } else {
            header.next = header.next.next;
            header.next.prev = header;
            size--;
        }
    }

    public void removeLast(){
        if(isEmpty()){
            System.out.println("Lista vacía");
        } else {
            trailer.prev = trailer.prev.prev;
            trailer.prev.next = trailer;
        }
    }

    public int getSize(){
        return size;
    }

    public void insertAt(int pos, T e){
        if(pos > size || pos < 0){
            System.out.println("Posicion Invalida");
            return;
        } else if (pos < size/2) {
            DNode<T> temp = header;
            for(int i = 0; i < pos; i++){
                temp = temp.next;
            }
            DNode<T> newNodo = new DNode<>(e);
            newNodo.next = temp.next;
            newNodo.prev = temp;
            temp.next = newNodo;
            temp.next.prev = newNodo;
            size++;
        } else {
            DNode<T> temp = trailer;
            for(int i = 0; i < (size - pos); i++){
                temp = temp.prev;
            }
            DNode<T> newNodo = new DNode<>(e);
            newNodo.prev = temp.prev;
            newNodo.next = temp;
            temp.prev.next = newNodo;
            temp.prev = newNodo;
            size++;
        }
    }

    public boolean contains(T e){
        boolean encontrado = false;
        DNode<T> temp1 = header, temp2 = trailer;
        for(int i = 0, j = size-1; i < size/2 && j > size/2 && encontrado == false; i++, j--){
            if(temp1.value.equals(e) || temp2.value.equals(e)) encontrado = true;
            else {
                temp1 = temp1.next;
                temp2 = temp2.prev;
            }
        }
        return encontrado;
    }

    public void recorre(){
        String text = "Header -> ";
        DNode<T> temp = header.next;
        while(temp.next != trailer){
            text = (text + temp.value + ", ");
            temp = temp.next;
        }
        text = (text + temp.value + " <- Trailer");
        System.out.println(text);
    }

}
