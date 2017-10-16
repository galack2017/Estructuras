package tarea03;
import java.util.Arrays;

public class Main {
    
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
                Impresora impresora = new Impresora();
                impresora.printDocument(cadena2);
                impresora.printDocument(cadena1);
                
                impresora.runPrinter();
                impresora.printDocument(cadena3);
                impresora.runPrinter();
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
	}
}
