import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
		int length = S.length();
		int altered=0;
		for(int i=0 ; i<length ; i+=3 ){
			if(S.charAt(i) != 'S' ){
				altered++;
			}
			if(S.charAt(i+1) != 'O' ){
				altered++;
			}
			if(S.charAt(i+2) != 'S' ){
				altered++;
			}
		}
		System.out.print(altered);
    }
}
