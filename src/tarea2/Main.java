package tarea2;

import java.util.Arrays;
import java.util.Random;

public class Main {
    
    
        
        public static boolean isPalindrome(String word){
           LinkedList<Character> letters= new LinkedList<Character>();
           for(int i=0; i<word.length();i++){
               char letter=word.charAt(i);
               if(Character.isLetter(letter))
                     letters.addLast(Character.toLowerCase(letter));
               
           }
           while(letters.size()>1){
               if(!letters.getFirst().equals(letters.getLast()))
                   return false;
               letters.removeFirst();
               letters.removeLast();
           }
           
           return true;
        }
        
        public static int linearSearch(int[] x, int objetivo){
        
        for(int i=0; i<x.length;i++){
            if(objetivo == x[i])
                return i;
            if(x[i]>objetivo)
                return -1;
        }
        return -1;
    }
        
        public static int binarySearch(int []x, int objetive){
            int min =0;
            int max = x.length-1;
            int mid=0; 
            while(min <= max){
                mid = min+ (max-min)/2;
                
                if(objetive<x[mid]){
                    max=mid-1;
                }
                if(objetive>x[mid]){
                    min=mid+1;
                }
                if(objetive==x[mid]){
                    return mid;
                }
            }
            return -1;
        }
        
        public static void shiftRight(int[] values, int start, int finish){
            int x=values[finish+1];
            for(int i=finish+1; i>start;i--){
               values[i]=values[i-1];
            }
            values[start]=x;
        }
        
        public static void insertionSort(int[] data){
            
            for(int i=1; i<data.length; i++){
                for(int j=0; j<=i ;j++){
                    if(data[i]<data[j]){
                        shiftRight(data,j,i-1);
                        
                    }
                }
       
            }
            
        }
        
        public static void selectionSort(int[]values){
            int pequeño=0;
            for(int i=1; i<values.length;i++){
                for(int j=0; j<values.length;j++){
                    if(values[i]<values[j]){
                        pequeño=values[i];
                        values[i]=values[j];
                        values[j]=pequeño;
                    }
                }
            }
            
        }
        
        public static LinkedList<Character> jumbleLetters(String word){
            LinkedList<Character> letters = new LinkedList<Character>();
            int x =0;
            Random rnd = new Random();
            int numero;

            for(int i=0;i<word.length();i++){
                numero= (int)(Math.random()*2);
                if(numero==1){
                    letters.addLast(word.charAt(i));
                } else {letters.addFirst(word.charAt(i));
                }
                }
            return letters;
        }
        
        
        
        
        

	public static void main(String[] args) {
                int [] arreglo = {12,1,2,3,4,7,9,34};
                int [] arreglo2 = {12,6,2,3,5,7,9,34,1};
		System.out.println("** TEST CIRCULAR DOUBLY-LINKEDLIST CLASS **");
		System.out.println("\t** USING INTEGERS **");
		LinkedList<Integer> iList = new LinkedList<Integer>();
		
		System.out.println("Testing: addFirst(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.addFirst(i);
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: isEmpty + removeFirst + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeFirst();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: addLast(i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i=0; i<10; i++) {
			iList.addLast(i);
			System.out.println(iList);	
		}
		System.out.println();

		System.out.println("Testing: isEmpty + removeLast + toString");
		System.out.println(iList);
		while(!iList.isEmpty()) {
			iList.removeLast();
			System.out.println(iList);
		}
		System.out.println();
		
		System.out.println("Testing: add(2 * i | i >= 0 && i < 10) + toString");
		System.out.println(iList);
		for(int i = 0; i < 10; i++) {
			iList.add(i, i * 2);
			System.out.println(iList);
		}
		System.out.println("Testing: add(4, 7) + toString");
		iList.add(4, 7);
		System.out.println(iList);
		System.out.println("Testing: add(8, 13) + toString");
		iList.add(8, 13);
		System.out.println(iList);
		System.out.println("Testing: add(0, -1) + toString");
		iList.add(0, -1);
		System.out.println(iList);
		System.out.println("Testing: add(size(), 20) + toString");
		iList.add(iList.size(), 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: remove(6) + toString");
		System.out.println(iList);
		iList.remove(6);
		System.out.println(iList);
		System.out.println("Testing: remove(new Integer(6)) + toString");
		iList.remove(new Integer(6));
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: size + indexOf + get");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Get element at index " + iList.indexOf(iList.get(i)) + ": " + iList.get(i));
		}
		System.out.println();
		
		System.out.println("Testing: size + contains");
		for(int i=0; i<iList.size(); i++) {
			System.out.println("Is element " + i + " contained in the list? " + iList.contains(i));
		}
		System.out.println();
		
		System.out.println("Testing: getFirst + toString");
		System.out.println(iList);
		System.out.println(iList.getFirst());
		System.out.println();
		
		System.out.println("Testing: getLast + toString");
		System.out.println(iList);
		System.out.println(iList.getLast());
		System.out.println();
		
		System.out.println("Testing: set(3, 20) + toString");
		System.out.println(iList);
		iList.set(3, 20);
		System.out.println(iList);
		System.out.println();
		
		System.out.println("Testing: toArray");
		Object[] array = iList.toArray();
		System.out.println(array);
		if(array != null) {
			for(int i=0; i<array.length; i++)
				System.out.print(array[i] + " ");
			System.out.println();
		}
		System.out.println();
		
		System.out.println("Testing: clear + toString");
		System.out.println(iList);
		iList.clear();
		System.out.println(iList);
		System.out.println();
		
		System.out.println("\t** USING STRINGS **");
		LinkedList<String> strLinkedList = new LinkedList<String>();
		strLinkedList.addLast("Hello");
		strLinkedList.addLast("World");
		System.out.println(strLinkedList);
		strLinkedList.remove("World");
		System.out.println(strLinkedList);
		System.out.println();
                
                
                System.out.println(isPalindrome("perro"));
                System.out.println(isPalindrome("Anita lava la tina"));
                System.out.println(jumbleLetters("tank"));
                System.out.println("Linear Search: "+linearSearch(arreglo, 34));
                //System.out.println(binarySearch(arreglo, 2));
                System.out.println("Binary Search: "+binarySearch(arreglo, 34));
                insertionSort(arreglo);
                System.out.println(Arrays.toString(arreglo));
                System.out.println(Arrays.toString(arreglo2));
                selectionSort(arreglo2);
                System.out.println(Arrays.toString(arreglo2));
                //shiftRight(arreglo, 1, 4);
                //System.out.println(Arrays.toString(arreglo));
                
	}
}
