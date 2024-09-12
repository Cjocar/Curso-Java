package org.example;

import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        int resultado;
        System.out.println("Digite um valor para o resultado");
        resultado = ler.nextInt();


        //int resultado = 1 + 2;
        //System.out.println(resultado);

        /*resultado = resultado -1;
        System.out.println(resultado);

        resultado = resultado * 2;
        System.out.println(resultado);

        resultado = resultado / 2;
        System.out.println(resultado);

        resultado = resultado + 8;
        System.out.println(resultado);*/

      resultado = resultado % 2;
        System.out.println(resultado);

    }


}
