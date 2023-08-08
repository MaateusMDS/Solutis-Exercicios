//61. Desenhe a seguinte pirâmide de asteriscos. O usuário determina a quantidade de linhas.
//        *
//        **
//        ***
//        ****
//        *****
//        ******
//        *******
//        ********
//        *********
//        **********
//        ***********
//        ************

package conjuntos.quatro;

import java.util.Scanner;

public class ExercicioSessentaUm {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas\nR: ");
        int linhas = entrada.nextInt();
        entrada.close();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
