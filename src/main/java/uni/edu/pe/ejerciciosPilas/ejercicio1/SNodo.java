package uni.edu.pe.ejerciciosPilas.ejercicio1;

public class SNodo {

    char code;
    SNodo next = null;

    public SNodo(char code){
        this.code = code;
    }

    @Override
    public String toString() {
        return ("Codigo = " + this.code);
    }
}
