/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Akinator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import tarea03.Queue;
//import java.io.FileReader;
/**
 *
 * @author alfonsoalquicer
 */
public class Main {
    
    public static Scanner scan = new Scanner(System.in);
    public static Scanner scan2=new Scanner(System.in);
    public static Scanner scan3=new Scanner(System.in);
    
    
    public static String play(BinaryNode node){
        System.out.println(node.value);
        String escanear = scan.next();
        String respuesta =escanear.toLowerCase();
        if(respuesta.equalsIgnoreCase("si")){
            if(node.leftChild==null){
                System.out.println("He adivinado su animal!!");
            }else{
                play(node.leftChild);
        }
        }else{
            if(respuesta.equalsIgnoreCase("no")){
                if(node.rightChild==null){
                    System.out.println("He perdido, escriba una palabra que haga unico a su animal");
                    node.rightChild=new BinaryNode(node.value);
                    String nuevoValor = scan2.nextLine();
                    node.value="¿"+nuevoValor+"?";
                    System.out.println("Pregunta agregada al juego : "+node.value);
                    System.out.println("Escriba el nombre de su animal");
                    String nuevoAnimal=scan3.next();
                node.leftChild = new BinaryNode("¿Es un "+nuevoAnimal+"?");
                    System.out.println("Animal agregado al juego en respuesta 'si' a la pregunta agregada: "+node.leftChild.value);
                    System.out.println("Animal en respuesta 'no' a la pregunta agregada: "+node.rightChild.value);
                }else{
                    play(node.rightChild);
                }
            }
        }
        return node.value;
    }
    
    
    public static Queue lectorBaseDeDatos(File file) throws IOException{
       Queue <String> q = new Queue<>();
       String linea="";
        
        try{
            //File archivo = new File("text.txt");
            Scanner scan = new Scanner(new FileReader(file));
            scan.useDelimiter("[\t\n\r]+");
            while(scan.hasNextLine()){
                linea=scan.nextLine();
                q.offer(linea);
            }
            scan.close();
            //System.out.println(Arrays.toString(q.toArray()));
        }catch(FileNotFoundException ex){
            System.out.println("No se encontro el archivo");
        }
       return q;  
    }
    
    public static void generarArbol(Queue q){
        BinaryNode root = new BinaryNode((String) q.remove());
        BinaryNode node = new BinaryNode((String) q.element());
        BinaryNode node1 = new BinaryNode((String) q.element());
        if(q.isEmpty()){
            return;
        }else{
            if(node1.value == "null" || node.value == "null"){
                
            }
        }
        
    }
    
   
    
    
    
    
    
    
    public static void main(String[] args) throws IOException {
        
        
        
        
        Queue <String> q = new Queue<String>();
        Queue <String> fila = new Queue<String>();
        q.offer("hola");
        q.offer("amigo");
        q.offer(":)))");
        q.offer("como");
        q.offer("estas");
        q.offer("?");
        //System.out.println(Arrays.toString(q.toArray()));
        File archivo= new File("text.txt");
        BinaryNode root = new BinaryNode("¿Es mamifero?");
        BinaryNode node = new BinaryNode("Es de agua?");
        BinaryNode node2 = new BinaryNode("Vuela?");
        BinaryNode node3 = new BinaryNode("Es pequeño?");
        BinaryNode node4 = new BinaryNode("Es considerado uno de los 2 mamiferos mas grandes del mundo?");
        BinaryNode node5 = new BinaryNode("Generalmente son amarillos?");
        BinaryNode node6 = new BinaryNode("Tienen escamas?");
        BinaryNode node7 = new BinaryNode("Tiene alguna relación con el mejor amigo de bob esponja?");
        BinaryNode node8 = new BinaryNode("Es agresivo y peligroso?");
        BinaryNode node9 = new BinaryNode("Tiene cuello largo?");
        BinaryNode node10 = new BinaryNode("Es domestico?");
        BinaryNode node11 = new BinaryNode("canario?");
        BinaryNode node12 = new BinaryNode("hablan?");
        BinaryNode node13 = new BinaryNode("Es peligroso?");
        BinaryNode node14 = new BinaryNode("rana?");
        BinaryNode node15 = new BinaryNode("Estrella de mar?");
        BinaryNode node16 = new BinaryNode("pez?");
        BinaryNode node17 = new BinaryNode("Generalmente son animales grises?");
        BinaryNode node18 = new BinaryNode("se caracterizan por ser inteligentes?");
        BinaryNode node19 = new BinaryNode("jirafa?");
        BinaryNode node20 = new BinaryNode("elefante?");
        BinaryNode node21 = new BinaryNode("Es un roedor?");
        BinaryNode node22 = new BinaryNode("Tiene cuernos?");
        BinaryNode node23 = new BinaryNode("perico?");
        BinaryNode node24 = new BinaryNode("Se caracteriza por tener buena vista?");
        BinaryNode node25 = new BinaryNode("Vive en agua?");
        BinaryNode node26 = new BinaryNode("Camaleon?");
        BinaryNode node27 = new BinaryNode("Tiburon?");
        BinaryNode node28 = new BinaryNode("Tiene tentaculos?");
        BinaryNode node29 = new BinaryNode("Delfin?");
        BinaryNode node30 = new BinaryNode("Son de gran tamaño?");
        BinaryNode node31 = new BinaryNode("hamster?");
        BinaryNode node32 = new BinaryNode("felino?");
        BinaryNode node33 = new BinaryNode("Son agresivos?");
        BinaryNode node34 = new BinaryNode("Tiene Rayas?");
        BinaryNode node35 = new BinaryNode("Tiene que ver con el equipo del america?");
        BinaryNode node36 = new BinaryNode("Vive en clima tropical?");
        BinaryNode node37 = new BinaryNode("Generalmente su animal es negro?");
        BinaryNode node38 = new BinaryNode("Serpiente?");
        BinaryNode node39 = new BinaryNode("Pulpo?");
        BinaryNode node40 = new BinaryNode("Orca?");
        BinaryNode node41 = new BinaryNode("Gato?");
        BinaryNode node42 = new BinaryNode("Perro?");
        BinaryNode node43 = new BinaryNode("Toro?");
        BinaryNode node44 = new BinaryNode("Son animales que segun lo que la gente cuenta le ayuda a Santa Claus?");
        BinaryNode node45 = new BinaryNode("Cebra?");
        BinaryNode node46 = new BinaryNode("Es peligroso?");
        BinaryNode node47 = new BinaryNode("Aguila?");
        BinaryNode node48 = new BinaryNode("Halcon?");
        BinaryNode node49 = new BinaryNode("Tucan?");
        BinaryNode node50 = new BinaryNode("Pajaro?");
        BinaryNode node51 = new BinaryNode("Anaconda?");
        BinaryNode node52 = new BinaryNode("Cocodrilo?");
        BinaryNode node53 = new BinaryNode("Es un felino?");
        BinaryNode node54 = new BinaryNode("Oso hormiguero?");
        BinaryNode node55 = new BinaryNode("Tienen melena?");
        BinaryNode node56 = new BinaryNode("Es un roedor?");
        BinaryNode node57 = new BinaryNode("Leon?");
        BinaryNode node58 = new BinaryNode("Tigre?");
        
        //nuevos
        BinaryNode node59 = new BinaryNode("Reno?");
        BinaryNode node60= new BinaryNode("Se pueden ordeñar?");
        BinaryNode node61 = new BinaryNode("Su animal se considera como el mamifero mas grande del mundo?");
        BinaryNode node62= new BinaryNode("Tienen grandes colmillos?");
        BinaryNode node63 = new BinaryNode("Ballena?");
        BinaryNode node64= new BinaryNode("Hipopotamo?");
        BinaryNode node65 = new BinaryNode("Morsa?");
        BinaryNode node66= new BinaryNode("Foca?");
        BinaryNode node67= new BinaryNode("Es una rata?");
        BinaryNode node68= new BinaryNode("Aulla?");
        BinaryNode node69= new BinaryNode("Vaca?");
        BinaryNode node70= new BinaryNode("Borrego?");
        BinaryNode node71= new BinaryNode("Lobo?");
        BinaryNode node72= new BinaryNode("Oso?");
        
        
        
       
        root.leftChild=node;
        root.rightChild=node2;
        node.leftChild=node3;
        node.rightChild=node4;
        node2.leftChild=node5;
        node2.rightChild=node6;
        node3.leftChild=node7;
        node3.rightChild=node8;
        node4.leftChild=node9;
        node4.rightChild=node10;
        node5.leftChild=node11;
        node5.rightChild=node12;
        node6.leftChild=node13;
        node6.rightChild=node14;
        node7.leftChild=node15;
        node7.rightChild=node16;
        node8.leftChild=node17;
        node8.rightChild=node18;
        node9.leftChild=node19;
        node9.rightChild=node20;
        node10.leftChild=node21;
        node10.rightChild=node22;
        node12.leftChild=node23;
        node12.rightChild=node24;
        node13.leftChild=node25;
        node13.rightChild=node26;
        node17.leftChild=node27;
        node17.rightChild=node28;
        node18.leftChild=node29;
        node18.rightChild=node30;
        node21.leftChild=node31;
        node21.rightChild=node32;
        node22.leftChild=node33;
        node22.rightChild=node34;
        node24.leftChild=node35;
        node24.rightChild=node36;
        node25.leftChild=node37;
        node25.rightChild=node38;
        node28.leftChild=node39;
        node28.rightChild=node40;
        node32.leftChild=node41;
        node32.rightChild=node42;
        node33.leftChild=node43;
        node33.rightChild=node44;
        node34.leftChild=node45;
        node34.rightChild=node46;
        node35.leftChild=node47;
        node35.rightChild=node48;
        node36.leftChild=node49;
        node36.rightChild=node50;
        node37.leftChild=node51;
        node37.rightChild=node52;
        node46.leftChild=node53;
        node46.rightChild=node54;
        node53.leftChild=node55;
        node53.rightChild=node56;
        node55.leftChild=node57;
        node55.rightChild=node58;
        node44.leftChild=node59;
        node44.rightChild=node60;
        node30.leftChild=node61;
        node30.rightChild=node62;
        node61.leftChild=node63;
        node61.rightChild=node64;
        node62.leftChild=node65;
        node62.rightChild=node66;
        node56.leftChild=node67;
        node56.rightChild=node68;
        node60.leftChild=node69;
        node60.rightChild=node70;
        node68.leftChild=node71;
        node68.rightChild=node72;
        
        
        
        play(root);
        //fila=lectorBaseDeDatos(archivo);
        
        //System.out.println(Arrays.toString(fila.toArray()));
        
        
        //try {
            //File archivo = new File("texto.txt");
            //Scanner scan = new Scanner(new FileReader("texto.txt"));
            //scan.useDelimiter("[\t\n\r]+");
            //if(scan.hasNextLine()==true){
                //linea=scan.nextLine();
                //BinaryNode root=new BinaryNode(linea);
                
            //}
            //FileWriter fw = new FileWriter("texto.txt");
            //fw.write("Holiiii a todos");
            //fw.close();
            //scan.close();
        //} catch (FileNotFoundException ex) {
            //System.out.println("No se encontro el archivo");
        //}
        
        
    }
}
