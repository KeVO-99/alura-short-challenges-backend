import java.util.Random;
import java.util.Scanner;

public class JuegoAdivinanza {
    public static void main(String[] args) {
        Scanner numeroIngresadoPorElUsuario = new Scanner(System.in);
        int numeroGeneradoAutomaticamente = new Random().nextInt(100);
        int contadorDeIntentos = 1;

        while (contadorDeIntentos < 6) {
            System.out.println("""
                    Este programa genera un número de forma aleatoria entre 0 y 100. Adivina dicho número y digítalo 
                    a continuación en la consola (tienes un máximo de 5 intentos): 
                    """);
            int numeroDigitadoPorElUsuario = numeroIngresadoPorElUsuario.nextInt();

            if (numeroDigitadoPorElUsuario == numeroGeneradoAutomaticamente) {
                System.out.println("¡Felicidades, has acertado en " + contadorDeIntentos + " intentos!");
                break;
            } else if (numeroDigitadoPorElUsuario > numeroGeneradoAutomaticamente) {
                System.out.println("El número digitado es mayor que el número generado por el programa.");
                contadorDeIntentos++;
            } else {
                System.out.println("El número digitado es menor que el número generado por el programa.");
                contadorDeIntentos++;
            }
            if (contadorDeIntentos == 6) {
                System.out.println("Lo siento, no conseguiste adivinar el número en 5 intentos. El número era: " +
                        numeroGeneradoAutomaticamente);
            }
        }
    }
}
