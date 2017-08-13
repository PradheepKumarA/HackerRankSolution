import java.io.*;
import java.util.*;
import java.math.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		BigInteger bigInteger = new BigInteger(Integer.toString(n));
		System.out.println(factorial(bigInteger));
	}
	
	static BigInteger factorial(BigInteger n){
		if(n.compareTo(BigInteger.ONE) == 0){
			return BigInteger.ONE;
		}else{
			return n.multiply(factorial(n.subtract(BigInteger.ONE)));
		}
	}
}