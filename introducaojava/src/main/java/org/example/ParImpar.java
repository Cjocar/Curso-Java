package org.example;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args){

        int numero;

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite um valor");
        numero = scan.nextInt();

       int resultado = numero % 2;
        //*System.out.println(numero);

        if(resultado == 0){
            System.out.println ("O número " + numero + " é par" );
        }

        else
        {
                System.out.println("O número " + numero + " é impar");
        }


        }


}
