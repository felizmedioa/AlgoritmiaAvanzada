package uni.edu.pe.A3ejerciciosPilas.ejercicio1;

import java.util.Scanner;

public class Ejecuta {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena =  sc.nextLine();

        IStack stack = new SStack();

        char[] cadena1 = cadena.toCharArray();

        int count = 0;

        for (char c : cadena1) {

            if( c == '(' || c == '{' || c == '['){
                stack.push(c);
            }

            if( c == ')' || c == '}' || c == ']'){
                char a = stack.pop().code;

                if(c == '}' && a != '{'){
                    System.out.println("Cadena no Balanceada");
                    return;
                } else  if(c == ')' && a != '('){
                    System.out.println("Cadena no Balanceada");
                    return;
                } else if (c == ']' && a != '[') {
                    System.out.println("Cadena no Balanceada");
                    return;
                }

            }


        }

        if(stack.isEmpty()){
            System.out.println("Cadena Balanceada");
        } else {
            System.out.println("Cadena no Balanceada");
        }


    }
}
