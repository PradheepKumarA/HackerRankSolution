import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
		String original = "hackerrank";
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            // your code goes here
			int pointer=0;
			for(int i=0 ; i<s.length() && pointer<original.length() ; i++){
				if( s.charAt(i) == original.charAt(pointer)){
					pointer++;
				}
			}
			if(pointer == original.length()){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
        }
    }
}
