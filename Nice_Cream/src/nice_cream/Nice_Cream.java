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
     */
    public static void main(String[] args) throws IOException {
        
        
        Scanner leer = new Scanner(System.in);
        Cola c = new Cola();
        int opcion;
        int confirmacion;
        
        
        
        System.out.println("------------- Heladeria Nice Cream -------------");
        System.out.println(" ---  Abriendo tienda y esperando clientes! --- ");
        c.read("Clientes.txt", c);
        System.out.println("----- Clientes en cola! hora de atenderlos! ---- ");
        
        System.out.println("------ Que accion te gustaria realizar?  ------");
        System.out.println("");
        System.out.println("1)---- Realizar una venta");
        System.out.println("2)---- observar linea de atencion;");
        System.out.println("3)---- Cerrar tienda");
        System.out.println("4) --- Imprimir reporte de ventas");
        
        opcion = leer.nextInt();
        switch(opcion){
            case 1:
                break;
            case 2:
                   System.out.println("La cola de atencion es: // --> " + c.imprimirRecursiva(c.primero)); 
                break;
            case 3:
                    System.out.println("Ya revisaste si habian clientes en cola??");
                    System.out.println("1---Si, todos los clientes de la cola han sido atendidos!");
                    
                    confirmacion = leer.nextInt();
                    switch(confirmacion){
                        case 1:
                                System.out.println("Gracias por tu esfuerzo, hoy fue un buen dia de trabajo!!!!");
                            break;
                        case 2:
                           
                            break;
                    }
                break;
            case 4:
                break;
        
        }
        
        
        
        
       
    }
    
}
