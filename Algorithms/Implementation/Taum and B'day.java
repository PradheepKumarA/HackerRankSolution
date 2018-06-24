import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long b = in.nextLong();
            long w = in.nextLong();
            long x = in.nextLong();
            long y = in.nextLong();
            long z = in.nextLong();
			long count;
			if(x-y > z){
				count = (y+z)*b + y*w;
			}else if(y-x > z){
				count = x*b + (x+z)*w ;
			}else{
				count = x*b + y*w;
			}
			System.out.println(count);
        }
    }
}
