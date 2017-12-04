/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

/**
 *
 * @author alfonsoalquicer
 */
public class Item {
    
    int peso=0;
    int valor=0;

    public Item(int peso, int valor) {
        if(peso<=25){
            this.peso=peso;
        }
        if(valor<=25){
            this.valor=valor;
        }
        
    }
    
    public double ganancia(int valor, int peso){
        return valor/peso;
    }
    
    
    
}
