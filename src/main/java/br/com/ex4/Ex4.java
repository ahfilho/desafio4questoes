package br.com.ex4;

import java.util.Scanner;

public class Ex4 {

    public void teste4() {

        Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Número de frases a desembaralhar");
        int a = scan.nextInt();
        System.out.println("Insira a frase");
        for (int contador = 0; contador < a; contador++) {
            String frase = scan2.nextLine();

            StringBuilder fraseReversa = new StringBuilder(frase.substring(0, frase.length() / 2));
            StringBuilder fraseNormal = new StringBuilder(frase.substring(frase.length() / 2));
            fraseReversa.reverse();
            fraseNormal.reverse();
            System.out.println(fraseReversa.toString() + fraseNormal.toString());
        }
    }

}