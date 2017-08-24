import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int n = in.nextInt();
            int[][] M = new int[n][n];
            for(int M_i=0; M_i < n; M_i++){
                for(int M_j=0; M_j < n; M_j++){
                    M[M_i][M_j] = in.nextInt();
                }
            }
            // your code goes here
			int row[] = new int[n];
			int column[] = new int[n];
			for(int i=0 ; i<n ; i++){
				for(int j=0 ; j<n ; j++){
					column[i]+=M[i][j];
					row[i]+=M[j][i];
				}
			}
			boolean possible=true;
			Arrays.sort(column);
			Arrays.sort(row);
			for(int i=0 ; i<n ; i++){
				if(row[i] != column[i]){
					possible=false;
				}
			}
			if(possible){
				System.out.println("Possible");
			}else{
				System.out.println("Impossible");
			}
        }
    }
}
