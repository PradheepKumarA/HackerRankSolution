import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        String s = in.next();
		char[] chars = new char[26];
		int pointer=0;
		String dupS = s + "";
		while(dupS.length()>0){
//System.out.println("before " + dupS);
			char ch = dupS.charAt(0);
			chars[pointer++]=ch;
			dupS=dupS.replace( "" + ch , "");
//System.out.println("after " + dupS);
		}
		
//		for(int i=0 ; i<pointer ; i++){
//			System.out.println(chars[i]);
//		}
	

		int max = 0;
		




	
		
    }
}
