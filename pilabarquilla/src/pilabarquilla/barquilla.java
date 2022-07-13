
package pilabarquilla;

public class barquilla {
    nodo  ultimaporcion;
    int T = 0 ;
    String lista = "";
    public barquilla (){
        ultimaporcion = null;
        T = 0;
    }
    public boolean barquillavaci(){
        return ultimaporcion == null;
  }
    public void colocarporcion(int agregado, int extra){
        nodo porcion = new nodo(agregado,extra);
        porcion.sig = ultimaporcion;
        ultimaporcion = porcion;
        T++;
        
    }
    public void porciones(){
        nodo porciones = ultimaporcion;
        while(porciones != null){
            porciones = porciones.sig;
            
        }
    }
    
    
}
