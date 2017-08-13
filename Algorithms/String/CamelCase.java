import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        char ch[] = s.toCharArray();
        int count=1;
        for(char c : ch){
            if(c>=65 && c<=90){
                count++;
            }
        }
        System.out.print(count);
    }
}
