import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String steps = in.next();
		int level=0 ,valley=0;
		for(char ch : steps.toCharArray()){
			if(ch == 'U'){
				level++;
			}else{
				level--;
				if(level == -1){
					valley++;
				}
			}
		}
		System.out.println(valley);
    }
}
