package homework_week_8;

import java.util.Scanner;

/**
 * 14 Write a program in Java to display the pattern like a diamond.
 * While loop
 * <p>
 *        *
 *       ***
 *      *****
 *     *******
 *    *********
 *   ***********
 *  *************
 *   ***********
 *    *********
 *     *******
 *      *****
 *       ***
 *        *
 */

public class Program_14_DiamondPattern {

    public static void printDiamond(int rows, char ch){
       int i=1;
       int j;
       while(i <= rows){
        j = 1;
        while(j++ <= rows - i ){
            System.out.print(" ");
        }
        j = 1;
        while(j++ <= i * 2 -1 ){
            System.out.print(ch);
           }
           System.out.println();
           i++;
       }
       i = rows - 1;
       while (i > 0){
           j=1;
           while (j++ <= rows - i){
               System.out.print(" ");
           }
           j=1;
           while (j++ <= i *2 -1){
               System.out.print(ch);
           }
           System.out.println();
           i--;
       }
    }

    public static void main(String[] args) {
//        Scanner declaration
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int a = scanner.nextInt();
        System.out.println("Enter the symbol: ");
        char ch = scanner.next().charAt(0);
        printDiamond(a, ch);
        scanner.close();
    }
}
