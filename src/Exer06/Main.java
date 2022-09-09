package Exer06;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
                Scanner entrada = new Scanner(System.in);

                int loop = 0;
                do {
                        System.out.print("Digite uma hora: ");
                        int hora = entrada.nextInt();

                        System.out.print("Digite um minuto: ");
                        int minuto = entrada.nextInt();

                        String horaConvertida = MinhasFuncoes.converterHora(hora, minuto, MinhasFuncoes.verificarPeriodo(hora));

                        System.out.println(horaConvertida);

                        System.out.print("Deseja continuar?\n1 - Sim | 2 - Não: ");
                        loop = Integer.parseInt(entrada.nextLine());
                }while(loop != 1);
        }
}
