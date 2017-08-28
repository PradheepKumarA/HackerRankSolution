import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int anagram(String s){
        // Complete this function
		int length = s.length();
		if(length%2 != 0){
			return -1;
		}
		char[] left = new char[26];
		char[] right = new char[26];
		for(int i=(length/2)-1 ; i>=0 ; i--){
			left[s.charAt(i)-97]++;
		}
		for(int i=length/2 ; i<length; i++){
			right[s.charAt(i)-97]++;
		}
		for(int i=0 ; i<26; i++){
			int min = left[i]<right[i]?left[i]:right[i];
			left[i] -= min;
			right[i] -= min;
		}
		int count=0;
		for( int x=0 ; x<26 ; x++ ){
			if( left[x] !=0 ){
				count += left[x];
			}
		}
		return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = anagram(s);
            System.out.println(result);
        }
    }
}