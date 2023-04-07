package homework_week_8;

import java.util.Scanner;

/**
 * Display left angle triangle of * using nested for loops
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 */

public class Program_15_LeftTriangleStar {

    public static  void leftTriangle(int n){
       for(int i = 1; i <= n ; i++){
           for(int j =1; j <= i; j++){
               System.out.print("*");
           }
           System.out.print("\n");
       }
    }

    public static void main(String[] args) {
//        Scanner declaration
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int a = scanner.nextInt();
        leftTriangle(a);
        scanner.close();
    }
}
