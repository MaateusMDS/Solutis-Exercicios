//Um banco concede empréstimo a seus clientes no valor máximo de 30% do valor do seu
//salário liquido. Receba o valor do salário bruto, o valor dos descontos e o valor do possível
//empréstimo de um cliente, em seguida avise se ele poderá ou não fazer o empréstimo.

package conjuntos.dois;

import java.util.Scanner;

public class ExercicioDez {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.print("Qual o valor bruto do seu salário? R: ");
        var salario = entrada.nextDouble();

        System.out.print("Qual o valor total em descontos em seu salário? R: ");
        var descontos = entrada.nextDouble();

        System.out.print("Qual o valor desejado do empréstimo? R: ");
        var emprestimo = entrada.nextDouble();

        if (((salario - descontos) * 0.3) >= emprestimo){
            System.out.println("Empréstimo aprovado");
        } else {
            System.out.println("Emprestimo reprovado. O valor excede o limite para empréstimo.");
        }
    }
}
