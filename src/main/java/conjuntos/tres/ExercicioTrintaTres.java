//Exiba todos os números pares de 10 a 200.

package conjuntos.tres;

public class ExercicioTrintaTres {
    public static void main(String[] args) {
        for (int i = 10; i <= 200; i++) {
            if (i%2 == 0){
                System.out.println(i);
            }
        }
    }
}
