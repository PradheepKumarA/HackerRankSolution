import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        int[] lane = new int[n];
        for(int i=0 ; i<n ; i++){
            lane[i]=in.nextInt();
        }
        for(int p=0 ; p<t ; p++){
            int i = in.nextInt();
            int j = in.nextInt();
            int minLane = 3;
            for(int q=i ; q<=j ; q++ ){
                if(minLane > lane[q]) minLane=lane[q];
            }
            System.out.println(minLane);
        }
    }
}