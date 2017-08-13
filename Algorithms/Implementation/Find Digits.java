import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		
		//inputs
		int t = in.nextInt();
		int n[] = new int[t];
		for(int i=0 ; i<t ; i++ ){
			n[i] = in.nextInt();
		}
		
		//bussiness logic
		int temp , digit , count;
		for(int i=0 ; i<t ; i++ ){
			count = 0;
			temp = n[i] ;
			while(temp != 0 ){
				digit = temp%10;
				if( digit!=0 && n[i]%digit == 0){
					count++;
				}
				temp /= 10; 
			}
			
			//output
			System.out.println(count);
		}
    }
}