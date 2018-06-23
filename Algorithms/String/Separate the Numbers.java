import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String d = in.next();
			String s;
            // your code goes here
			boolean found = false;
			long first =0;
			for(int i=1 ; i<=d.length()/2 ; i++){
				s=d;
				String subString = s.substring(0,i);
				long number = first = Long.parseLong(subString);
				s=s.replaceFirst( subString ,"");
				while( s.length() > 0 && s.indexOf(String.valueOf(number+1)) == 0){
					s=s.replaceFirst( String.valueOf(number+1) ,"");
					number++;
				}
				if(s.length() ==0){
					found = true;
					break;
				}
			}
			System.out.println(found? "YES " + first : "NO");
        }
    }
}