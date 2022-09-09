package Exer01;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o tamanho: ");
        int tam = entrada.nextInt();


        for (int i = 0; i <= tam; i++) {
            int[] num = MinhasFuncoes.criarVetor(i);
            for (int j = 0; j < num.length; j++) {
                System.out.print(num[j]+" | ");
            }
            System.out.println("");
        }


    }

}
