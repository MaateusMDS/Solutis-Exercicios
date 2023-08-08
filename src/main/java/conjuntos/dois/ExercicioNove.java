//Verifique se o usuário é maior de idade ou não.

package conjuntos.dois;

import java.util.Scanner;

public class ExercicioNove {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        var idade = entrada.nextInt();

        System.out.println((idade >= 18) ? "Maior de idade" : "Menor de idade");

    }
}
