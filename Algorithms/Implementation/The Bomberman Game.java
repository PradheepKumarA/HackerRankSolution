import java.io.*;
import java.util.*;

public class Solution{
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner (System.in);
		int r = in.nextInt();
		int c = in.nextInt();
		int n = in.nextInt();
		char [][]grid = new char[r][c];
		for(int i=0 ; i<r ; i++ ){
			grid[i]=in.next().toCharArray();
		}
		if( n!=0 && n%2==0){
			for(int i=0 ; i<r ; i++ ){
				for(int j=0 ; j<c ; j++ ){
					grid[i][j]='O';
				}
			}
		}else if(n>1){
			for(int count=(n/2)%2 ; count<=1 ; count++ ){
				for(int i=0 ; i<r ; i++ ){
					for(int j=0 ; j<c ; j++ ){
						if(grid[i][j] == 'O'){
							if(i-1>=0 && grid[i-1][j]!='O' ){
								grid[i-1][j]='-';
							}
							if(i+1<r && grid[i+1][j]!='O' ){
								grid[i+1][j]='-';
							}
							if(j-1>=0 && grid[i][j-1]!='O' ){
								grid[i][j-1]='-';
							}
							if(j+1<c && grid[i][j+1]!='O' ){
								grid[i][j+1]='-';
							}
						}
					}
				}
				for(int i=0 ; i<r ; i++ ){
					for(int j=0 ; j<c ; j++ ){
						grid[i][j] = grid[i][j] == 'O' || grid[i][j] == '-' ?'.':'O';
					}
				}
			}
		}
		for(int i=0 ; i<r ; i++ ){
			for(int j=0 ; j<c ; j++ ){
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
    }
}