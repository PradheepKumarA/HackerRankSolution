import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        char chars[] = in.next().toCharArray();
        int k = in.nextInt();
        for(int i=0 ; i<n ; i++){
            if(chars[i] >= 'A' && chars[i] <= 'Z'){
                System.out.print((char)(((chars[i]-'A')+k)%26 + 'A'));
            }else if(chars[i] >= 'a' && chars[i] <= 'z'){
                System.out.print((char)(((chars[i]-'a')+k)%26 + 'a'));
            }else{
                System.out.print((char)chars[i]);
			}
        }
    }
}