package tarea03;
import java.util.Arrays;

public class Main {
    
            //Parte 1
        public static String reverseParentheses(String s){
            Stack<Character> caracter = new Stack<>();
            Stack<Character> almacenar = new Stack<>();
            Stack<Character> resultante = new Stack<>();
            int count0=0;
            for(int i=s.length()-1;i>=0;i--){
               char symbol = s.charAt(i);
               caracter.push(symbol);
                System.out.println(Arrays.toString(caracter.toArray())+ " Aquí");
            }
            //for(int i=0; i<s.length();i++)
            
            while(!caracter.empty()){
                //System.out.println((caracter.peek()));
                if(caracter.peek().equals('(')){
                    count0++;
                   caracter.pop();
                   char x=caracter.pop();
                   char y=caracter.pop();
                   char z=almacenar.push(y);
                   char q=almacenar.push(x);
                   resultante.push(y);
                   resultante.push(x);
               }
                if(caracter.peek().equals(')')){
                    count0++;
                    caracter.pop();
                }
                resultante.push(caracter.pop());
            }
            String res=""; 
            String res2="";
            
            for(int j=0;j<s.length()-count0;j++){
                res2+=resultante.pop();
            }
            for(int i=s.length()-count0-1;i>=0;i--){
                res+=res2.charAt(i);
            }
            
            return res;
            
        }
        
        //Parte 2 :
        public static String reverseParentheses2(String s){
            Stack<Character> caracter = new Stack<>();
            Stack<Character> almacenar = new Stack<>();
            Stack<Character> resultante = new Stack<>();
            Stack<Character> resultante2 = new Stack<>();
            Stack<Character> resultante3 = new Stack<>();
            for(int i=s.length()-1;i>=0;i--){
               char symbol = s.charAt(i);
               caracter.push(symbol);
                System.out.println(Arrays.toString(caracter.toArray())+ " Aquí");
            }
            //for(int i=0; i<s.length();i++)
            
            while(!caracter.empty()){
                //System.out.println((caracter.peek()));
                if(caracter.peek().equals('(')){
                   caracter.pop();
                   char x=caracter.pop();
                   if(caracter.peek().equals('(')){
                       while(!caracter.peek().equals(')')){
                           resultante2.push(caracter.pop());
                       }
                       if(caracter.peek().equals(')')){
                           caracter.pop();
                           resultante3.push(resultante2.pop());
                       }
                   }
                   char y=caracter.pop();
                   char z=almacenar.push(y);
                   char q=almacenar.push(x);
                   resultante.push(y);
                   resultante.push(x);
               }
                if(caracter.peek().equals(')'))
                    caracter.pop();
                    resultante.push(caracter.pop());
            }
            String res=""; 
            String res2="";
            

            
            return res;
            
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
                String cadena6= "a(b(cde)fg)h";
                
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
                System.out.println(reverseParentheses(cadena5));
                System.out.println(reverseParentheses2(cadena6));
	}
}
