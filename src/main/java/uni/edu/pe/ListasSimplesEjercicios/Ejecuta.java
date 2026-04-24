package uni.edu.pe.ListasSimplesEjercicios;

public class Ejecuta {

    static void main(String[] args) {
        SList<Integer> listNums = new SList<>();


        listNums.addLast(111);
        listNums.addLast(222);
        listNums.addLast(333);
        listNums.addLast(444);
        listNums.addLast(555);

        listNums.recorre();

        listNums.removeFirst();
        listNums.recorre();
        listNums.remove(222);
        listNums.recorre();



    }

}
