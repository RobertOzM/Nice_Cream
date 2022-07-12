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
public class Cliente {
    
    String nombre;
    int cedula;
    
    Cliente siguiente;

    Cliente(String nom, int ced) {
        this.nombre = nom;
        this.cedula  =  ced;
    }
    
    
}
