//65. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
//        *
//       ***
//      *****
//     *******

package conjuntos.quatro;

import java.util.Scanner;

public class ExercicioSessentaCinco {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas\nR: ");
        int linhas = entrada.nextInt();
        entrada.close();

        int espacoTotal = linhas - 1;

        for (int i = 1; i <= linhas; i++) {
            int espacoEsquerda = espacoTotal - (i - 1);

            for (int j = 0; j < espacoEsquerda; j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

