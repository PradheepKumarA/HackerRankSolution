import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
		Scanner in = new Scanner(System.in);
		char[] inputString = in.nextLine().toCharArray();
		in.close();
		
		//logic
		int alph[] = new int[26];
		for(char ch : inputString){
			if(ch>= 'A' && ch<= 'Z' ){
				alph[ch-'A']++;
			}
			if(ch>= 'a' && ch<= 'z' ){
				alph[ch-'a']++;
			}
		}
		boolean contains = true;
		for(int no : alph){
			if(no==0){
				contains=false;
			}
		}
		
		//output
		System.out.println(contains? "pangram" : "not pangram");
    }
}