import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
		long repeated = 0;
		char [] ch = s.toCharArray();
		long addon=0;

		for(int i=0 ; i<ch.length ; i++){
			if(ch[i] == 'a'){
				repeated++;
				if(i<(n%ch.length)){
					addon++;
				}
			}
		}
		repeated = (n/ch.length)*repeated + addon;
		System.out.println(repeated);
	}
}
