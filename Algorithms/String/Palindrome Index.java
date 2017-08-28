import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution{

    static int palindromeIndex(String s){
        // Complete this function
		int length = s.length();
		for(int i=0 ; i<length/2 ; i++){
			if(s.charAt(i) != s.charAt(length-1-i)){
				if(isPalindrome(s.substring(i,length-1-i)) ) {
					return length-1-i;
				}else if(isPalindrome(s.substring(i+1,length-i)) ) {
					return i;
				}else{
					break;
				}
			}
		}
		return-1;
    }
	
    static boolean isPalindrome(String s){
		for(int i=0 ; i<s.length()/2 ; i++){
			if(s.charAt(i) != s.charAt(s.length()-1-i)){
				return false;
			}
		}
		return true;
    }
	
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}