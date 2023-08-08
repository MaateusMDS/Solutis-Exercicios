//Calcule o fatorial de um número.

package conjuntos.tres;

import java.util.Scanner;

public class ExercioTrintaSete {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite um número\nR: ");
        var num = entrada.nextInt();
        var resul = 1;

        for (int i = num; i >= 1; i--) {
            resul *= i;
        }
        System.out.println("O fatorial de 5 é: " + resul + ".");
    }
}
