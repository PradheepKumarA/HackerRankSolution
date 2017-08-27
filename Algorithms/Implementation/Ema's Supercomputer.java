import java.io.*;
import java.util.*;

public class Solution {
	public static int maxArea = 0;
	public static int p[];
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		char [][]grid = new char[n][m];
		char [][]gridDuplicate = new char[n][m];
		for(int i=0 ; i<n ; i++){
			gridDuplicate[i]=in.next().toCharArray();
		}
		
		//logic
		int minSideDuplicate = Math.min(n,m);
		int minSide = minSideDuplicate;
		
		minSide = minSideDuplicate;
		while(minSide>0){			
			copy( grid , gridDuplicate , m , n );
			p = new int[minSide+1];
			for(int g=(minSide-1)/2 ; g>=0 ; g--){
				for(int i=g ; i<n-g ; i++){
					for(int j=g ; j<m-g ; j++){
						grid=check(grid,i,j,g);
					}
				}
			}
			getResult(minSide);
			
			copy( grid , gridDuplicate , m , n );
			p = new int[minSide+1];
			for(int g=(minSide-1)/2 ; g>=0 ; g--){
				for(int i=n-g-1 ; i>=g ; i--){
					for(int j=g ; j<m-g ; j++){
						grid=check(grid,i,j,g);
					}
				}
			}
			getResult(minSide);
			
			copy( grid , gridDuplicate , m , n );
			p = new int[minSide+1];
			for(int g=(minSide-1)/2 ; g>=0 ; g--){
				for(int i=n-g-1 ; i>=g ; i--){
					for(int j=m-g-1 ; j>=g ; j--){
						grid=check(grid,i,j,g);
					}
				}
			}
			getResult(minSide);
			
			copy( grid , gridDuplicate , m , n );
			p = new int[minSide+1];
			for(int g=(minSide-1)/2 ; g>=0 ; g--){
				for(int i=g ; i<n-g ; i++){
					for(int j=m-g-1 ; j>=g ; j--){
						grid=check(grid,i,j,g);
					}
				}
			}
			getResult(minSide);
			minSide--;
		}
		System.out.println(maxArea);
    }
	
	public static void getResult(int minSide){
		int area=0;
		for(int i=minSide ; i>=0 ; i--){
			if(p[i]!=0){
				if(area==0){
					area=(4*i)+1;
					p[i]--;
					i++;
				}else{
					area*=((4*i)+1);
					break;
				}
			}
		}
		maxArea=maxArea<area?area:maxArea;
	}
	
	
	public static char[][] check(char[][] grid , int i , int j , int g){
		if( grid[i][j] == 'G' ){
			boolean noBreak =  true;
			for(int h=1 ; h<=g && noBreak ; h++){
			if(grid[i-h][j] == 'B' || grid[i+h][j] == 'B' || grid[i][j-h] == 'B' || grid[i][j+h] == 'B'){
					noBreak=false;
				}
			}
			if(noBreak){
			p[g]++;
			grid[i][j]='B';
				for(int h=1 ; h<=g && noBreak ; h++){
					grid[i-h][j] = grid[i+h][j] = grid[i][j-h] = grid[i][j+h] = 'B';
				}
			}
		}
		return grid;
	}
	
	
	public static void copy(char[][] grid , char[][] gridDuplicate , int m , int n){	
		for(int i=0 ; i<n ; i++){
			for(int j=0 ; j<m ; j++){
				grid[i][j] = gridDuplicate[i][j];
			}
		}
	}

}