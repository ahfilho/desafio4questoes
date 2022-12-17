package br.com.ex2;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex2 {

    //Exercício 2

    public void teste2() {
        System.out.println("VALOR:");

        Scanner scan = new Scanner(System.in);
        String padrao = "000.00";
        DecimalFormat df = new DecimalFormat(padrao);

        float valor = scan.nextFloat();
        //Notas
        float a = 100;
        float notaDeCem = (int)valor / a;
        float b = notaDeCem%a;
        System.out.println(df.format(notaDeCem+"notas de 100"));


        float a2 = 100;
        float notaDeCinquenta = (int)notaDeCem / a2;
        float b2 = notaDeCinquenta%a;
        System.out.println(df.format(notaDeCinquenta+"notas de 50"));

        float a3 = 100;
        float notaDeVinte = (int)valor / a3;
        float b3 = notaDeVinte%a;
        System.out.println(df.format(notaDeVinte+"notas de 20"));



    }
}

