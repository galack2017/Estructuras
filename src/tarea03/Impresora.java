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
public class Impresora {
    
    Queue<String> cola;
    
    public Impresora(){
        cola=new Queue<>();
    }
    
    public void printDocument(String documento){
        cola.offer(documento);
        
    } 
    
    public void runPrinter() throws InterruptedException{
        boolean estado=false;
        while(cola.isEmpty()==false)
        {
            if(estado==false){
            System.out.println("Imprimiedo documento :"+cola.remove());    
            Thread.sleep(5000);
            }else{throw new InterruptedException();}
        }
    }
    
    
    
}
