package br.com.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {

    public void teste() {

        //Exercício 1

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O NÚMERO DE LINHAS QUE VOCÊ DESEJA: \n");

        StringTokenizer token;
        int numeroDeLinhas = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("INFORME OS NÚMEROS");

        int c = 0;
        while (c < numeroDeLinhas) {
            c++;
            token = new StringTokenizer(scan.nextLine());
            arr.add(Integer.parseInt(token.nextToken()));
        }
        var par = arr.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var impar = arr.stream().filter(l -> l % 2 != 0).sorted().collect(Collectors.toList());

        List<Integer> resultPar = new ArrayList<>();
        List<Integer> resultImpar = new ArrayList<>();

        resultPar.addAll(par);
        resultImpar.addAll(impar);
        for (Integer item1 : resultPar
        ) {
            System.out.println(item1);
        }
        for (Integer item2 : resultImpar
        ) {
            System.out.println(item2);
        }

    }

}
