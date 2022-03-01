//https://practice.geeksforgeeks.org/problems/run-length-encoding/1

// Example 1:
// Input:
// str = aaaabbbccc
// Output: a4b3c3
// Explanation: a repeated 4 times consecutively b 3 times, c also 3 times.

// Example 2:
// Input:
// str = abbbcdddd
// Output: a1b3c1d4

import java.util.*;
public class Solution {
    public static void main(String[] args) {
        String str="wwwwaaadexxxxxx";
        String new_str = "";
        char c;
        int count = 1;
        int i;
        for(i=0;i<str.length();i++){
            count = 1;
            c= str.charAt(i);
            new_str = new_str +  c;
            while(i<str.length()-1 && c==str.charAt(i+1)){
                count++;
                i++;
            }
            new_str = new_str + count;

        }
        System.out.println(new_str);
    }
}
