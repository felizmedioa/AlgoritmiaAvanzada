package uni.edu.pe.ejerciciosPilas.ejercicio2;

public class SStack implements IStack{

    int size=0;

    SNodo peak;

    @Override
    public void push(int num) {
        SNodo newNodo = new SNodo(num);
        if(isEmpty()){
            peak = newNodo;
            size++;
        } else {
            newNodo.next = peak;
            peak = newNodo;
            size++;
        }
    }

    @Override
    public SNodo pop() {
        if(isEmpty()){
            System.out.println("Pila vacia");
            return null;
        } else {
            SNodo temp = peak;
            peak = peak.next;
            temp.next = null;
            size--;
            return temp;
        }
    }

    @Override
    public boolean isEmpty() {
        if(size==0) return true;
        return false;

    }

    @Override
    /*
    public void ordenarNums() {

        for(int i = 0; i < size; i++){
            SNodo temp1 = peak;
            SNodo temp2 = peak.next;
            while(temp2 != null){
                if(temp1.val > temp2.val){
                    int i1 = temp1.val;
                    temp1.val = temp2.val;
                    temp2.val = i1;
                }
                temp1 = temp2;
                temp2 = temp2.next;
            }
        }
        System.out.println("Lista Ordenada");
    }
    */
    //65283 ->
    //652 -> 3 | 8
    //65 -> 38 | 2
    public void ordenarNums(){
        SStack pilaTemp = new SStack();
        while(!this.isEmpty()){

            int temp = this.pop().val;

                while (temp < pilaTemp.peak.val && !pilaTemp.isEmpty()){
                    this.push(pilaTemp.pop().val);
                }
                pilaTemp.push(temp);

        }

        while(!pilaTemp.isEmpty()){
            this.push(pilaTemp.pop().val);
        }

    }

    @Override
    public void recorre() {
        SNodo temp = peak;

        while(temp != null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }


}
