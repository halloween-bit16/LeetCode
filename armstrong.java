/*
An Armstrong number is a number that is equal to the sum of its digits 
each raised to the power of the number of digits.Given an integer n, 
determine whether it is an Armstrong number.
Example:Input: 153Output: trueExplanation: 1³ + 5³ + 3³ = 153 */

// time : O(log n)
// space : O(1)

import java.util.Scanner;

class sol_a {
    boolean isArmstrong(int n){
        int digit=Integer.toString(n).length();
        int t=n;
        int arm=0;
        while(t!=0){
            int d=(int)Math.pow(t%10,digit);
            arm+=d;
            t=t/10;
        }

        return arm==n;
    }
}

public class armstrong{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        int n=sc.nextInt();

        sol_a sol=new sol_a();
        boolean result=sol.isArmstrong(n);

        System.out.println(n+ " is armstrong? : "+result);
    }
}
