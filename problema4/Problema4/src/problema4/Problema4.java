/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double valorTotal1;
        double valorTotal2;
        double valorTotal3;
        double valorSubtotal;
        double descuento1 = 10;
        double descuento2 = 15;
        double descuento3 = 20;
        int numeroDias;
        int precioHabitacion;

        System.out.println("Ingrese el número de días que se quedará "
                + "hospedado:");
        numeroDias = entrada.nextInt();

        System.out.println("Ingrese el precio diario de la habitación:");
        precioHabitacion = entrada.nextInt();

        valorSubtotal = (numeroDias * precioHabitacion);

        System.out.println("El subtotal por pagar es:\n" + valorSubtotal);

        if (numeroDias > 5 && numeroDias < 11) {
            descuento1 = (valorSubtotal * descuento1) / 100;
            valorTotal1 = (valorSubtotal - descuento1);
            System.out.println("El descuento es del:\n10%");
            System.out.println("El total a pagar es:\n" + valorTotal1);

        } else {
            if (numeroDias > 10 && numeroDias < 16) {
                descuento2 = (valorSubtotal * descuento2) / 100;
                valorTotal2 = (valorSubtotal - descuento2);
                System.out.println("El descuento es del:\n15%");
                System.out.println("El total a pagar es:\n" + valorTotal2);

            } else {
                if (numeroDias > 15) {
                    descuento3 = (valorSubtotal * descuento3) / 100;
                    valorTotal3 = (valorSubtotal - descuento3);
                    System.out.println("El descuento es del:\n20%");
                    System.out.println("El total a pagar es:\n" + valorTotal3);

                }

            }
        }
    }
}
