//21CE141 : PRIYANSHI ASHOKBHAI
package com.info;
import java.util.*;
//function in class
public class EX5 {
	//define function stringMatch(); and logic
    static int stringMatch(String a,String b)
{
    int counter = 0;
    for(int i=0;(i<a.length()-2) && (i<b.length()-2); i++)
    {
        String asub = a.substring(i,i+2);
        String bsub = b.substring(i,i+2);
        if(asub.equals(bsub)){
            counter ++;
        } }
    //returning counter
    return counter;
}
    //main method
    public static void main(String[] args) {
    	//object of scanner class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st string:");
        String a = sc.next();
        System.out.println("Enter 2nd string:");
        String b = sc.next();
        //call stringMatch();
        System.out.println("No of matching substrings : "+stringMatch(a, b));
    }
}
