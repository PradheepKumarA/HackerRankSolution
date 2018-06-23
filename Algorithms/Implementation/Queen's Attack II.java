import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	static int obstacle[][];
	static int n,l,rQueen,cQueen;
	static int pointer=0;
	

    public static void main(String[] args) throws FileNotFoundException{
        Scanner in = new Scanner(System.in);
//        Scanner in = new Scanner(new File("E:\\Codes\\hackerrank\\Algorithms\\Implementation\\input.text"));
        n = in.nextInt();
        l = in.nextInt();
        rQueen = in.nextInt()-1;
        cQueen = in.nextInt()-1;
		obstacle = new int[l][2];
        for(int a0 = 0; a0<l; a0++){
			int robstacle = in.nextInt()-1;
            int cobstacle = in.nextInt()-1;
			if(robstacle == rQueen || cobstacle == cQueen || (cobstacle+robstacle == cQueen+rQueen ) || checkDiagonal(robstacle,cobstacle)){
				obstacle[pointer][0] = robstacle;
				obstacle[pointer][1] = cobstacle;
				pointer++;
			}
//			obstacle[a0][0] = in.nextInt()-1;
//          obstacle[a0][1] = in.nextInt()-1;
		}
		
		int count=0;
		for(int i=cQueen-1 ; i>=0 ; i--){
			if(check(rQueen,i)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(int i=cQueen+1 ; i<n ; i++){
			if(check(rQueen,i)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(int i=rQueen-1 ; i>=0 ; i--){
			if(check(i,cQueen)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(int i=rQueen+1 ; i<n ; i++){
			if(check(i,cQueen)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		int i,j;
		for(i=cQueen+1,j=rQueen+1 ; i<n && j<n ; i++,j++){
			if(check(j,i)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(i=cQueen+1,j=rQueen-1 ; i<n && j>=0 ; i++,j--){
			if(check(j,i)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(i=cQueen-1,j=rQueen-1 ; i>=0 && j>=0 ; i--,j--){
			if(check(j,i)){
				break;
			}else{
				count++;				
			}
		}
//		System.out.println(count);
		for(i=cQueen-1,j=rQueen+1 ; i>=0 && j<n ; i--,j++){
			if(check(j,i)){
				break;
			}else{
				count++;				
			}
		}
		System.out.println(count);
    }
	
	static boolean checkDiagonal(int i , int j){
		if((rQueen-i)==(cQueen-j)){
			return true;
		}
		return false;
	}
	static boolean check(int i , int j){
		for(int k=0 ; k<pointer ; k++){
			if(obstacle[k][0]==i && obstacle[k][1]==j){
				return true;
			}
		}
		return false;
	}
}