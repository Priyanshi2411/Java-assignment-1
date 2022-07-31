//21CE141 : PRIYANSHI TALAVIYA
package com.info;
import java.util.Scanner;
public class EX7 {
 //initialize final string or answer string blank
    private static final String string = " ";
        public static void main(String[] args)
        {
            int number = 0;
            //loop for 8x8 square
            for (int row = 0; row <= 7; row++) 
            {
                //nested loop which prints number if col <= 7-row
                for (int column = 1; column <= 7 - row; column++) {
                    System.out.printf("%4s", string);
                }
                //nested loop which prints number if col <= row
                for (int column = 0; column <= row; column++) {
                    number = (int) Math.pow(2, column);
                   System.out.printf("%4d", number);
                }
                //nested loop which prints number if col >=0
                for (int column = row - 1; column >= 0; column--) {
                    number = (int) Math.pow(2, column);
                    System.out.printf("%4d", number);
                }
                //for new line
                System.out.println();
            }
        }
}
