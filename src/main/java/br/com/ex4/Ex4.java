package br.com.ex4;

import java.util.Scanner;

public class Ex4 {

    public void teste4() {


        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        for (int contador = 0; contador < a; contador++) {
            String frase = scan.nextLine();

            StringBuilder fraseReversa = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder fraseNormal = new StringBuilder(frase.substring(frase.length() / 2));
            fraseReversa.reverse();
            fraseReversa.reverse();
            System.out.println(fraseReversa.toString() + fraseNormal.toString());
        }
    }

}