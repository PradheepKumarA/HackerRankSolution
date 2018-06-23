import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int l = in.nextInt();
		String[]knowledge = new String[n];
		for(int i=0 ; i<n ;i++ ){
			knowledge[i]=in.next();
		}
		int maxcount=0;
		int noOfMax=0;
		for(int i=0 ; i<n-1 ; i++){
			for(int j=i+1 ; j<n ; j++){
				int count=0;
				for(int k=0 ; k<l ; k++){
					if(knowledge[i].charAt(k)=='1' || knowledge[j].charAt(k)=='1'){
						count++;
					}
				}
				if(maxcount < count){
					maxcount=count;
					noOfMax=1;
				}else if(maxcount == count){
					noOfMax++;
				}
			}
		}
		System.out.println(maxcount);
		System.out.println(noOfMax);
    }
}

/*
Sample Input\
4 5
10101
11100
11010
00101

Sample Output
5
2
*/