//https://leetcode.com/problems/string-compression/submissions/
public class Solution {
public static void main(String[] args) {
    char[] chars = {'a','a','a','b','b','c','c','c','a'};
    String str = String.valueOf(chars);
    String s =str.charAt(0)+"";
    int count=1;
    for(int i=1;i<str.length();i++){
        char curr = str.charAt(i);
        char prev = str.charAt(i-1);
        if(curr==prev){
            count++;
        }else{
            if(count>1){
                s+=count;
                count=1;
            }
            s+=curr;
        }
    }
    if(count>1){
        s+=count;
        count=1;
    }
    System.out.println(s);

}
}
