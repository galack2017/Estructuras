/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;

import java.util.Arrays;

/**
 *
 * @author alfonsoalquicer
 */
public class BinaryNode {
    
    public int value;
    
    public BinaryNode leftChild;
    public BinaryNode rightChild;
    
    public BinaryNode(int value){
        this.value=value;
        leftChild=null;
        rightChild=null;
    }
    
    public void preorderTraversal(){
        preorder(this);
    }
    
    public void inorderTraversal(){
        inorder(this);
    }
    
    public void postorderTraversal(){
        postorder(this);
    }
    
    public void depthFirstTraversal(){
        DepthFirst(this);
        
    }
    
    private void preorder(BinaryNode node){
        if(node.leftChild!=null || node.rightChild!=null){
            System.out.println(node.value);
            if(node.leftChild!=null){
            //System.out.println(node.leftChild.value);
            preorder(node.leftChild);
            }
            if(node.rightChild!=null){
            //System.out.println(rightChild.value);
            preorder(node.rightChild);
            }
        }else{
            System.out.println(node.value);
        }
        
    }
    
    private void inorder(BinaryNode node){
        if(node.leftChild!=null || node.rightChild!=null){
        if(node.leftChild!=null){
            inorder(node.leftChild);
        }
        System.out.println(node.value);
        if(node.rightChild!=null){
            inorder(node.rightChild);
        }
        }else{System.out.println(node.value);}
        
    }
    
    private void postorder(BinaryNode node){
        if(node.leftChild!=null || node.rightChild!=null){
        if(node.leftChild!=null){
            postorder(node.leftChild);
        }
        if(node.rightChild!=null){
            postorder(node.rightChild);
        }
            System.out.println(node.value);
    }else{
            System.out.println(node.value);
        }
    }
    
    
    Queue <Integer> fila = new Queue<Integer>();
    Queue <Integer> salida = new Queue<Integer>();
    
    private void DepthFirst(BinaryNode node){
        Queue <Integer> temp = new Queue<Integer>();
        if(node!=null){
            fila.offer(node.value);
            if(fila.isEmpty()){
                return;
            }
            if(node.leftChild!=null){
                //fila.offer(leftChild.value);
                DepthFirst(node.leftChild);
            }
            if(node.rightChild!=null){
                //fila.offer(rightChild.value);
                DepthFirst(node.rightChild);
            }
            salida.offer(fila.remove());
            
            
            System.out.println(Arrays.toString(salida.toArray()));
        }   
    }
    
    public void addNode(int value){
        BinaryNode current = this;
        if(value<current.value){
            if(current.leftChild==null){
                current.leftChild= new BinaryNode(value);
            }else{
                current.leftChild.addNode(value);
            }
        }else{
            if(value>current.value){
             if(current.rightChild==null){
                current.rightChild=new BinaryNode(value);
             }else{
                current.rightChild.addNode(value);
             }
            }
        }
    }
    
    public BinaryNode findNode(int target){
        BinaryNode current = this;
        if(target==this.value){
            return this;
        }
        if(target<value){
            if(current.leftChild==null){
                return null;
            }else{
                return current.leftChild.findNode(target);
            }
        }else{
            if(current.rightChild==null){
                return null;
            }else{
                return current.rightChild.findNode(target);
            }
        }
    }
    
    //private void depthFirst(BinaryNode node){
        //Queue <Integer> fila = new Queue<Integer>();
        //Stack <Integer> stack=new Stack<Integer>();
        //fila.offer(node.value);
        //while(!fila.isEmpty()){
        //if(node.leftChild!=null||node.rightChild!=null){
            //if(node.leftChild!=null&&node.rightChild!=null){
                //fila.offer(leftChild.value);
                //fila.offer(rightChild.value);
                //System.out.println(Arrays.toString(fila.toArray()));
                //depthFirst(leftChild);
                //depthFirst(rightChild);
            //}
            //if(node.leftChild!=null&&node.rightChild==null)
                //fila.offer(leftChild.value);
            //if(node.rightChild!=null&&node.leftChild==null)
                //fila.offer(rightChild.value);
            
        //}else{
           //if(node!=null){
           //fila.offer(node.value);
            //}else{
                //return;
            //}
        //}
        //}
    //}
    //int [] arr = new int[value]
    
    
    
}
