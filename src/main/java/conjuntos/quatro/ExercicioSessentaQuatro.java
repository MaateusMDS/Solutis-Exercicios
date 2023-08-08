//64. Desenhe a seguinte seqüência de triângulos. O usuário determina a quantidade de
//        triângulos.
//        *
//
//        *
//        **
//
//        *
//        **
//        ***
//
//        *
//        **
//        ***
//        ****

package conjuntos.quatro;

import java.util.Scanner;

public class ExercicioSessentaQuatro {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o número de triângulos\nR: ");
        int triangulos = entrada.nextInt();
        entrada.close();

        for (int i = 1; i <= triangulos; i++) {
            for (int j = 1; j <= i; j++) {
                for (int k = 1; k <= j; k++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
