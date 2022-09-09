package Exer05;

public class Main {

    public static void main(String[] args) {
        double custo = 10000;
        double imposto = 1;
        double custoFinal = MInhasFuncoes.somaImposto(custo, imposto);
        System.out.println("Custo final: " + custoFinal);
    }
}
