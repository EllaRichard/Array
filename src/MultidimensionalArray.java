/*MOVIE THEATER
* You are creating a ticketing program for a small movie theater.
* The seats are represented using a two-dimensional array.
* Each item can have the value 1 and 0. 1 is "occupied" and 0 if it's free
* Your program need to take as input the row and the colum of the seat and output free if it's free and sold if sold*/

import java.util.Scanner;
public class MultidimensionalArray {
    public static void main(String[] args) {
        int row, column;
        int [][] seats = {
                {0, 0, 0, 1, 1, 1, 0, 0, 1, 1},
                {1, 1, 0, 1, 0, 1, 1, 0, 0, 0},
                {1, 1, 1, 1, 1, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 1, 1, 0, 0, 0},
                {0, 1, 1, 1, 0, 0, 0, 1, 1, 1},
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the row: ");
        row = sc.nextInt();
        System.out.println("Enter the column: ");
        column = sc.nextInt();

        if ( seats [row][column] == 0) {
            System.out.println("The seat is free! ");
        } else if ( seats [row][column] == 1) {
            System.out.println("The seat is occupied! ");
        }
    }
}
