import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		String string[] = { "one" , "two" , "three" , "four" , "five" , "six" , "seven" , "eight" , "nine" , "ten" , "eleven" , "twelve" , "thirteen" , "fourteen" , "quarter" , "sixteen" , "seventeen" , "eighteen" , "nineteen" , "twenty" , "twenty one" , "twenty two" , "twenty three" , "twenty four" , "twenty five" , "twenty six" , "twenty seven" , "twenty eight" , "twenty nine" , "half" };
		Scanner in = new Scanner(System.in);
		int hour = in.nextInt();
		int minutes = in.nextInt();
		if(minutes == 0){
			System.out.println(string[hour-1] + " o' clock");
		}else if(minutes <= 30 && minutes%15 ==0 ){
			System.out.println( string[minutes-1] + " past " + string[hour-1] );
		}else if(minutes <= 30){
			System.out.println( string[minutes-1] + " minutes past " + string[hour-1] );
		}else if( minutes%15 ==0 ){
			System.out.println( string[60-minutes-1] + " to " + string[hour] );
		}else{
			System.out.println( string[60-minutes-1] + " minutes to " + string[hour] );			
		}
    }
}