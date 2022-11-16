/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author cbhas
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        double costoPedidodescuento;
        double costoPedidodescuento1;
        double costoPedido;
        int cantidadProducto;
        double precioUnitario;
        double descuento = 15;

        System.out.println("Ingrese la cantidad de unidades que requiere:");
        cantidadProducto = entrada.nextInt();

        System.out.println("Ingrese el valor unitario del producto:");
        precioUnitario = entrada.nextDouble();

        costoPedidodescuento1 = (cantidadProducto * precioUnitario);

        if (cantidadProducto > 50) {
            descuento = (costoPedidodescuento1 * descuento) / 100;
            costoPedidodescuento = (costoPedidodescuento1 - descuento);
            System.out.println("El descuento es del:\n15%");
            System.out.println("El valor a cancelar es:\n"
                    + costoPedidodescuento);

        } else {
            costoPedido = (cantidadProducto * precioUnitario);
            System.out.println("El valor a cancelar es:\n" + costoPedido);
        }

    }

}
