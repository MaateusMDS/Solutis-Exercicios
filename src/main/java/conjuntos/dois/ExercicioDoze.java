//A partir de 3 notas fornecidas de um aluno, informe se ele foi aprovado, ficou de
//        recuperação ou foi reprovado. A média de aprovação é &gt;= 7.0; a média de recuperação é
//        &gt;= 5.0 e &lt; 7.0; e a média do reprovado é &lt; 5.0

package conjuntos.dois;

import java.util.Arrays;
import java.util.Scanner;

public class ExercicioDoze {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int[] notas = new int[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Digite a " + (i + 1) + "ª nota do aluno: ");
            notas[i] = entrada.nextInt();
        }

        entrada.close();

        var media = Arrays.stream(notas).sum()/notas.length;

        System.out.print("O aluno ficou com a média " + media + ". ");

        if (media >= 7.0) {
            System.out.println("Aluno aprovado!");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }
    }
}
