
package javaapplication9;
import java.util.Scanner;

public class JavaApplication9 {

    
    public static void main(String[] args) {
        int opcion = 0;
        String sabor;
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        barquilla barquilla = new barquilla();
        do{
           try{
            System.out.println("hola bienbenido a ice crean");
            System.out.println("por favor ingrese un numero segun lo que"); 
            System.out.println("quiere hacer con su barquilla");
            System.out.println("1------Agregar una porcion");
            System.out.println("2------Agregar un topping");
            System.out.println("3------Rebisar precio");
        
             opcion = entrada.nextInt();
       
        switch(opcion){
            case 1:
            System.out.println("ingrese su sabor");
            sabor = entrada2.nextLine();
            barquilla.colocarporcion(sabor);
                break;
            case 2:
                System.out.println("ingrese su topping deseado");
                sabor = entrada2.nextLine();
                barquilla.colocratoping(sabor);
                break;
            case 3:
                barquilla.recorrido();
                break;
            default:
                System.out.println("a ingresado un valor incorrecto");
                break;
        }
           }catch (NumberFormatException e){
               
           }
        }while(opcion != 8);
      
        
        
    }
    
}
