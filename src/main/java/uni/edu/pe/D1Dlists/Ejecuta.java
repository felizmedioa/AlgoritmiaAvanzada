package uni.edu.pe.D1Dlists;

public class Ejecuta {

    static void main(String[] args) {
        DList<Integer> ListaNums = new DList<>();
        ListaNums.addLast(11);
        ListaNums.addLast(55);
        ListaNums.addLast(33);
        ListaNums.addLast(22);

        ListaNums.recorre();

        ListaNums.removeLast();
        ListaNums.recorre();
        ListaNums.removeFirst();
        ListaNums.recorre();

        ListaNums.insertAt(2, 77);
        ListaNums.recorre();
    }


}
