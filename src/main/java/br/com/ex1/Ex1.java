package br.com.ex1;

import java.util.*;
import java.util.stream.Collectors;

public class Ex1 {

    public void teste() {

        //Exercício 1

        Scanner scan = new Scanner(System.in);

        System.out.println("DIGITE O NÚMERO DE LINHAS QUE VOCÊ DESEJA: \n");

        StringTokenizer token;
        int linhas = Integer.parseInt(scan.nextLine());
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("INFORME OS NÚMEROS");

        int c = 0;
        while (c < linhas) {
            c++;
            token = new StringTokenizer(scan.nextLine());
            arr.add(Integer.parseInt(token.nextToken()));
        }
        var par = arr.stream().filter(l -> l % 2 == 0).sorted().collect(Collectors.toList());
        var impar = arr.stream().filter(l -> l % 2 != 0).sorted().collect(Collectors.toList());

        ArrayList<List<Integer>> result = new ArrayList<>();

        result.addAll(Collections.singleton(par));
        result.addAll(Collections.singleton(impar));
        for (List<Integer> item : result
        ) {
            System.out.print("\n" + item);
        }

    }

}
