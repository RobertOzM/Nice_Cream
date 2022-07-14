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
    int precio = 0;
    porcion ultimaporcion, saberprecio;
    int ganancia = 0;
    
    
    
    public void colocarporcion(String agregado){
        porcion porcion = new porcion(agregado);
        porcion.sig = ultimaporcion;
        ultimaporcion = porcion;
        ganancia++;
       
    }
     public void colocartopping(String agregado){
        porcion toping = new porcion(agregado);
        toping.sig = ultimaporcion;
        ultimaporcion = toping;
        ganancia++;
      
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
         precio = 0;
         pw.println("Gnancia: "+ganancia+" $");
         pw.close();
         
     }
     public void mostrarventas(){
         System.out.println("las ganacias fueron:"+ganancia);
     }
          public String quitarporcion(){
         String aux = ultimaporcion.sabor;
         ultimaporcion = ultimaporcion.sig;
        
        return aux;
         
         
     }
     public void limpiarorden (){
     while(!barquillavacia()){
        quitarporcion();   
     }
         System.out.println("Orden limpiada");
}
       public boolean barquillavacia(){
         return ultimaporcion == null;
     }
    
    
}
