//2. Calcule e exiba a quantidade de salários mínimos que um determinado funcionário ganha.
//        Para isto, peça o valor do seu salário e o valor do salário mínimo atual.

package conjuntos.um;

import java.util.Scanner;

public class ExercicioDois {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.print("Qual o valor do salário mínimo? R:");
        double salarioMinimo = entrada.nextDouble();
        System.out.print("Qual o valor do seu salário? R:");
        double salario = entrada.nextDouble();

        double quantSalario = salario/salarioMinimo;

        String mensagem = (quantSalario == 1.0) ? "salário mínimo" : "salários mínimos";

        System.out.println("Você recebe aproximadamente " + quantSalario + " " + mensagem + ".");
    }
}
