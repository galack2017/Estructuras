/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciosRecursion;

/**
 *
 * @author alfonsoalquicer
 */
public class Ejercicios {
    
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }else{
            return n*factorial(n-1);
               }
    
    }
    
    public static int bunnyEars2(int bunnies) {
    int ears=0;
        if(bunnies==0){
            return 0;
        }else{
            if(bunnies%2==0){
            ears=3+bunnyEars2(bunnies-1);
        }else{
            ears=2+bunnyEars2(bunnies-1);
               }
        return ears;
        }
    }
    
    public static int bunnyEars(int bunnies) {

  if(bunnies==0){
    
	return 0;
  
		}else{
    
			return 2+bunnyEars(bunnies-1);
  

		      }

}



public static int fibonacci(int n) {
  if(n<=1){
    return n;
  }else{
    return  fibonacci(n-1)+fibonacci(n-2);
  }
}

public static int triangle(int rows) {
  if(rows==0){
    return 0;
  }else{
    return triangle(rows-1)+rows;
  }
}
public static int sumDigits(int n) {
  if(n==0){
    return 0;
  }else{
    return n%10+sumDigits(n/10);
  }
}
public static int count7(int n) {
  int count=0;
  if(n==0){
    return 0;
  }else{
    if(n%10==7){
      count++;
    }
    return count7(n/10)+count;
  }
}
public static int count8(int n) {
  int count=0;
  if(n==0){
    return 0;
  }else{
    if(n%10==8){
      count++;
      int num=n/10;
      if(num%10==8){
        count++;
      }
    }
    return count8(n/10)+count;
  }
}
public static int powerN(int base, int n) {
  if(n==1){
    return base;
  }else{
    return powerN(base, n-1)*base;
  }
}
public static int countX(String str) {
  int count=0;
  if(str.equalsIgnoreCase("")){
    return 0;
  }else{
    Character x= str.charAt(str.length()-1);
    if(x.equals('x')){
      count++;
    }
  }
  return count+ countX(str.substring(0, str.length()-1));
}

public static int countHi(String str) {
  int count=0;
  if(str.equalsIgnoreCase("")){
    return 0;
  }else{
    if(str.length()>1){
    Character x= str.charAt(str.length()-1);
    Character y = str.charAt(str.length()-2);
    if(x.equals('i')&&y.equals('h')){
      count++;
    } 
    }
  }
  return count + countHi(str.substring(0, str.length()-1));
}
public static String changeXY(String str) {
  String temp="";
  if(str.equalsIgnoreCase("")){
    return str;
  }else{
    
    Character x=str.charAt(str.length()-1);
    if(x.equals('x')){
      //str=str.substring(0, str.length()-1);
      temp+='y';
      
    }else{
      temp+=x;
    }
    
  }
  
  return changeXY(str.substring(0, str.length()-1))+temp;
}
public static boolean array6(int[] nums, int index){
  int l=nums.length;
  if(index>=l){
    return false;
  }
  if(nums[index]==6){
      return true;
  }
  
  return array6(nums,index+1);
}
public static int array11(int[] nums, int index){
  int count=0;
  int l=nums.length;
  if(index>=l){
    return 0;
  }
  if(nums[index]==11){
      count++;
  }
  
  return count+array11(nums,index+1);
}
    
    public static void main(String[] args) {
        
        int[]numeros={1,2,3,4,5,6,7,8,9,10,1,12,16,65,67,69,11,11,11,11,6666,6,6,61,11,111};
        int[]numeros2={1,2,3,4,5,7,8,9,10,11};
        System.out.println(factorial(6));
        System.out.println("Fibonacci: "+fibonacci(6));
        System.out.println(bunnyEars2(10));
        System.out.println(bunnyEars(5));
        System.out.println(count8(188));
        System.out.println(count7(17777));
        System.out.println(changeXY("xxxyyy"));
        System.out.println(countHi("ihihihihihihihiiiihi"));
        System.out.println(array11(numeros, 0));
        System.out.println(array6(numeros, 0));
        System.out.println(array6(numeros2, 0));
        System.out.println(countX("examenes"));
        System.out.println(powerN(3, 4));
        System.out.println(triangle(4));
        
    }
    
}
