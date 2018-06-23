import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String gameOfThrones(String s){
        // Complete this function
		int[] alph = new int[26];
		for(int i=s.length()-1 ; i>=0 ; i--){
			alph[s.charAt(i)-'a']++;
		}
		int count=0;
		for(int i=0 ; i<26 ; i++){
			if(alph[i]%2 == 1)count++;
		}
		if(count >1){
			return "NO";
		}else{
			return "YES";
		}
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = gameOfThrones(s);
        System.out.println(result);
    }
}
