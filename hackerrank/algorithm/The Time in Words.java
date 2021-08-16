//https://www.hackerrank.com/challenges/the-time-in-words/problem
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
     * Complete the 'timeInWords' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER h
     *  2. INTEGER m
     */

    public static String timeInWords(int h, int m) {
        // Write your code here

        String[] values = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen",
                "fourteen", "fifteen", "sixteen", "seventeen",
                "eighteen", "nineteen", "twenty", "twenty one",
                "twenty two", "twenty three", "twenty four",
                "twenty five", "twenty six", "twenty seven",
                "twenty eight", "twenty nine"};

        if(m==0){
             return values[m]+" o' clock";
        }
        else if(m==15){
            return "quarter past "+values[h];
        }
        else if(m==30){
            return "half past"+values[h];
        }
        else if(m==45){
            return "quarter to"+values[h];
        }
        else if(m==1){
            return values[m]+"minute past"+values[h];
        }
         else if(m>1&&m<30){
              return values[m]+" minutes past "+values[h];
         }
         else if(m<60&&m>30){
             int newmin = 60-m;
              return values[newmin]+"minutes to"+values[h];
         }
        else{
            return "invalid time";

        }

    }

}

public class Solution {
    public static void main(String[] args)  {
       //place any time here or make dynamic with user inputs
       String result = Result.timeInWords(5, 48);
        System.out.println(result);


    }
}
