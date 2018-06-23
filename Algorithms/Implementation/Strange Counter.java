import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong();
		long counterStarter=3;
		while(true){
			if(t>counterStarter){
				t-=counterStarter;
				counterStarter*=2;
			}else{
				counterStarter=counterStarter-t+1;
				break;
			}
		}
		System.out.println(counterStarter);
    }
}