/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

/**
 *
 * @author alfonsoalquicer
 */
public class BinaryNode {
    public String value;
    
    public BinaryNode leftChild;
    public BinaryNode rightChild;
    
    public BinaryNode(String value){
        this.value=value;
        leftChild=null;
        rightChild=null;
    }
    
    public void addNode(String value){
        BinaryNode current = this;
        
            if(current.leftChild==null){
                current.leftChild= new BinaryNode(value);
            }else{
                current.leftChild.addNode(value);
            }
             if(current.rightChild==null){
                current.rightChild=new BinaryNode(value);
             }else{
                current.rightChild.addNode(value);
             }
            }
        }
    

