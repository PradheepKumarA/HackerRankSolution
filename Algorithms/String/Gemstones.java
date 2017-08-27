import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		int shortestElement = 0;
		int shortestLength = 100;
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
			if(shortestLength>arr[arr_i].length()){
				shortestLength = arr[arr_i].length();
				shortestElement=arr_i;
			}
        }
		int result=0;
		while(arr[shortestElement].length()>0){
			char c = arr[shortestElement].charAt(0);
			boolean isBreakage = false;
			for(int j=0 ; j<shortestElement ; j++){
				if(!arr[j].contains(c+"")){
					isBreakage=true;
					break;
				}
			}
			for(int j=shortestElement+1 ; j< n ; j++){
				if(!arr[j].contains(c+"")){
					isBreakage=true;
					break;
				}
			}
			if(!isBreakage){
				result++;
			}
			arr[shortestElement]=arr[shortestElement].replace( c + "" , "" );
		}
        System.out.println(result);
    }
}
