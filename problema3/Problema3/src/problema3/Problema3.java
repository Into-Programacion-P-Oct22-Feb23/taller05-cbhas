/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marcaAutomovil;
        String origenAutomovil;
        double costoAutomovil;
        double precioVenta;
        double impuesto = 0;

        System.out.println("Ingrese la marca de automovil que va a adquirir");
        marcaAutomovil = entrada.nextLine();

        System.out.println("Ingrese el origen del automovil:");
        origenAutomovil = entrada.nextLine();

        System.out.println("Ingrese el costo del automovil:");
        costoAutomovil = entrada.nextDouble();

        /*Para calcular el valor de un impuesto 'añadido al precio' debe 
        multiplicar el precio del artículo por la tasa impositiva en forma 
        decimal*/
        if ("Alemania".equals(origenAutomovil)) {
            impuesto = 20;
        }
        if ("Japón".equals(origenAutomovil)) {
            impuesto = 30;
        }
        if ("Italia".equals(origenAutomovil)) {
            impuesto = 15;
        }
        if ("USA".equals(origenAutomovil)) {
            impuesto = 8;
        }
        impuesto = (costoAutomovil * impuesto) / 100;
        precioVenta = costoAutomovil + impuesto;

        System.out.printf("El impuesto adicional a pagar por el automovil "
                + "de marca: %s, fue de: %.2f, por lo tanto, el precio de "
                + "venta con el impuesto incluido es: %.2f\n",
                 marcaAutomovil,
                 impuesto,
                 precioVenta);

    }
}
