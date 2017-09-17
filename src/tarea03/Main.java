package tarea03;
import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		
		System.out.println("Testing array reversing");
		int[] inputArray = {1, 2, 3, 4, 5};
		
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
	}
}
