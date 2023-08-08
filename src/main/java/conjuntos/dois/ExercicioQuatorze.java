package conjuntos.dois;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ExercicioQuatorze {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Map<String, Integer> meses = new HashMap<>();
        meses.put("janeiro", 1);
        meses.put("fevereiro", 2);
        meses.put("março", 3);
        meses.put("abril", 4);
        meses.put("maio", 5);
        meses.put("junho", 6);
        meses.put("julho", 7);
        meses.put("agosto", 8);
        meses.put("setembro", 9);
        meses.put("outubro", 10);
        meses.put("novembro", 11);
        meses.put("dezembro", 12);

        System.out.print("Digite o nome de um mês: R: ");
        String mes = entrada.next().toLowerCase();
        entrada.close();

        if (meses.containsKey(mes)) {
            int numeroMes = meses.get(mes);
            System.out.println("O mês de " + mes + " é o " + numeroMes + "º mês do ano.");
        } else {
            System.out.println("Mês inválido.");
        }
    }
}