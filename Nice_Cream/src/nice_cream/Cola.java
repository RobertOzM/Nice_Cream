/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nice_cream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Gabo
 */
public class Cola {

    Cliente primero, ultimo;
    
    String Cola;

    public Cola() {

        primero = null;
        ultimo = null;

    }

    boolean isEmpty() {
        return primero == null;

    }

    void insertar(String nom, int ced) {
        Cliente nuevo = new Cliente(nom, ced);
        if (isEmpty()) {
            primero = nuevo;
            ultimo = primero;

        } else {
            ultimo.siguiente = nuevo;
            ultimo = ultimo.siguiente;

        }

    }

    Cliente dequeue() throws IOException {

        if (!isEmpty()) {

            Cliente temp = new Cliente(primero.nombre, primero.cedula);
            primero = primero.siguiente;
            return temp;

        }
        System.out.println("No hay clientes en cola ");
        return null;

    }

    void read(String Nombref, Cola col) throws IOException {

        FileReader fr = new FileReader(Nombref);
        BufferedReader br = new BufferedReader(fr);
        String linea;

        while ((linea = br.readLine()) != null) {

            String[] datos = linea.split("//");

            col.insertar(datos[0], Integer.parseInt(datos[1]));

        }

    }
    
    String imprimirRecursiva(Cliente n){
        
        if(isEmpty()){
            return "No hay clientes en cola";
        }
        else if (n.siguiente == null) {
            return n.nombre + " V-" + n.cedula;  
                   
        }
        return n.nombre + " V-" + n.cedula + " --> " + imprimirRecursiva(n.siguiente);
    } 


}
