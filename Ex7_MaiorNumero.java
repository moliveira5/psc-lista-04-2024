package Lista4;

/*
Faça um programa que leia 5 números e informe o maior número.
*/

import java.util.Scanner;

public class Ex7_MaiorNumero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int[] numeros = new int[5];
        int maior = 0;

        System.out.println("Informe 5 numeros do tipo inteiro: ");
        for (int i = 0; i < 5; i++)
        {
            numeros[i] = input.nextInt();
        }

        for (int numero : numeros) 
        {
            if (numero > maior) 
                maior = numero;
        }

        System.out.println("Dentre os numeros informados, o maior e: " + maior);

        input.close();
    }
}
