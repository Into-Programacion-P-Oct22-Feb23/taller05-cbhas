/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoKilovatio;
        double kilovatiosConsumidos;
        double descuento = 10;
        double costoPlanilladescuento;
        double costoPlanilla;
        int edadPerona;

        System.out.println("Ingrese el valor de costo por kilovatio/hora:");
        costoKilovatio = entrada.nextDouble();

        System.out.println("Ingrese el número de kilovatios consumidos en el "
                + "mes:");

        kilovatiosConsumidos = entrada.nextDouble();

        costoPlanilladescuento = (kilovatiosConsumidos * costoKilovatio);

        System.out.println("Ingrese su edad:");
        edadPerona = entrada.nextInt();

        if (edadPerona > 65) {
            descuento = (descuento * costoPlanilladescuento) / 100;
            costoPlanilladescuento = (costoPlanilladescuento - descuento);
            System.out.println("El descuento es del:\n10%");
            System.out.println("El valor a cancelar es:\n"
                    + costoPlanilladescuento);

        } else {
            costoPlanilla = (kilovatiosConsumidos * costoKilovatio);
            System.out.printf("El valor a cancelar es:\n" + costoPlanilla);
        }

    }

}
