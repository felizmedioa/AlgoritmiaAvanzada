package uni.edu.pe.A1pilaLibros;

public class SStack implements IStack {

    SLibro peak;
    Integer size = 0;

    @Override
    public void push(SLibro newLibro) {
        //SLibro newLibro = new SLibro(name, autor, page);
        if(isEmpty()){
            peak = newLibro;
        } else {
            newLibro.next = peak;
            peak = newLibro;
        }
        //System.out.println("Agregando Libro a la Pila...");
        //System.out.println(newLibro.toString());
        size++;
    }

    @Override
    public SLibro pop() {

        if (isEmpty()){
            System.out.println("No hay elementos para quitar");
            return null;
        } else {
            SLibro elem = peak;
            peak = peak.next;
            elem.next = null;
            //System.out.println("Eliminando elemento = " + elem.toString());
            size--;
            return elem;
        }
    }

    @Override
    public boolean isEmpty() {
        if(size == 0) return true;
        else return false;
    }

    @Override
    public Integer getSize() {
        return size;
    }

    @Override
    public SLibro getPeak() {
        if(isEmpty()) {
            System.out.println("Pila Vacía");
            return null;
        }
        return peak;
    }

    public void recorre(){
        if(isEmpty()){
            System.out.println("La Pila de Libros se encuentra Vacía");
        } else {
            SLibro temp = peak;
            while (temp != null){
                System.out.println(temp.toString());
                temp = temp.next;
            }

        }
    }

    @Override
    public void clear() {
        SLibro temp = peak;

        while (peak != null){
            peak = temp.next;
            temp.next = null;
            temp = peak;
            size--;
        }
        System.out.println("Pila Limpia");
    }

    @Override
    public boolean contain(String name) {
        if(isEmpty()){
            System.out.println("Pila Vacía");
            return false;
        } else {
            SLibro temp = peak;
            while (temp != null){
                System.out.println(temp.getName() + " | " + name);
                if(temp.getName() == name) return true;
                temp = temp.next;
            }
            return false;
        }
    }

    @Override
    public SLibro getBase() {
        if(isEmpty()) return null;
        else {
            SLibro temp = peak;
            while (temp.next != null){
                temp = temp.next;
            }
            return temp;
        }
    }

    @Override
    public void swipTopTwo() {
        if(size < 2){
            System.out.println("Se necesitan al menos 2 elementos en la pila");
        } else  {
            SLibro temp = peak.next;
            peak.next = temp.next;
            temp.next = peak;
            peak = temp;
        }
    }

    @Override
    public void reverse() {
        SStack tempPila =  new SStack();
        while(peak != null){
            tempPila.push(pop());
            size++;
        }
        this.peak = tempPila.peak;
    }
}
