package br.com.ex2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

    //Exercício 2

    public void teste2() {
        System.out.println("VALOR:");

        Scanner scan = new Scanner(System.in);
        double total = scan.nextDouble();

        int notas = (int) total;
        int moedas = (int) ((total - notas) * 100);


        int[] notasAux = {100, 50, 20, 10, 5, 2};
        double[] moedasAux = {1, 0.50, 0.25, 0.10, 0.05, 0.01};

        notasAux[0] = notas / 100;
        notas -= notasAux[0] * 100;

        notasAux[1] = notas / 50;
        notas -= notasAux[1] * 50;

        notasAux[2] = notas / 20;
        notas -= notasAux[2] * 20;

        notasAux[3] = notas / 10;
        notas -= notasAux[3] * 10;

        notasAux[4] = notas / 5;
        notas -= notasAux[4] * 5;

        notasAux[5] = notas / 2;
        notas -= notasAux[5] * 2;



        moedasAux[0]-= moedas / 1;
        moedas -= moedasAux[0] * 1;

        moedasAux[1] = moedas / 50;
        moedas -= moedasAux[1] * 50;

        moedasAux[2] = moedas / 25;
        moedas -= moedasAux[2] * 25;

        moedasAux[3] = moedas / 10;
        moedas -= moedasAux[3] * 10;

        moedasAux[4] = moedas / 5;
        moedas -= moedasAux[4] * 5;

        System.out.println("NOTAS -------------------");
        System.out.println(notasAux[0] + " notas de 100");
        System.out.println(notasAux[1] + " notas de 50");
        System.out.println(notasAux[2] + " notas de 20");
        System.out.println(notasAux[3] + " notas de 10");
        System.out.println(notasAux[4] + " notas de 5");
        System.out.println(notasAux[5] + " notas de 2");

        System.out.println("MOEDAS -------------------");
        System.out.println(moedasAux[0] + " moedas de 1");
        System.out.println(moedasAux[1] + " moedas de 0.50");
        System.out.println(moedasAux[2] + " moedas de 0.25");
        System.out.println(moedasAux[3] + " moedas de 0.10");
        System.out.println(moedasAux[4] + " moedas de 0.5");
        System.out.println(moedasAux[5] + " moedas de 0.1");


    }
}

