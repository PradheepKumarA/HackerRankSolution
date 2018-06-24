import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String twoStrings(String s1, String s2){
        // Complete this function
		while(s1.length()>0 ){
			if(s2.indexOf("" + s1.charAt(0)) != -1 ){
				return"YES";
			}
			s1=s1.replace(s1.charAt(0) + "" , "");
		}
		return "NO";
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s1 = in.next();
            String s2 = in.next();
            String result;
			if(s1.length() < s2.length()){
				result = twoStrings(s1, s2);
			}else{
				result = twoStrings(s2, s1);
			}
            System.out.println(result);
        }
    }
}
