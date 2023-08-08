//A partir da idade informada de um cidadão diga se ele não pode votar (idade inferior a 16),
//        ou se o voto é facultativo (idade menor ou igual a 16, ou maior ou igual a 65), ou ainda se o
//        voto é obrigatório.

package conjuntos.dois;

import java.util.Scanner;

public class ExercicioOnze {
    public static void main(String[] args) {

        var entrada = new Scanner(System.in);

        System.out.println("Qual a sua idade?");
        var idade = entrada.nextInt();

        System.out.println(
                (idade < 16) ? "Você não pode votar." :
                (idade <= 16 || idade >= 65) ? "Seu voto é opcional." : "Seu voto é obrigatório");
    }
}
