/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice_cream;

import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Gabo
 */
public class Nice_Cream {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) throws IOException {

        Scanner leer = new Scanner(System.in);
        Cola c = new Cola();
        int opcion;
        int confirmacion;

        do {
            System.out.println("");
            System.out.println(" -------------\t Heladeria Nice Cream \t-------------");
            System.out.println(" ---- \t Abriendo tienda y esperando clientes! \t ----");
            c.read("Clientes.txt", c);
            System.out.println("");
            System.out.println(" ---- \t Clientes en cola! hora de atenderlos! \t ----");

            System.out.println(" ---- \t Que accion te gustaria realizar? \t ----");
            System.out.println("");
            System.out.println(" 1)---- \tRealizar una venta");
            System.out.println(" 2)---- \tObservar linea de atencion");
            System.out.println(" 3)---- \tImprimir reporte de ventas");
            System.out.println(" 4)---- \tCerrar tienda");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1:
                    break;
                case 2:
                    System.out.println("\t La cola de atencion es: // --> " + c.imprimirRecursiva(c.primero));
                    break;
                case 3:

                    break;
                case 4:
                    System.out.println("\t Gracias por tu esfuerzo! hoy fue un gran dia de trabajo");
                    break;
                default:
            }
        } while (opcion != 4);
    }

}
