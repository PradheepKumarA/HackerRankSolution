import java.io.*;

class PermutationCharArrayRecursion{
	public static void main(String[] ags){
		permutation("abc".toCharArray() , 3);
	}
	
	static void permutation(char[] ch , int n){
		if(n == 1){
			System.out.println(ch);
		}
		for(int i=0 ; i<n ; i++){
			swap(ch , i , n-1);
			permutation(ch , n-1);
			swap(ch , i , n-1);
		}
	}
	
	static void swap(char[] ch , int i ,int j){
		char temp = ch[i];
		ch[i] = ch[j];
		ch[j] = temp;
	}
}