import java.io.*;
import java.util.*;

public class Solution {

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
		int maxArea=0;
		int minSide = Math.min(n,m);
		while(minSide>0){
			for(int i=0 ; i<n ; i++){
				for(int j=0 ; j<m ; j++){
					grid[i][j] = gridDuplicate[i][j];
				}
			}
			
			int p[] = new int[minSide+1];
			for(int g=(minSide-1)/2 ; g>=0 ; g--){
				for(int i=g ; i<n-g ; i++){
					for(int j=g ; j<m-g ; j++){
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
					}
				}
			}
			
			//output
			System.out.println("minSide : " + minSide );
			for(int i=minSide ; i>=0 ; i--){
				System.out.println("  P[" + i + "] : " + p[i]);
			}
			
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
			minSide--;
			maxArea=maxArea<area?area:maxArea;
			System.out.println("area : " + area);
		}
		System.out.println(maxArea);
    }
}