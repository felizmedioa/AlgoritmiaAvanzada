package uni.edu.pe.pilaEstudiantes;

public class Ejecuta {

    static void main() {
        Estudiante estudiante1 = new Estudiante(11, 12.2f, "Jose");
        Estudiante estudiante2 = new Estudiante(22, 10.7f, "Jose");

        //System.out.printf(estudiante1.toString());

        SStack pila1 = new SStack();

//        pila1.getNodo(0);

        pila1.push(11);
        pila1.push(22);
        pila1.push(33);
        pila1.push(44);
        pila1.push(55);


//        pila1.recorre();
//        pila1.getNodo(4);
//        pila1.getNodo(5);

        pila1.action();
    }

}
