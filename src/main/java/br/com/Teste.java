package br.com;

import br.com.ex1.Ex1;
import br.com.ex2.Ex2;
import br.com.ex3.Ex3;
import br.com.ex4.Ex4;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class Teste {
    public static void main(String[] args) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("MENU DE OPCOES");
        System.out.println("1 ------- Exercicio 1");
        System.out.println("2 ------- Exercicio 2");
        System.out.println("3 ------- Exercicio 3");
        System.out.println("4 ------- Exercicio 4");

        int op = scan.nextInt();
        switch (op) {
            case 1:
                System.out.println("\n OPCAO ESCOLHIDA:" + op);
                System.out.println("-------------------");
                Ex1 e1 = new Ex1();
                e1.teste();
                break;
            case 2:
                System.out.println("\n OPCAO ESCOLHIDA:" + op);
                System.out.println("-------------------");
                Ex2 e2 = new Ex2();
                e2.teste2();
                break;
            case 3:

                System.out.println("\n OPCAO ESCOLHIDA:" + op);
                System.out.println("-------------------");
                Ex3 ex3 = new Ex3();
                ex3.teste3();
                break;
            case 4:

                System.out.println("\n OPCAO ESCOLHIDA:" + op);
                System.out.println("-------------------");
                Ex4 ex4 = new Ex4();
                ex4.teste4();
                break;
            case 5:
                break;
        }

    }
}
