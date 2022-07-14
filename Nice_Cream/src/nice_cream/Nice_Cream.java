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
        barquilla b = new barquilla(); 
        Scanner leer = new Scanner(System.in);
        Cola c = new Cola();
        int opcion;
        int confirmacion;
        int opcion2 = 0;
        c.read("Clientes.txt", c);
        do {
            System.out.println("");
            System.out.println(" -------------\t Heladeria Nice Cream \t-------------");
            System.out.println(" ---- \t Abriendo tienda y esperando clientes! \t ----");
            
            System.out.println("");
            System.out.println(" ---- \t Clientes en cola! hora de atenderlos! \t ----");

            System.out.println(" ---- \t Que accion te gustaria realizar? \t ----");
            System.out.println("");
            System.out.println(" 1)---- \tRealizar una venta");
            System.out.println(" 2)---- \tObservar linea de atencion");
            System.out.println(" 3)---- \tLimpiar orden");
            System.out.println(" 4)---- \tImprimir reporte de ventas");
            System.out.println(" 5)---- \tCerrar tienda");

            opcion = leer.nextInt();
            switch (opcion) {

                case 1: 
                    do {
                       
                        System.out.println(" 1)---- \t Añadir un sabor (maximo 3)");
                        System.out.println(" 2)---- \t Añadir un topping (maximo 2)");
                        System.out.println(" 3)---- \t Emitir factura");
                        System.out.println(" 4)---- \t Cerrar venta");
                        opcion2 = leer.nextInt();    
                        switch(opcion2){
                           
                            case 1:
                                    int saborporcion;
                                 do{   
                                    System.out.println("1)---- \t Chocolate");
                                    System.out.println("2)---- \t Mantecado");
                                    System.out.println("3)---- \t Fresa");
                                    System.out.println("4)---- \t Mora");
                                    System.out.println("5)---- \t Kiwi");
                                    System.out.println("6)---- \t Parchita");
                                    System.out.println("7)---- \t salir de sabor");
                                    saborporcion = leer.nextInt();
                                    
                                        switch(saborporcion){
                                            case 1:
                                                b.colocarporcion("chocolate");
                                                break;
                                            case 2:
                                                b.colocarporcion("Mantecado");
                                                break;
                                            case 3:
                                                b.colocarporcion("Fresa");
                                                break;
                                            case 4:
                                                b.colocarporcion("Mora");
                                                break;
                                            case 5:
                                                b.colocarporcion("Kiwi");
                                                break;
                                            case 6:
                                                b.colocarporcion("Parchita");
                                                break;
                                            default:
                                        
                                        }
                            }while(saborporcion != 7);
                                break;
                            case 2:
                                int topping;
                                do{
                                    System.out.println("1)---- \t Sirope de chocolate");
                                    System.out.println("2)---- \t Sirope de fresa");
                                    System.out.println("3)---- \t Sirope de Caramelo");
                                    System.out.println("4)---- \t Arequipe");
                                    System.out.println("5)---- \t Nutella");
                                    System.out.println("6)---- \t Cereales");
                                    System.out.println("7)---- \t Galletas");
                                    System.out.println("8)---- \t salir de topping");
                                        topping = leer.nextInt();
                                        switch(topping){
                                            case 1:
                                                b.colocartopping(" Sirope Chocolate");
                                                break;
                                            case 2:
                                                b.colocartopping(" Sirope Fresa");
                                                break;
                                            case 3:
                                                b.colocartopping(" Sirope Caramelo");
                                                break;
                                            case 4:
                                                b.colocartopping(" Arequipe");
                                                break;   
                                            case 5:
                                                b.colocartopping(" Nutella");
                                                break;    
                                            case 6:
                                                b.colocartopping(" Cereales");
                                                break;
                                            case 7:
                                                b.colocartopping(" Galletas");
                                                break; 
                                            default:    
                                        }
                                }while(topping != 8);
                                break;
                            case 3:
                                    System.out.println("La factura se emitio, y se guardo en el registro");
                                    b.recorrido();
                                    c.dequeue();
                                break;
                        }
                        } while(opcion2 != 4);
                        break;
                    
                case 2:
                    System.out.println("\t --> " + c.imprimirRecursiva(c.primero));
                    break;
                case 3:
                    b.limpiarorden();
                    break;
                      
                case 4:
                        b.mostrarventas();
                        System.out.println("El reporte de ventas hasta ahora, ha sido generado!");
                    break;
                case 5:
                    System.out.println("\t Gracias por tu esfuerzo! hoy fue un gran dia de trabajo");
                    break;
                default:
            }
        } while (opcion != 5);
    }

}
