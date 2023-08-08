//62. Desenhe a seguinte pirâmide de números. O usuário determina a quantidade de linhas.
//        01
//        02 02
//        03 03 03
//        04 04 04 04
//        05 05 05 05 05
//        06 06 06 06 06 06
//        07 07 07 07 07 07 07
//        08 08 08 08 08 08 08 08
//        09 09 09 09 09 09 09 09 09
//        10 10 10 10 10 10 10 10 10 10
//        11 11 11 11 11 11 11 11 11 11 11

package conjuntos.quatro;

import java.util.Scanner;

public class ExercicioSessentaDois {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o número de linhas\nR: ");
        int linhas = entrada.nextInt();
        entrada.close();

        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%02d ", i);
            }
            System.out.println();
        }
    }
}
