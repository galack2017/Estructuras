package tarea03;
import java.util.Arrays;

public class Main {
    
    
       
        //Examen 3
        String cadena;
        public static String allStar(String str){
            if("".equals(str)){
                return "";
            }else{
                String cadena = str.substring(0, 1)+"*";
                //int x=1;
                return cadena + allStar(str.substring(1));
            }
        }
        
        public static String endX(String str){
            String cadena = str.substring(0, 1);
            if(!cadena.equalsIgnoreCase("x")){
               return str; 
            }else{
                String cadenaNueva = str.substring(1);
                return endX(cadenaNueva)+cadena;
            }
        }
        
        
        
        
        
        public static LinkedList<Integer> intersect(LinkedList<Integer> list1, LinkedList<Integer>list2){
            LinkedList <Integer> lista = new LinkedList<Integer>();
            while(!list1.isEmpty()){
                for(int i=0;i<list1.size();i++){
                    int x=list1.get(i);
                    int y=list2.get(i);
                    if(x==y){
                        lista.addFirst(y);
                    }
                    list1.remove(x);
                }
            }
            return lista;
        }
        
        
        
        
        public static LinkedList<Integer> difference(LinkedList<Integer> list1,LinkedList<Integer> list2){
            LinkedList <Integer> lista = new LinkedList<Integer>();
            int x=0;
            int y=0;
            while(!list1.isEmpty()){
                for(int i=0;i<list1.size();i++){
                    x=list1.removeLast();
                    y=list2.get(i);
                    if(x!=y){
                        lista.addFirst(y);
                    }
                }
            }
            return lista;
        }
        
        
        
        
        
    
        //Ejercicios extra
        public static String toBinary(int n){
            if(n==0){
                return "";
            }else{
                int x=n%2;
                return toBinary(n/2)+x;
            }
        }
    
        //Ejercicios con Filas
        public static Queue<Integer> merge(Queue<Integer> q1, Queue<Integer> q2){
            Queue<Integer> fila = new Queue<Integer>();
            while(!q1.isEmpty() && !q2.isEmpty()){
                if(q1.element()>q2.element()){
                    fila.offer(q1.remove());
                }else{
                    if(q1.element()<q2.element()){
                    fila.offer(q2.remove());
                    }else{
                      fila.offer(q1.remove());
                      fila.offer(q2.remove());  
                    }
                }
            }
            if(!q1.isEmpty()){
                    while(!q1.isEmpty()){
                        fila.offer(q1.remove());
                    }
                }
            if(!q2.isEmpty()){
                    while(!q2.isEmpty()){
                        fila.offer(q2.remove());
                    }
                }
            return fila;
        }
        
    
        //Ejercicos recursión
        public static int max(LinkedList<Integer> list){
            if(list.isEmpty()){
                return Integer.MIN_VALUE;
            }else{
                int mayor=list.removeFirst();
                int menor=max(list);
                if(mayor > menor){
                    return mayor;
                }else{
                    return menor;
                }
            }
        }
        
        public static int consecutiveAddition(int start, int end){
            if(start>end){
                return 0;
            }else{
                return start+consecutiveAddition(start+1, end);
            }
        }
    
    
        public static int gcd(int m, int n){
            if(m==n){
                return m;
            }else{
                if(m>n){
                    return gcd(m-n, n);
                }
                if(n>m){
                    return gcd(m, n-m);
                }
            }
            return 0;
        }
        
        public static int pow(int base, int exponent){
            if(exponent==0){
                return 1;
            }else{
                return base * pow(base,exponent-1);
            }
        }
    
            //Parte 1 a(bc)de
        public static String reverseParentheses(String s){
            Stack<Character> caracter = new Stack<>();
            Stack<Character> almacenar = new Stack<>();
            Stack<Character> resultante = new Stack<>();
            Queue<Character>cola= new Queue<>();
            int count0=0,count=0;
            for(int i=s.length()-1;i>=0;i--){
               char symbol = s.charAt(i);
               caracter.push(symbol);
            }
            //for(int i=0; i<s.length();i++)
            
            while(!caracter.empty()){
                //System.out.println((caracter.peek()));
                if(caracter.peek().equals('(')){
                    
                    count0++;
                   caracter.pop();
                   while(!caracter.peek().equals(')')){
                       
                       almacenar.push(caracter.pop());
                       count++;
                       //System.out.println(Arrays.toString(cola.toArray()));
                       //almacenar.push(caracter.pop());
                       
                   }
                   if(caracter.peek().equals(')')){
                       count0++;
                       caracter.pop();
                   }
                       
                   for(int i=count-1;i>=0;i--){
                       resultante.push(almacenar.pop());
                   }
                   //caracter.pop();
                    
               }
                
                resultante.push(caracter.pop());
            }
            String res=""; 
            String res2="";
            
            for(int i=s.length()-count0-1;i>=0;i--){
                res+=resultante.pop();
            }
            for(int i=res.length()-1;i>=0;i--){
                res2+=res.charAt(i);
            }
            
            return "Resultado : "+res2;
            
        }
        
        public static String reversePa(String cadena){
            Stack<Character> letters = null;
            String result = "";
            
            for(int i=0;i<cadena.length();i++){
                char ch = cadena.charAt(i);
                if(ch=='('){
                    letters = new Stack<Character>();
                }else if (ch == ')'){
                    while(!letters.empty()){
                        result+=letters.pop();
                    }
                    letters=null;
                }else{
                    if(letters != null){
                        letters.push(ch);
                    }else{
                        result+=ch;
                    }
                }
            }
            return result;
        }
        
        
        public static void quickSort(int values[],int start,int end){
            //If the list has no more tahn one element, it's sorted
            if(start>=end){
                return;
            }
            
            //Use the first item as the dividing item
            int divider=values[start];
            
            //Move items < divider to the fornt of the array and
            //items >= divider to the end of the array
            Stack <Integer> mayores = new Stack<>();
            Stack <Integer> menores = new Stack<>();
            
            for(int i=start+1;i<=end;i++){
                if(values[i]<divider){
                    mayores.push(values[i]);
                }else{
                    menores.push(values[i]);
                }
            }
            System.out.println("Mayores"+Arrays.toString(mayores.toArray()));
            System.out.println("mENORES:"+Arrays.toString(menores.toArray()));
            int i = start;
            while(!mayores.empty()){
                values[i++]=mayores.pop();
            }
            int middle=i++;
            values[middle]=divider;
            while(!menores.empty()){
                values[i]=menores.pop();
            }
            
            //Recursively sort the two halves
            quickSort(values,start,middle-1);
            quickSort(values,middle+1,end);
        }
        
        
        public static void MergeSort(int []values,int scratch[],int start,int end){
            if(start>=end){
                return;
            }else{
                int midpoint = (start+end)/2;
                int leftIndex=start;
                int rigthIndex=midpoint+1;
                int scratchIndex=leftIndex;
                MergeSort(values, scratch, start, midpoint);
                MergeSort(values, scratch, midpoint+1, end);
                while(leftIndex<=midpoint && rigthIndex <=end){ 
                    if(values[leftIndex]<=values[rigthIndex]){
                        scratch[scratchIndex]=values[leftIndex];
                        leftIndex=leftIndex+1;
                    }else{
                        scratch[scratchIndex]=values[rigthIndex];
                        rigthIndex=rigthIndex+1;
                    }
                    scratchIndex=scratchIndex+1;
                }
               
                
                for(int i=rigthIndex;i<=end;i++){
                    //scratchIndex=midpoint+1;
                    scratch[scratchIndex]=values[i];
                    scratchIndex=scratchIndex+1;
                }
                
                for(int i=leftIndex;i<=midpoint;i++){
                    //scratchIndex=start;
                    scratch[scratchIndex]=values[i];
                    scratchIndex=scratchIndex+1;
                }
                
                
                for(int i=start;i<=end;i++){
                    values[i]=scratch[i];
                }
            }
            
        }
        
        
        public static String convertInfixToPostfix(String expr){
            Stack<String> pila=new Stack<>();
            Queue<String> resultante = new Queue<>();
            Queue<String> fila = new Queue<>();
            
            for(int i=0; i<expr.length();i++){
                char symbol = expr.charAt(i);
                fila.offer(symbol+"");
                }
            for(int i=0;i<expr.length();i++){
                String topElement = fila.remove();
                //System.out.println(topElement);
                if(topElement.equals("0")||topElement.equalsIgnoreCase("1")||topElement.equalsIgnoreCase("2")||topElement.equalsIgnoreCase("3")||topElement.equalsIgnoreCase("4")
                        ||topElement.equalsIgnoreCase("5")||topElement.equalsIgnoreCase("6")||topElement.equalsIgnoreCase("7")||topElement.equalsIgnoreCase("8")
                        ||topElement.equalsIgnoreCase("9")){
                    resultante.offer(topElement);
                }
                if(topElement.equalsIgnoreCase("(")){
                    pila.push(topElement);
                }
                if(topElement.equalsIgnoreCase("-") || topElement.equalsIgnoreCase("+") || topElement.equalsIgnoreCase("*") || topElement.equalsIgnoreCase("/")){
                    
                    while(!pila.empty() && !pila.peek().equalsIgnoreCase("(")){
                        String stackTop=pila.peek();
                        if(hasHigherPrecedence(stackTop, topElement)==true){
                            String cadena = pila.pop();
                            resultante.offer(cadena);
                        }
                    }
                    pila.push(topElement);
                }
                if(topElement.equalsIgnoreCase(")")){
                    
                    if(!pila.empty()&&!pila.peek().equalsIgnoreCase("(")){
                        String fuera = pila.pop();
                        resultante.offer(fuera);
                        if(!pila.empty()){
                            pila.pop();
                            while(!pila.empty()){
                              String quitar=pila.pop();
                              resultante.offer(quitar);
                                
                            }
                        }
                    }
                    
                }  
            }
            String result = "";
            int x=resultante.size();
            for(int i=0;i<x;i++){
            String cad= resultante.remove();
            result+=cad+" ";
        }
            
            return result+" ";
                
        }
        
        public static boolean hasHigherPrecedence(String stackTop, String operator) { 
            return !((stackTop.equals("+") || stackTop.equals("-"))
                &&          (operator.equals("*") || operator.equals("/")));
}
        
    
        public static int GenerarOperacion(int x, int y,char z){
            int numeroNuevo=0;
                    if(z=='+')
                        numeroNuevo=y+x;
                    if(z=='-')
                        numeroNuevo=y-x;
                    if(z=='/')
                        numeroNuevo=y/x;
                    if(z=='*')
                        numeroNuevo=y*x;
                    
                    return numeroNuevo;
        }
    
        public static String checkforBalance (String cadena){
            char right, left;
            int countL=0, countR=0;
            Stack<Character> caracteres = new Stack<>();
            for(int i=0; i<cadena.length();i++){
                char symbol = cadena.charAt(i);
                if(symbol == '(' || symbol == '[' || symbol == '{') {
                    caracteres.push(symbol);
                    countL++;
                }
                if(symbol == ')' || symbol == ']' || symbol == '}' ){
                    countR++;
                    if(countR>countL)
                        return "Missing Left Symbol\n";
                    right=symbol;
                    left=caracteres.pop();
                    if(right==')' && left !='(' || right==']' && left !='[' || right=='}' && left !='{' )
                        return "Error, the symbols are not equal\n";
                }
            }
            if(countL>countR)
                return "Missing Right Symbol\n";
            return "Correcto\n";
        }
        
        public static String postfixEval(String entrada){
            
            Stack<Integer> expresion = new Stack<>();
            int count=0,count2=0;
            int right, left;
            String resultado;
            int nuevo=0,nuevo2=0,numeroNuevo=0;
            for(int i=0; i<entrada.length();i++){
                
                //System.out.println(Arrays.toString(expresion.toArray()));
                char symbol = entrada.charAt(i);
                if(symbol == '0' ||symbol == '1' ||symbol == '2' ||symbol == '3' ||symbol == '4' ||symbol == '5' ||
                        symbol == '6' ||symbol == '7' ||symbol == '8' ||symbol == '9'){
                    
                    nuevo= Integer.parseInt(String.valueOf(symbol) );
                    expresion.push(nuevo);
                    count++;
                }
                if(symbol == '+' ||symbol == '/' ||symbol == '*' ||
                                symbol == '-'){
                    count2++;
                    left=expresion.pop();
                    if(expresion.empty()==true)
                        return "The expression has too many operators";
                    right=expresion.pop();
                    //System.out.println(Arrays.toString(expresion.toArray()));
                    numeroNuevo=GenerarOperacion(right, left, symbol);
                    expresion.push(numeroNuevo);
                    }
                } 
            if(count>count2+1)
                return "The expression has too many operators";
            resultado = String.valueOf(numeroNuevo);
            
            return "Resultado de "+entrada+" : "+resultado+"\n";
        }
        
        public static void Fibonacci(int x){
            Queue<Integer> cola = new Queue<>();
            int sum1,sum2,suma;
            cola.offer(1);
            cola.offer(1);
            for(int i=0;i<x;i++){
                sum1=cola.remove();
                sum2=cola.remove();
                System.out.println("This is the next element in the series: "+sum1);
                cola.offer(sum2);
                suma=sum1+sum2;
                cola.offer(suma);
            }
        }

        
        
        
	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Testing array reversing");
		int[] inputArray = {1, 2, 3, 4, 5};
		String cadena1 = "(((a{f{f(g)hh}}tyju))]";
                String cadena2= "245*/";
                String cadena3 = "imPrimeido";
                String cadena4= "3*(2-5)";
                String cadena5= "a(bc)de";
                String cadena6= "a(bcdefg)h";
                String cadena7= "(ab)(cd)(ef)g";
                BinaryNode root = new BinaryNode(4);
                BinaryNode node1 = new BinaryNode(1);
                BinaryNode node2 = new BinaryNode(2);
                BinaryNode node3 = new BinaryNode(3);
                BinaryNode node5 = new BinaryNode(5);
                BinaryNode node6 = new BinaryNode(6);
                BinaryNode node7 = new BinaryNode(7);
                BinaryNode node8 = new BinaryNode(8);
                root.leftChild=node2;
                root.rightChild=node5;
                node2.leftChild=node1;
                node2.rightChild=node3;
                node5.rightChild=node7;
                node7.leftChild=node6;
                node7.rightChild=node8;
                
                
                
                
                
                
		// TODO: push every item in inputArray into a Stack
		Stack<Integer> temporal = new Stack<Integer>();
                for(int i=1; i<=inputArray.length;i++){
                    temporal.push(i);
                }
                
		int[] outputArray = new int[inputArray.length];
		for(int i=0; i<outputArray.length;i++){
                    outputArray[i]=temporal.peek();
                    temporal.pop();
                }
		// TODO: pop every item in inputArray and save them in outputArray
		
		System.out.println("Input: " + Arrays.toString(inputArray));
		System.out.println("Output: " + Arrays.toString(outputArray));
		System.out.println();
		
		System.out.println("Testing train ordering");
		Stack<Integer> train = new Stack<Integer>();
		train.push(3);
		train.push(2);
		train.push(1);
		train.push(3);
		train.push(2);
		
                
		System.out.println("Train as it arrived to the station: " + Arrays.toString(train.toArray()));
		
		// TODO: sort the wagons in priority order
                
                Stack<Integer> temp = new Stack<Integer>();
                Stack<Integer> temp2 = new Stack<Integer>();
  
                temp.push(train.peek());
                train.pop();
                temp.push(train.peek());
                train.pop();
                temp2.push(train.peek());
                train.pop();
                temp2.push(train.peek());
                train.pop();
                train.push(temp.peek());
                temp.pop();
                train.push(temp.peek());
                temp.pop();
                train.push(temp2.peek());
                temp2.pop();
                train.push(temp2.peek());
                temp2.pop();
                
                
		
		System.out.println("Train ordered by priority: " + Arrays.toString(train.toArray()));
		System.out.println();
		
		Stack<Integer> towerOne = new Stack<Integer>();
		Stack<Integer> towerTwo = new Stack<Integer>();
		Stack<Integer> towerThree = new Stack<Integer>();
		
		towerOne.push(3);
		towerOne.push(2);
		towerOne.push(1);
                //towerThree.push(2);
		
		System.out.println("At the beginning");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		
		// TODO: run a simulation so that towerTwo ends with all discs in correct order.
                if(towerTwo.empty()==true){
                    towerTwo.push(towerOne.peek());
                    towerOne.pop();
                    if(towerThree.empty()==true){
                        towerThree.push(towerOne.peek());
                        towerOne.pop();
                        towerThree.push(towerTwo.peek());
                        towerTwo.pop();
                        towerTwo.push(towerOne.peek());
                        towerOne.pop();
                        towerOne.push(towerThree.peek());
                        towerThree.pop();
                        towerTwo.push(towerThree.peek());
                        towerThree.pop();
                        towerTwo.push(towerOne.peek());
                        towerOne.pop();
                        
                    }else{ System.out.println("No hay espacio suficiente para mover piezas");}
                    
                }else{
                if(towerThree.empty()==true){
                    towerThree.push(towerOne.peek());
                    towerOne.pop();
                    if(towerTwo.empty()==true){
                        towerTwo.push(towerOne.peek());
                        towerOne.pop();
                        towerTwo.push(towerThree.peek());
                        towerThree.pop();
                        towerThree.push(towerOne.peek());
                        towerOne.pop();
                        towerOne.push(towerTwo.peek());
                        towerTwo.pop();
                        towerThree.push(towerTwo.peek());
                        towerTwo.pop();
                        towerThree.push(towerOne.peek());
                        towerOne.pop();
                        
                    }else{ System.out.println("No hay espacio suficiente para mover piezas");}
                }
        }
                
                Queue<Integer> fila = new Queue<>();
                Queue<Integer> fila2 = new Queue<>();
                for(int i=5;i>=0;i--){
                    fila.offer(i);
                }
                for(int j=8;j>=3;j--){
                    fila2.offer(j);
                }
                fila.offer(-5);
                fila2.offer(-3);
		LinkedList<Integer> lista = new LinkedList<>();
                LinkedList<Integer> lista2 = new LinkedList<>();
                lista.addFirst(2);
                lista.addFirst(2);
                lista.addFirst(18);
                lista.addFirst(4);
                lista.addFirst(15);
                lista.addFirst(2);
                lista2.addFirst(1);
                lista2.addFirst(2);
                lista2.addFirst(3);
                lista2.addFirst(1);
                lista2.addFirst(18);
		System.out.println("At the end");
		System.out.println("Hanoi tower #1: " + Arrays.toString(towerOne.toArray()));
		System.out.println("Hanoi tower #2: " + Arrays.toString(towerTwo.toArray()));
		System.out.println("Hanoi tower #3: " + Arrays.toString(towerThree.toArray()));
		System.out.println();
                System.out.println(checkforBalance(cadena1));
                System.out.println(postfixEval(cadena2));
                Fibonacci(10);
                
                String x=convertInfixToPostfix(cadena4);
                System.out.println(x);
                System.out.println(reverseParentheses(cadena6));
               // System.out.println(reverseParentheses2(cadena6));
                int uArray[]={10,4,1,240,1024,23,21,3048,0,8000,1000,4,3,14,16,15,9};
                int scratch[]=new int[uArray.length];
                //System.out.println("Before: "+Arrays.toString(uArray));
                System.out.println("Antes del ordenamiento MergeSort: "+Arrays.toString(uArray));
                //quickSort(uArray, 0, uArray.length-1);
                //Aquí se ordena
                MergeSort(uArray,scratch,0,uArray.length-1);
                //System.out.println("QuickSort: "+Arrays.toString(uArray));
                System.out.println("MergeSort: "+Arrays.toString(uArray));
                //root.preorderTraversal();
                //root.inorderTraversal();
                //root.postorderTraversal();
                root.depthFirstTraversal();
                System.out.println(gcd(90, 126));
                System.out.println(pow(2, 4));
                //System.out.println(max(lista));
                System.out.println(consecutiveAddition(1, 7));
                System.out.println(Arrays.toString(lista.toArray()));
                System.out.println(lista2.count(1));
                System.out.println(Arrays.toString(lista2.toArray()));
                //System.out.println(lista2.removeFirstOcurrence(2));
                System.out.println(Arrays.toString(lista2.toArray()));
                //System.out.println(lista2.removeLastOcurrence(1));
                System.out.println(Arrays.toString(lista2.toArray()));
                lista2.addFirst(1);
                
                System.out.println(Arrays.toString(lista2.toArray()));
                System.out.println("Ultimo indice: "+lista2.LastIndexoF(2));
                System.out.println(Arrays.toString(fila.toArray()));
                System.out.println(Arrays.toString(fila2.toArray()));
                Queue <Integer> res = merge(fila, fila2);
                System.out.println(Arrays.toString(res.toArray()));
                System.out.println(toBinary(9));
                String xy = "xxhixx";
                //allStar(xy);
                //endX(xy);
                System.out.println(lista);
                System.out.println(lista2);
                System.out.println(intersect(lista, lista2));
                System.out.println(allStar(xy));
                System.out.println(endX(xy));
                System.out.println(difference(lista, lista2));
                
	}
}
