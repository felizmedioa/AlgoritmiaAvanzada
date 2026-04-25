package uni.edu.pe.A3ejerciciosPilas.ejercicio1;

public class SStack implements IStack{

    SNodo peak;
    int size = 0;
    char prox;

    @Override
    public boolean isEmpty() {
        if(size == 0) return  true;
        return  false;
    }

    @Override
    public void push(char valor) {
        SNodo aux = new SNodo(valor);
        aux.next = peak;
        peak = aux;
        size++;
    }

    public SNodo pop(){
        if(isEmpty()){
            System.out.println("No hay elementos para desapilar");
            return null;
        } else {
            SNodo temp = peak;
            peak = peak.next;
            size--;
            return temp;
        }
    }

    @Override
    public void setProx(char valor) {
        this.prox = valor;
    }

    @Override
    public char getProx() {
        return this.prox;
    }

    @Override
    public boolean isEqual(char valor1, char valor2) {
        if (valor1 == valor2) {
            return true;
        }
        return false;
    }


}
