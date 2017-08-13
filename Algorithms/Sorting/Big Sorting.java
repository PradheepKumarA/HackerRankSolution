import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    static String[] numbers;
    static String[] helper;
    static int number;

    static void mergesort(int low, int high) {
        // check if low is smaller than high, if not then the array is sorted
        if (low < high) {
            // Get the index of the element which is in the middle
            int middle = low + (high - low) / 2;
            // Sort the left side of the array
            mergesort(low, middle);
            // Sort the right side of the array
            mergesort(middle + 1, high);
            // Combine them both
            merge(low, middle, high);
        }
    }

    static void merge(int low, int middle, int high) {
        // Copy both parts into the helper array
        for (int i = low; i <= high; i++) {
            helper[i] = numbers[i];
        }
        int i = low;
        int j = middle + 1;
        int k = low;
        // Copy the smallest values from either the left or the right side back
        // to the original array
        while (i <= middle && j <= high) {
            if (compare(helper[i] , helper[j])) {
                numbers[k] = helper[i];
                i++;
            } else {
                numbers[k] = helper[j];
                j++;
            }
            k++;
        }
        // Copy the rest of the left side of the array into the target array
        while (i <= middle) {
            numbers[k] = helper[i];
            k++;
            i++;
        }
        // Since we are sorting in-place any leftover elements from the right side
        // are already at the right position.
    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        numbers = new String[number];
        helper = new String[number];
        for(int unsorted_i=0; unsorted_i < number; unsorted_i++){
            numbers[unsorted_i] = in.next();
        }
        mergesort(0, number - 1);
		for(String st : numbers){
			System.out.println(st);
		}
    }
	
	static boolean compare (String string1 , String string2){
		if(string1.length() < string2.length()){
			return true;
		}
		if(string1.length() > string2.length()){
			return false;
		}
		char[] string1Array = string1.toCharArray();
		char[] string2Array = string2.toCharArray();
		for(int i = 0 ; i< string1Array.length ;i++ ){
			if(string1Array[i] != string2Array[i]){
				if(string1Array[i] < string2Array[i]){
					return true;
				}else if(string1Array[i] > string2Array[i]){
					return false;
				}
			}
		}
		return false;
	}
}
