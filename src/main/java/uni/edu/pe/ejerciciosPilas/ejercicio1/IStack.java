package uni.edu.pe.ejerciciosPilas.ejercicio1;

public interface IStack {

    public boolean isEmpty();
    public void push(char valor);
    public SNodo pop();
    public void setProx(char valor);
    public char getProx();
    public boolean isEqual(char valor1, char valor2);

    //public void push();

}
