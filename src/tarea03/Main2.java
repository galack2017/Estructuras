/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea03;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author alfonsoalquicer
 */
public class Main2 {
    
    public static void eraseInOrder(LinkedList<Integer> lst, int count, boolean desc){
        while(!lst.isEmpty()){
            if(desc){
                for(int i =0; i<lst.size();i++){
                    for(int j=0; j<lst.size();i++){
                        if(lst.get(i)>lst.get(j)){
                            lst.remove(i);
                        }
                    }
                }
            }else{
               for(int i =0; i<lst.size();i++){
                    for(int j=0; j<lst.size();i++){
                        if(lst.get(i)<lst.get(j)){
                            lst.remove(i);
                        }
                    }
                } 
            }
        }
    }
    
    
    
    public static void superSort(String[] arr){
        int [] numeros = new int[arr.length];
        LinkedList<String> lista0 = new LinkedList<String>();
        LinkedList<String> lista1 = new LinkedList<String>();
        LinkedList<String> lista2 = new LinkedList<String>();
        LinkedList<String> lista3 = new LinkedList<String>();
        LinkedList<String> lista4 = new LinkedList<String>();
        LinkedList<String> lista5 = new LinkedList<String>();
        LinkedList<String> lista6 = new LinkedList<String>();
        LinkedList<String> lista7 = new LinkedList<String>();
        LinkedList<String> lista8 = new LinkedList<String>();
        LinkedList<String> lista9 = new LinkedList<String>();
        
        
        for(int i=0; i<numeros.length;i++){
            numeros[i]=Integer.valueOf(arr[i]);
            System.out.println(Arrays.toString(numeros));
        }
        
        for(int j=0; j<numeros.length;j++){
        }
        
        
        
        
        
        //for(int i=0; i<arr.length;i++){
        //    if(arr[i].length()<=1){
         //       arr[i]+="00";
           // }
           // if(arr[i].length()<=2){
           //     arr[i]+="0";
           // }
        //}
        //for(int i=0; i<arr.length;i++){
         //   int x = Integer.parseInt(arr[i]);
            
        //}
    }
    
    
    //public static void moveToTop(Stack<Integer> stack, int i){
      //  Object [] x=stack.toArray();
        //for(int j=0;j<x.length;j++){
          //   Integer num = (Integer) x[i];
             
       // }
        //x[i]=null;
        //x[0]=(Object) num;
    //}
    
    
    
    
    public static void moveToBeginning(LinkedList<Integer> lst, int i){
        if(i>=lst.size()){
            throw new IndexOutOfBoundsException();
        }
        int elemento = lst.remove(i);
        lst.add(0, elemento);
        
        
    }
    
    
    public static void insertInOrder(LinkedList<Integer> lst, int element){
        for(int i=0; i<lst.size();i++){
            if(lst.get(i)>=element){
                lst.add(i-1, element);
                break;
            }else{
                lst.addLast(element);
                break;
            }
        }
    }
    
    
    
    
    
    public static String cleanString(String str){
        char x;
        Queue <Character> fila = new Queue<>();
        String resultado="";
        String cadena=str.toUpperCase();
        for (int i=0;i<str.length();i++){
            x=cadena.charAt(i);
            if(x=='A'||x=='B'||x=='C'||x=='D'||x=='E'||x=='F'||x=='G'||x=='H'||x=='I'||x=='J'||x=='K'||x=='L'||x=='M'||x=='N'||x=='O'||x=='P'||x=='Q'||x=='R'||x=='S'||x=='T'||
                    x=='U'||x=='V'||x=='W'||x=='X'||x=='Y'||x=='Z'){
                resultado+=x;
            }
            
        }
        return resultado;
    }
    
   public static LinkedList<Integer> union(LinkedList<Integer> list1, LinkedList<Integer>list2){
            LinkedList <Integer> lista = new LinkedList<Integer>();
            int num = 0;
            for(int i=0; i<list1.size();i++){
                num = list1.get(i);
                
                for(int j=0;j<list2.size();j++){
                    if(list2.contains(num)){
                        if(!lista.contains(num)){
                            lista.addLast(num);
                        }//break;
                    }
                    break;
                }
            }
            return lista;
        }
    
   
    
    
    public static <T> void insertList(List<T> listA, List<T> listB, int pos){
        Stack<T> fila = new Stack<T>();
        System.out.println(listA.size());
        for(int j = pos+1; j<=listA.size();j++){
            fila.push(listA.removeFirst());
            System.out.println("Fila: "+Arrays.toString(fila.toArray()));
        }
        
        for(int k=listA.size(); k<=listB.size(); k++){
            listA.addFirst(listB.removeFirst());
        }
        while(!fila.empty()){
            listA.addFirst(fila.pop());
        
        }
        System.out.println(Arrays.toString(listA.toArray()));
        
        
    }
    
    
    public static <T> void insertListt(List<T> listA, List<T> listB, int pos){
        Stack<T> fila = new Stack<T>();
        LinkedList<T> lista = new LinkedList<T>();
        for(int i=pos+1;i<listA.size();i++){
            //System.out.println(listA.get(i));
            fila.push(listA.get(i));
            
            System.out.println(Arrays.toString(fila.toArray()));
        }
        while(!fila.empty()){
            lista.addFirst(fila.pop());
        }
        
        while(!listB.isEmpty()){
            
            lista.addFirst(listB.removeLast());
        }
        for(int i=0;i<=pos;i++){
            lista.addFirst(listA.get(i));
        }
        System.out.println(Arrays.toString(lista.toArray()));
        
    }
    
    
    
    
    public static int getSmallestFactor(int n){
        for(int j=2; j<=n;j++){
            if(n%j==0){
                return j;
            }
        }
        return n;
    }
    
    public static <T> boolean equaals(List<T> listA, List<T> listB)
    {
        System.out.println(listA.size());
        System.out.println(listB.size());
        if(listA.size()==listB.size()){
        
        for(int pos=0;pos<listA.size();pos++){
            if(listA.get(pos).equals(listB.get(pos))){
                return true;
            }else{
                return false;
            }
        }
        }else{
            return false;
        }
        return true;
    }
    
    
    public static void programa(){
        System.out.println("Teclee un número para calcular sus factores primos");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();
        Queue<Integer> fila = new Queue<Integer>();
        fila.offer(numero);
        while(!fila.isEmpty()){
            int x = fila.remove();
            if(x==1)
                return;
            int y = getSmallestFactor(x);
            fila.offer(x/y);
            System.out.println(y);
        }
    }
    
    
    public static int CountOneChild(BinaryNode node){
            if(node.leftChild==null && node.rightChild!=null ||node.leftChild!=null && node.rightChild==null){
                if(node.leftChild==null)
                    return CountOneChild(node.rightChild)+1;
                if(node.rightChild==null)
                    return CountOneChild(node.leftChild)+1;
            }
            if(node.rightChild==null && node.leftChild==null){
                return 0;
            }else{
                return CountOneChild(node.rightChild)+CountOneChild(node.leftChild);
            }  
    }
    
    
    private static int treeSize(BinaryNode node){
        
        int count =1;
        if(node.leftChild!=null){
            count+=treeSize(node.leftChild);
        }
        if(node.rightChild!=null){
            count+=treeSize(node.rightChild);
        }
        return count;
    }
    
    
    public static String baseString(int n, int longitud){
        if(longitud==0){
            return "";
        }else{
            int res = n%2;
            return baseString(n/2, longitud-1)+res;
        }
    }
    //Recursión
    public static String numToNames(int n){
        String numero = Integer.toString(n);
        if(numero.equalsIgnoreCase("")){
            return "";
        }else{
            String temp=numero.substring(0,1);
            //System.out.println(temp);
            String nuevo = numero.substring(1);
            //System.out.println(nuevo);
            if(nuevo.equalsIgnoreCase("")){
                switch(temp){
                case "0":
                    return "cero ";
                case "1":
                    return "uno ";
                case "2":
                    return "dos ";
                case "3":
                    return "tres ";
                case "4":
                    return "cuatro ";
                case "5":
                    return "cinco ";
                case "6":
                    return "seis ";
                case "7":
                    return "siete ";
                case "8":
                    return "ocho ";
                case "9":
                    return "nueve ";
            }
                return "";
            }
            int number = Integer.parseInt(nuevo);
            
            switch(temp){
                case "0":
                    return "cero "+numToNames(number);
                case "1":
                    return "uno "+numToNames(number);
                case "2":
                    return "dos "+numToNames(number);
                case "3":
                    return "tres "+numToNames(number);
                case "4":
                    return "cuatro "+numToNames(number);
                case "5":
                    return "cinco "+numToNames(number);
                case "6":
                    return "seis "+numToNames(number);
                case "7":
                    return "siete "+numToNames(number);
                case "8":
                    return "ocho "+numToNames(number);
                case "9":
                    return "nueve "+numToNames(number);
            }
                    
        }
        return "";
    }
    
        public static String Palindrome(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclea una frase para averiguar si es palindrome");
        String entrada = scan.nextLine().toLowerCase();
        char x;
        Stack<Character> pila = new Stack<>();
        Queue<Character> fila = new Queue<>();
        Queue<Character> especiales = new Queue<>();
        for(int i=0;i<entrada.length();i++){
            x=entrada.charAt(i);
            if(x!='"'&&x!='!'&&x!='¡'&&x!='?'&&x !=' '){
            
            pila.push(x);
            fila.offer(x);
            }
        }
        while(!pila.empty() || !fila.isEmpty()){
            char first = fila.remove();
            char last  = pila.pop();
            if(first!=last){
                return "No es palindrome";
            }
        }
        //System.out.println(pila.pop()+"     "+fila.element());
        return "Es palindrome";
    }
    
    
    public static String Palindorme(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Teclea una frase para averiguar si es palindrome");
        String entrada = scan.nextLine().toLowerCase();
        char x;
        Stack<Character> pila = new Stack<>();
        Queue<Character> fila = new Queue<>();
        Queue<Character> especiales = new Queue<>();
        for(int i=0;i<entrada.length();i++){
            x=entrada.charAt(i);
            if(x=='"'||x=='!'||x=='¡'||x=='?'||x ==' '){
            especiales.offer(x);
            }else{
            pila.push(x);
            fila.offer(x);
            }
        }
        while(!pila.empty() || !fila.isEmpty()){
            char first = fila.remove();
            char last  = pila.pop();
            if(first!=last){
                return "No es palindrome";
            }
        }
        //System.out.println(pila.pop()+"     "+fila.element());
        return "Es palindrome";
    }
    
    public static String endX(String str){
        if(str.equalsIgnoreCase("")){
            return "";
        }else{
            String temp = str.substring(0,1);
            if(!temp.equalsIgnoreCase("x")){
                return temp+endX(str.substring(1));
            }else{
                return endX(str.substring(1))+temp;
            }
        }
    }
    //Mochila
    public static LinkedList<Item> rellenarMochila(LinkedList<Item> l){
        LinkedList<Double> ganancias = new LinkedList<Double>();
        LinkedList<Double> mayoresGanancias = new LinkedList<Double>();
        LinkedList<Item> elementos = new LinkedList<Item>();
        double peso=0;
        for(int i=0; i<l.size();i++){
            Item x=l.get(i);
            double y = x.ganancia(x.valor, x.peso);
            ganancias.addFirst(y);
        }
        
        while(peso<=100){
            for(int i=0; i<ganancias.size();i++){
                for(int j=1; j<ganancias.size();i++){
                    if(ganancias.get(i)>ganancias.get(j)){
                        mayoresGanancias.addFirst(ganancias.removeFirst());
                    }
                }
            }
        }
        for(int i=0; i<mayoresGanancias.size();i++){
            if(mayoresGanancias.get(i).equals(l.get(i).ganancia(l.get(i).valor, l.get(i).peso))){
                elementos.addFirst(l.get(i));
            }
        }
        return elementos;
    }
    
    public static void main(String[] args) {
        
        
        LinkedList<Item> L = new LinkedList<Item>();
        for(int i=0; i<=99; i++){
            int numero = (int) (Math.random() * 25) + 1;
            int numero2 = (int) (Math.random() * 25) + 1;
            L.addFirst(new Item(numero, numero2));
        }
        
        
        
        //programa();
        LinkedList<Integer> lista = new LinkedList<Integer>();
        lista.addFirst(1);
        lista.addFirst(2);
        lista.addFirst(3);
        lista.addFirst(4);
        lista.addFirst(5);
        lista.addFirst(6);
        System.out.println("49 en binario: "+baseString(49, 8));
        System.out.println("11 en binario: "+baseString(11, 5));
        System.out.println("255 en binario: "+baseString(255, 8));
        String cadenaPrueba = "hoxxlaa";
        //System.out.println(cadenaPrueba.substring(0, 1)); //Saca de una cadena los caracteres indicados en el parametro indicado
        //System.out.println(cadenaPrueba.substring(1)); //Elimina el primer caracter de la cade especificada
        System.out.println(endX(cadenaPrueba));
        System.out.println(numToNames(999876));
        BinaryNode root = new BinaryNode(1);
        BinaryNode node1 = new BinaryNode(2);
        BinaryNode node2 = new BinaryNode(3);
        BinaryNode node3 = new BinaryNode(4);
        BinaryNode node4 = new BinaryNode(5);
        BinaryNode node5 = new BinaryNode(6);
        BinaryNode node6 = new BinaryNode(7);
        
        BinaryNode raiz = new BinaryNode(1);
        BinaryNode nodo1 = new BinaryNode(2);
        BinaryNode nodo2 = new BinaryNode(3);
        BinaryNode nodo3 = new BinaryNode(4);
        BinaryNode nodo4 = new BinaryNode(5);
        BinaryNode nodo5 = new BinaryNode(6);
        BinaryNode nodo6 = new BinaryNode(7);
        
        root.leftChild=node1;
        root.rightChild=node2;
        node1.leftChild=node3;
        node1.rightChild=node4;
        node2.leftChild=node5;
        node2.rightChild=node6;
        
        raiz.leftChild=nodo1;
        raiz.rightChild=nodo2;
        nodo1.leftChild=nodo3;
        nodo2.rightChild=nodo4;
        nodo4.leftChild=nodo5;
        nodo4.rightChild=nodo6;
        
        System.out.println("Numero de nodos en el arbol: "+treeSize(root));
        System.out.println("Numero de nodos sin hermanos en el arbol: "+CountOneChild(raiz));
        System.out.println(Arrays.toString(lista.toArray()));
        System.out.println(Arrays.toString(lista.toArray()));
        
        Node<Integer> front = null, newNode,curr,nextNode;
                int i;
                
                front = new Node<Integer>(8);
                newNode = new Node<Integer>(5);
                newNode.next=front;
                front.next=newNode;
                
                ;
                System.out.println(front.next.value);
                System.out.println(newNode.next.value);
                
                
         LinkedList<Integer> list = new LinkedList<>();
         list.addLast(1);
         list.addLast(2);
         list.addLast(3);
         list.addLast(4);
         list.addLast(5);
         LinkedList<Integer> list2 = new LinkedList<>();
         list2.addLast(1);
         list2.addLast(2);
         list2.addLast(3);
         list2.addLast(4);
         list2.addLast(5);
         
         LinkedList<Integer> list3 = new LinkedList<>();
         list3.addLast(1);
         list3.addLast(2);
         list3.addLast(3);
         list3.addLast(4);
         list3.addLast(5);
         
         //list.countValuee(2);
         //System.out.println("Veces que aparece: "+list.countValuee(2));
         System.out.println("Lista original: "+Arrays.toString(list.toArray()));
         //list.reverseOrderrr(0, 3);
         //System.out.println("Lista modificada: "+Arrays.toString(list.toArray()));
         System.out.println("Lista original: "+Arrays.toString(list2.toArray()));
         System.out.println("Las contienen? "+equaals(list, list2));
         LinkedList<Integer> numeros = new LinkedList<>();
         insertListt(list2, list3, 2);
         System.out.println(Arrays.toString(list2.toArray()));
         String str = "hola123";
         cleanString(str);
         System.out.println(cleanString(str));
         System.out.println(Arrays.toString(list2.toArray()));
         insertInOrder(list2, 8);
         
         System.out.println(Arrays.toString(list2.toArray()));
         moveToBeginning(list2, 5);
         System.out.println(Arrays.toString(list2.toArray()));
         LinkedList<Integer> a = new LinkedList<Integer>();
         a.addFirst(0);
         a.addFirst(1);
         a.addFirst(2);
         a.addFirst(3);
         a.addFirst(4);
         a.addFirst(5);
         a.addFirst(6);
         a.addFirst(7);
         a.addFirst(8);
         a.addFirst(9);
         a.addFirst(10);
         eraseInOrder(a, 3, true);
         System.out.println(Arrays.toString(a.toArray()));
         
         
    }
    
}
