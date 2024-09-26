import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nombreDeUsuario = "Kevin Velazquez";
        String tipoDeCuenta = "Corriente";
        double saldoDeCuenta = 20000.00;
        int operacionDeUsuario = 0;
        String menu = """
                *** Escriba el número de la opreación deseada dentro de la consola. ***
                1.- Consultar saldo.
                2.- Retirar.
                3.- Depositar.
                4.- Salir.
                """;

        System.out.println("""
                    *********************************************************
                
                    Nombre del cliente: %s
                    Tipo de cuenta: %s
                    Saldo disponible: %.2f
                
                    *********************************************************
                """.formatted(nombreDeUsuario, tipoDeCuenta, saldoDeCuenta));

        while (operacionDeUsuario != 4) {
            System.out.println(menu);
            operacionDeUsuario = teclado.nextInt();

            switch (operacionDeUsuario) {
                case 1:
                    System.out.println("El saldo actual de la cuenta es: $" + saldoDeCuenta);
                    break;

                case 2:
                    System.out.println("Escriba la cantidad que desea retirar dentro de la consola.");
                    double cantidadARetirar = teclado.nextDouble();
                    if (cantidadARetirar > saldoDeCuenta) {
                        System.out.println("Saldo insuficiente.");
                    } else {
                        saldoDeCuenta -= cantidadARetirar;
                        System.out.println("El saldo actual es: $" + saldoDeCuenta);
                    }
                    break;

                case 3:
                    System.out.println("Escriba la cantidad que desea depositar dentro de la consola.");
                    double cantidadADepositar = teclado.nextDouble();
                    saldoDeCuenta += cantidadADepositar;
                    System.out.println("El saldo actual es: $" + saldoDeCuenta);
                    break;

                case 4:
                    System.out.println("¡Gracias por utilizar nuestros servicios!");
                    break;

                default:
                    System.out.println("Operación inválida.");
                    break;
            }
        }
    }
}