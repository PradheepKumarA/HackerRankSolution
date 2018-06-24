import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		String str = in.next();
		str = str.replace(" ","");
		int length = str.length();
		int row = Math.round((float)Math.sqrt(length));
		int column;
		if(row>=Math.sqrt(length)){
			column = row;
		}else{
			column = row+1;
		}
		char[] ch = str.toCharArray();
		for(int i =0 ; i<column ; i++){
			for(int j = i ; j<ch.length ; j+=column){
				System.out.print(ch[j]);
			}
			System.out.print(" ");
		}
    }
}