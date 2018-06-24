import java.io.*;

class PermutationStringRecursion{
	public static void main(String[] iop){
		permutation("" , "abc");
	}
	
	
	public static void permutation(String prefix , String str){
		int length = str.length();
		if(length == 0){
			System.out.println(prefix);
			return;
		}
		for(int i=0 ; i<length ; i++){
			permutation( prefix + str.charAt(i) , str.substring(0,i) + str.substring(i+1));
		}
	}
}