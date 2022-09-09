package Exer07;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double valorPrestacao = 0;
        Scanner entrada = new Scanner(System.in);

        do {
            System.out.print("Valor da prestação: ");
            valorPrestacao = Double.parseDouble(entrada.nextLine());

            if(valorPrestacao != 0) {
                System.out.print("Dias em atraso: ");
                int dias = Integer.parseInt(entrada.nextLine());

                System.out.println("Valor a pagar é: " + MinhasFuncoes.valorPagamento(valorPrestacao, dias));
            }
        }while(valorPrestacao != 0);

    }

}
