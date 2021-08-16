//https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'repeatedString' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. STRING s
     *  2. LONG_INTEGER n
     */

    public static int repeatedString(String s, int n) {
        // Write your code here
        String resS="";
        for(int i=0; i<n;i++){
            resS = resS+s;
        }
        int fc=0;
        for(int j=0;j<n;j++){
            if(resS.charAt(j)=='a'){
                fc= fc+1;
            }
        }
        return fc;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {

        String s;
        int n;
        int result = Result.repeatedString("abcac", 10);
        System.out.println(result);

    }
}
