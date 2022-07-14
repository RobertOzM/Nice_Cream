/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice_cream;

/**
 *
 * @author Gabo
 */



import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;


public class barquilla {
    
    PrintWriter pw;
    porcion ultimaporcion, saberprecio;
    int T = 0,precio = 0;
    String lista = "";
     public barquilla (){
    
        T = 0;
        
    }
    
    
    
    public void colocarporcion(String agregado){
        porcion porcion = new porcion(agregado);
        porcion.sig = ultimaporcion;
        ultimaporcion = porcion;
        T++;
    }
     public void colocartopping(String agregado){
        porcion toping = new porcion(agregado);
        toping.sig = ultimaporcion;
        ultimaporcion = toping;
        
        T++;
     }
     
     public void recorrido() throws IOException{
        pw = new PrintWriter(new FileWriter("Ventas.txt", true));
         saberprecio = ultimaporcion;
         while(saberprecio!=null){
             precio++;
             System.out.println("agregado de: "+saberprecio.sabor);
             pw.println("agregado de: "+saberprecio.sabor);
             pw.close();
             saberprecio = saberprecio.sig; 
         }
         System.out.println("Venta: "+precio+" $");
         pw.println("Venta: "+precio+" $");
         pw.close();
         
     }
    
}
