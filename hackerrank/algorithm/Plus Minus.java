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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
    // Write your code here
    float neg=0;
    float pos=0;
    float zero=0;
    float arrsize= arr.size();
    //System.out.println(arrsize);
    for(int i=0;i<arr.size();i++){
        int exp =arr.get(i);
        if(exp>0){
          pos++;  
        }
        else if(exp<0){
            neg++;
        }else{
            zero++;
        }
    }
    
    float posres = pos/arrsize;
    float negres = neg/arrsize;
    float zerores = zero/arrsize;
    System.out.printf("%.6f\n",posres);
    System.out.printf("%.6f\n",negres);
    System.out.printf("%.6f\n",zerores);
    
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
