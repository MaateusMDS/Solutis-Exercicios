//        1. Determine qual é a idade que o usuário faz no ano atual. Para isso solicite o seu ano de
//        nascimento e o ano atual.

package conjuntos.um;

import java.util.Scanner;

public class ExercicioUm {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Em qual ano você nasceu?\nR: ");
        var anoNascimento = entrada.nextInt();

        System.out.print("Qual é o ano atual?\nR: ");
        var anoAtual = entrada.nextInt();

        var idade = anoAtual - anoNascimento;

        System.out.println("Você irá fazer este ano ou já fez " + idade + " anos.");

        entrada.close();
    }
}
