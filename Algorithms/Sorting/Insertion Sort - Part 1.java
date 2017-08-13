import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void insertIntoSorted(int[] ar,int n) {
        // Fill up this function  
		int temp = ar[n-1];
		for(int i = n-1 ; i>=0 ; i-- ){
			if(i != 0 && temp < ar[i-1]){
				ar[i]=ar[i-1];
				printArray(ar);
			}else{
				ar[i]=temp;
				printArray(ar);
				break;
			}
		}
    }
    
/* Tail starts here */
     public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar,s);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
