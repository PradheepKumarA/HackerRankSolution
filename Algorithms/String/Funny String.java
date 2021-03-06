import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String funnyString(String s){
        // Complete this function
		int length = s.length();
		for(int i=1 ; i<length ; i++ ){
			if(Math.abs(s.charAt(i) - s.charAt(i-1)) !=  Math.abs(s.charAt(length-i-1) - s.charAt(length-i))){
				return "Not Funny";
			}
		}
		return "Funny";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            String result = funnyString(s);
            System.out.println(result);
        }
    }
}
