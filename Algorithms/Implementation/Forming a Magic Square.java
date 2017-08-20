import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] s = new int[3][3];
        for(int s_i=0; s_i < 3; s_i++){
            for(int s_j=0; s_j < 3; s_j++){
                s[s_i][s_j] = in.nextInt();
            }
        }
        //  Print the minimum cost of converting 's' into a magic square
		int[][] original = {{4,9,2} , {3,5,7} , {8,1,6}};
		int costMin=100;
		for(int k = 0 ; k< 4 ; k ++){
			int cost=0;
			int costs=0;
			for(int s_i=0; s_i < 3; s_i++){
				for(int s_j=0; s_j < 3; s_j++){
					cost+=Math.abs(original[s_i][s_j]-s[s_i][s_j]);
					costs+=Math.abs(original[s_j][s_i]-s[s_i][s_j]);					
				}
			}
			s=rotateMatrix(s,3);
			costMin=costMin>costs?costs:costMin;
			costMin=costMin>cost?cost:costMin;
		}
		System.out.println(costMin);
    }
	
	static int[][] rotateMatrix(int[][] matrix, int n) {
		int[][] ret = new int[n][n];
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j) {
				ret[i][j] = matrix[n - j - 1][i];
			}
		}
		return ret;
	}
}
