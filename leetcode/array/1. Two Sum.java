// https://leetcode.com/problems/two-sum/
// Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

// You may assume that each input would have exactly one solution, and you may not use the same element twice.

// You can return the answer in any order.

 

// Example 1:

// Input: nums = [2,7,11,15], target = 9
// Output: [0,1]
// Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
// Example 2:

// Input: nums = [3,2,4], target = 6
// Output: [1,2]
// Example 3:

// Input: nums = [3,3], target = 6
// Output: [0,1]


import java.util.*;
public class Solution {
    public static void main(String[] args) {
        int arr[] = {122,11,2,3,8,15,7};
        int k =9;
        for(int i=0;i< arr.length-1;i++){
            for(int j=i+1;j< arr.length;j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i] + " is at index " + i);
                    System.out.println(arr[j] + " is at index " + j);
                    int res[]={i,j};
                    System.out.println("Array of indices of those numbers is:"+Arrays.toString(res));
                }
            }
        }
    }
}
