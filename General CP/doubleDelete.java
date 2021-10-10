//Given code takes two int e.g a & b, where a<b and prints the count where digits are such like 11,22,33,etc....
//this is executed for 2 digit integers however for more than 2 digit input integer can be looped over
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int cnt=0;
        Scanner sc= new Scanner(System.in);    //System.in is a standard input stream
        System.out.print("Enter first number- ");
        int a= sc.nextInt();
        System.out.print("Enter second number- ");
        int b= sc.nextInt();
        for(int i=a;i<=b;i++){
            int ld = i%10; 
            int fd = i/10;
            if(ld==fd){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
