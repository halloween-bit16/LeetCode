/*Count Digits Problem Statement:Given an integer N, 
count the total number of digits present in the number.
Example:Input: 12345Output: 5 */

import java.util.*;

class sol_di{
    int digits(int n){
        return Integer.toString(n).length();
    }
}
public class count_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();
        sol_di sol=new sol_di();
        int result=sol.digits(n);
        System.out.println("No. of digits of "+n+": "+result);
    }
}
