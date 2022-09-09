package Exer01;

public class MinhasFuncoes {

    protected static int[] criarVetor(int tamanho) {
        int[] v = new int[tamanho];
        for (int i = 0; i < tamanho; i++) {
            v[i] = tamanho;
        }
        return v;
    }

    protected static String mostrar(int[] v) {
        String saida = "";
        for (int i = 0; i < v.length; i++) {
            saida += v[i] + " | ";
        }
        return saida;
    }
}
