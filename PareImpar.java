package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class PareImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros, numero, count = 0, countPar = 0, countImpar = 0, resto = 0;

        System.out.println("Quantidade de numeros: ");
        quantNumeros = scan.nextInt();

        do {
            System.out.println("Numero: ");
            numero = scan.nextInt();
            count = count + 1;
            resto = numero % 2;
            if (resto == 0) {
                countPar = countPar + 1;
            } else {
                countImpar = countImpar + 1;
            }
        } while(count < quantNumeros);
        System.out.println("Pares: " + countPar);
        System.out.println("Impares: " + countImpar);
    }
}
