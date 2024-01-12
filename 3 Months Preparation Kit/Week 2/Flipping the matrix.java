// I'm close to you. Look around you carefully.

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int queries = in.nextInt();
        int size = 0;
        int length;
        int total;
        for(int i = 0; i < queries; i++){
            total = 0;
            size = in.nextInt();
            length = size * 2;
            int[][] matrix = new int[length][length];
            for(int row = 0; row < length; row++){
                for(int column = 0; column < length; column++){
                    matrix[column][row] = in.nextInt();
                }
            }
            int max = 0;
            for(int row = 0; row < size; row++){
                for(int column = 0; column < size; column++){
                    max = Integer.MIN_VALUE;
                    if(matrix[row][column] > max)
                        max = matrix[row][column];
                    if(matrix[row][length - column - 1] > max)
                        max = matrix[row][length - column - 1];
                    if(matrix[length - row - 1][column] > max)
                        max = matrix[length - row - 1][column];
                    if(matrix[length - row - 1][length - column - 1] > max)
                        max = matrix[length - row - 1][length - column - 1];
                    total += max;
                }
            }
            System.out.println(total);
        }
    }
}
