package com.aluracursos.AplicacionCompras.principal;

import com.aluracursos.AplicacionCompras.modelos.Compra;
import com.aluracursos.AplicacionCompras.modelos.TarjetaDeCredito;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Inserta el límite de la tarjeta:");
        double limite = lectura.nextDouble();
        TarjetaDeCredito tarjeta = new TarjetaDeCredito(limite);

        int salir = 1;
        while(salir != 0) {
            System.out.println("¿Qué deseas comprar?");
            String descripcion = lectura.next();

            System.out.println("Inserta el valor de la compra:");
            double valor = Double.valueOf(lectura.next());

            Compra compra = new Compra(valor, descripcion);
            boolean compraRealizada = tarjeta.validarCompra(compra);

            if (compraRealizada) {
                System.out.println("¡Compra realizada!");
                System.out.println("Si deseas continuar inserta 1, si deseas salir inserta 0.");
                salir = lectura.nextInt();
            } else {
                System.out.println("¡Saldo insuficiente!");
                salir = 0;
            }
        }
        System.out.println("***********************");
        System.out.println("COMPRAS REALIZADAS:\n");
        Collections.sort(tarjeta.getListaDeCompras());
        for (Compra compra : tarjeta.getListaDeCompras()) {
            System.out.println(compra.getDescripcion() + " - " + compra.getValor());
        }
        System.out.println("\n***********************");
        System.out.println("\nSaldo de la tarjeta: " + tarjeta.getSaldo());
    }
}
