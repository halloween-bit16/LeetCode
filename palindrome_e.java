/*
Given an integer x, return true if x is a palindrome, and false otherwise.

 

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome. */

// time = O(n)
// space = O(n)

import java.util.*;

class Solution {
    public boolean isPalindrome(int x) {
        String t=Integer.toString(x);
        String rev=new StringBuilder(t).reverse().toString();
        return t.equals(rev);
    }
}

public class palindrome_e{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int x=sc.nextInt();
        
        Solution sol=new Solution();
        boolean result=sol.isPalindrome(x);

        System.out.println(x+"is palindrome? :"+result);
    }
}

