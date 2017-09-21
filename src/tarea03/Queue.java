/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import java.util.NoSuchElementException;

/**
 *
 * @author alfonsoalquicer
 */
public class Queue<E> implements IQueue<E> {

    LinkedList<E> lista;
    
    public Queue(){
        lista= new LinkedList<>();
    }
    
    @Override
    public void offer(E e) {
        
         lista.addFirst(e);//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E remove() {
        if(lista.isEmpty()==true)
            throw new NoSuchElementException();
        return lista.removeLast();
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public E element() {
        if(lista.isEmpty()==true)
            throw new NoSuchElementException();
        lista.getLast();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        if(lista.size()==0){
            return true;
        }else{
            return false;
        }
        //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void clear() {
        lista.clear();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int size() {
        return lista.size();//To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object[] toArray() {
        return lista.toArray(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
