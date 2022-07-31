//21CE141 : PRIYANSHI TALAVIYA
package com.info;
import java.util.*;
public class EX3 {
	//logic of check same last digit in boolean form
    static boolean lastDigit(int a,int b)
    {
    	if(a%10 == 0 && b% 10 == 0)
        {
            return true;
        }
        else if(b % 10 ==a || a % 10 == b || a ==b ){
            return true;
        }
        else 
        return false ; }
    //main method
    public static void main(String[] args) {
    	//object of scanner class
        Scanner sc = new Scanner(System.in);
        //enter first number
        System.out.println("Enter 1st no");
        //scanning value of number 1
        int a = sc.nextInt();
        //enter second number
        System.out.println("Enter 2nd no");
        //scanning value of number 2
        int b = sc.nextInt();
        //call function lastdigit();
        System.out.println(lastDigit(a,b));
    }
}