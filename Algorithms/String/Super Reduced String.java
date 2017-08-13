import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String super_reduced_string(String s){
        // Complete this function
		boolean changes;
		do{
			changes = false;
			char[] ch = s.toCharArray();
			s="";
			int len = ch.length;
			for(int i = 0 ; i<=len-1 ; i++ ){
				if( i!=len-1 && ch[i] == ch[i+1] ){
					changes = true;
					i++;
				}else{
					s += ch[i];
				}
			}
		}while(changes);
		return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = super_reduced_string(s);
		result = result.equals("")?"Empty String":result;
        System.out.println(result);
    }
}
