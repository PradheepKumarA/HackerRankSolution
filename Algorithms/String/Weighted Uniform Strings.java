import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(new File("E:\\Codes\\hackerrank\\Algorithms\\String\\input.text"));
        String s = in.next();
		long[] defined = new long[s.length()];
		int pointer=0;
		for( int i=0 ; i<s.length() ; i++){
			if(i<s.length()-1 && s.charAt(i)==s.charAt(i+1)){
				int count=1;
				defined[pointer++]=(s.charAt(i)-'a'+1)*count;
				while(i<s.length()-1 && s.charAt(i) == s.charAt(i+1)){
					count++;
					defined[pointer++]=(s.charAt(i)-'a'+1)*count;
					i++;
				}
			}else{
				defined[pointer++]=s.charAt(i)-'a'+1;
			}
		}
        long n = in.nextLong();
        for(long a0 = 0; a0 < n; a0++){
            long x = in.nextLong();
            // your code goes here
			boolean contains = false;
			for( int i=0 ; i<pointer && !contains ; i++){
				if(x== defined[i]){
					contains=true;
					break;
				}
			}
			System.out.println(contains?"Yes":"No");
        }
    }
}