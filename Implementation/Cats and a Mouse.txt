import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
		int[] x = new int [q];
		int[] y = new int [q];
		int[] z = new int [q];
        for(int a = 0; a < q; a++){
            x[a] = in.nextInt();
            y[a] = in.nextInt();
            z[a] = in.nextInt();
        }
		
        for(int a = 0; a < q; a++){
			if( Math.abs(z[a] - x[a]) < Math.abs(z[a] - y[a])){
				System.out.println("Cat A");
			}
			else if( Math.abs(z[a] - x[a]) > Math.abs(z[a] - y[a])){
				System.out.println("Cat B");
			}else {
				System.out.println("Mouse C");
			}
		}
    }
}
