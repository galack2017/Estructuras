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
public interface IQueue<E> {
    
    //Inserta el elemento especificado a esta lista.
    public void offer(E e);
    
    //Regresa y remueve el primero elemento de la fila que conocemos como head.
    //Arroja una excepción (NoSuchElementException) si la fila esta vacia    
    public E remove();
    
    //Obtiene pero no remueve el primer elemento de la fila.
    //Arroja una excepción (NoSuchElementException) si la fila esta vacia
    public E element();
    
    //Probar que la fila esta esta vacia
    //Regresa true si y solo si la fila esta vacia, y regresa false de otra manera.
    public boolean isEmpty();
    
    //Quita todos los elementos de la fila.
    public void clear();
    
    
    //Regresa el numero de elementos que hay en la fila actualmente.
    public int size();
    
    //Regresa una representación de los elementos de la fila
    public Object[] toArray();
    
}
