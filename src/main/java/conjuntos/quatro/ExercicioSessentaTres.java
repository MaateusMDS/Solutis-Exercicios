//63. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
//        01
//        01 02
//        01 02 03
//        01 02 03 04
//        01 02 03 04 05
//        01 02 03 04 05 06
//        01 02 03 04 05 06 07
//        01 02 03 04 05 06 07 08
//        01 02 03 04 05 06 07 08 09
//        01 02 03 04 05 06 07 08 09 10
//        01 02 03 04 05 06 07 08 09 10 11

package conjuntos.quatro;

import java.util.Scanner;

public class ExercicioSessentaTres {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas\nR: ");
        int linhas = entrada.nextInt();
        entrada.close();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", j);
            }
            System.out.println();
        }
    }
}
