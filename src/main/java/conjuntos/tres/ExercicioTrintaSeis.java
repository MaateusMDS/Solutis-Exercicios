//Exiba todos os números ímpares existentes entre dois números informados pelo usuário.

package conjuntos.tres;

import java.util.Scanner;

public class ExercicioTrintaSeis {
    public static void main(String[] args) {
        var entrada = new Scanner(System.in);

        System.out.print("Digite o prímeiro número\nR: ");
        var inicio = entrada.nextInt();

        System.out.print("Digite o segundo número\nR: ");
        var fim = entrada.nextInt();

        entrada.close();

        if (inicio > fim){
            var aux = inicio;
            inicio = fim;
            fim = aux;
        }

        System.out.println("Esses são os números entre " + inicio + " e " + fim + " que são impares:");

        for (int i = inicio; i <= fim ; i++) {
            if (i%2 != 0){
                System.out.println(i);
            }
        }
    }
}
