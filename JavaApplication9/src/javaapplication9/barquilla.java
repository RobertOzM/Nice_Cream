
package javaapplication9;


public class barquilla {
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
     public void colocratoping(String agregado){
        porcion toping = new porcion(agregado);
        toping.sig = ultimaporcion;
        ultimaporcion = toping;
        T++;
     }
     
     public void recorrido(){
         saberprecio = ultimaporcion;
         while(saberprecio!=null){
             precio++;
             System.out.println("agregado de:"+saberprecio.sabor);;
             saberprecio = saberprecio.sig; 
         }
         System.out.println("precio es:"+precio+"$");
     }
    
}
