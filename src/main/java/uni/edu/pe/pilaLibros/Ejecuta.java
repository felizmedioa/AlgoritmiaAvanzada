package uni.edu.pe.pilaLibros;

public class Ejecuta {

    static void main(String[] args) {
        //SLibro libro1 = new SLibro("La Ciudad y Los Perros", "Vargas LLosa", 10);
        //SLibro libro2 = new SLibro("Crimen y Castigo", "Fiodor Dovtoiescty", 15);
        //SLibro libro3 = new SLibro("Los Jefes", "Vargas LLosa", 13);

//        System.out.println(libro1);

//        System.out.println(libro2);
//        System.out.println(libro3);

        SStack pilaLibros = new SStack();

        pilaLibros.push("Los Jefes", "Vargas LLosa", 13);
        pilaLibros.push("Crimen y Castigo", "Fiodor Dovtoiescty", 15);
        pilaLibros.push("La Ciudad y Los Perros", "Vargas LLosa", 10);

        System.out.println("<------------------>");

        //System.out.println(pilaLibros.getSize() + " | " + pilaLibros.isEmpty() );

        //pilaLibros.pop();

        //pilaLibros.recorre();

        //pilaLibros.clear();

        pilaLibros.recorre();

        System.out.println(pilaLibros.getSize());
        System.out.println(pilaLibros.contain("Los Jefes"));
        //System.out.println(pilaLibros.getBase().toString());
        pilaLibros.swipTopTwo();
        pilaLibros.recorre();
    }
}
