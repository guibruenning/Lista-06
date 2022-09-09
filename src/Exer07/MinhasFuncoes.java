package Exer07;

public class MinhasFuncoes {

    protected static double valorPagamento(double valorParcelas, int dias){
        double valorTotal = valorParcelas;
        if(dias > 0)
            valorTotal = valorParcelas + (valorParcelas * 0.03)+(dias * 0.01);

        return valorTotal;
    }
}
