package br.com.ex3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex3 {

    public void teste3() {

        System.out.println("Digite um numero VALOR ALVO:");

        Scanner alvo = new Scanner(System.in);
        int a = alvo.nextInt();
        if (a == 0) {
            System.out.println(" Não pode ser vazio, escolha um numero");
        }

        ArrayList<Integer> inteiros = new ArrayList<Integer>();

        ArrayList<Integer> pares = new ArrayList<Integer>();
//        ArrayList<Integer> impares = new ArrayList<Integer>();

        System.out.println("Preencha a lista com números");


        int contador = 0;

//        while (contador < a) {
        for (int c = 0; c < a; c++) {
            Scanner scan2 = new Scanner(System.in);

//            contador++;
            inteiros.add(scan2.nextInt());
            if (inteiros.get(c) % 2 == a) {
                pares.add(inteiros.get(contador));
            }
//        }
//        Collections.sort(pares);
//        Collections.sort(impares);
//        Collections.reverse(impares);

            System.out.println("NUMEROS PARES: \n");
            for (int numerosPares : pares
            ) {
                System.out.println(numerosPares);
            }

            alvo.close();
        }
    }
}
