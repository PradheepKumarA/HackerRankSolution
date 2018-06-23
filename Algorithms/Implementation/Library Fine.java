import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int aD = in.nextInt();
		int aM = in.nextInt();
		int aY = in.nextInt();
		int eD = in.nextInt();
		int eM = in.nextInt();
		int eY = in.nextInt();
		
		int fine = 0;
		if(aY > eY){
			fine = 10000;
		}else if(aY == eY && aM > eM){
			fine = (aM - eM )*500;
		}else if (aY == eY && aM==eM && aD > eD){
			fine = (aD - eD )*15;
		}
		System.out.print(fine);
	}
}