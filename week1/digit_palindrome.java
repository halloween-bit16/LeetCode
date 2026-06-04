/*
Given a number n. Return true if the digit sum(or sum of digits) of n is a Palindrome number otherwise false.
A Palindrome number is a number that stays the same when reversed

Examples:

Input: n = 56
Output: true
Explanation: The digit sum of 56 is 5+6 = 11. Since, 11 is a palindrome number.Thus, answer is true.
Input: n = 98
Output: false
Explanation: The digit sum of 98 is 9+8 = 17. Since 17 is not a palindrome,thus, answer is false. */

// time : O(log n)
// space : O(1)

import java.util.Scanner;

class sol_d {
    boolean isDigitSumPalindrome(int n) {
        int sum=0;
        int t=n;
        while(t!=0){
            sum+=t%10;
            t/=10;
        }
        t=sum;
        int rev=0;
        while(t!=0){
            rev=rev*10+t%10;
            t/=10;
        }
        return rev==sum;
    }
}
public class digit_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();

        sol_d sol=new sol_d();
        boolean result=sol.isDigitSumPalindrome(n);

        System.out.println(n+"is digit palindrome? :"+result);
    }
}
