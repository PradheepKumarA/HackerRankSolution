import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int Q = in.nextInt();
        for(int a0 = 0; a0 < Q; a0++){
            int n = in.nextInt();
            String b = in.next();
			int[]charArray = new int[26];
			boolean containSingleChar = false;
			if(!b.contains("_")){
				int index=0;
				int length = b.length();
				for(int i=0 ; i<length ; i++){
					if(!((i<length-1 && b.charAt(i) == b.charAt(i+1)) || (i>0 && b.charAt(i) == b.charAt(i-1)))){
						containSingleChar = true;
						break;
					}
				}
			}else{
				for(int i=0 ; i<b.length() ; i++){
					if(b.charAt(i)!='_'){
						charArray[b.charAt(i)-65]++;
					}
				}
				
				for(int i=0 ; i<26 ; i++){
					if(charArray[i] == 1){
						containSingleChar = true;
						break;
					}
				}
			}
			if(containSingleChar){
				System.out.println("NO");
			}else{
				System.out.println("YES");
			}
        }
    }
}