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
            int R = in.nextInt();
            int C = in.nextInt();
            String[] G = new String[R];
            for(int G_i=0; G_i < R; G_i++){
                G[G_i] = in.next();
            }
            int r = in.nextInt();
            int c = in.nextInt();
            String[] P = new String[r];
            for(int P_i=0; P_i < r; P_i++){
                P[P_i] = in.next();
            }
			
			boolean found = false;
			for(int i=0 ; i<R-r+1 ; i++ ){
				for(int j=0 ; j<C-c+1 ; j++ ){
					if(P[0].charAt(0) == G[i].charAt(j)){
						boolean temp=true;
						for(int l=0 ; l<r && temp ; l++ ){
							for(int m=0 ; m<c && temp ; m++){
								if(P[l].charAt(m) != G[i+l].charAt(j+m)){
									temp=false;
								}
							}
						}
						if(temp){
							found=true;
						}
					}
				}
			}
			System.out.println(found? "YES" : "NO");
        }
    }
}
