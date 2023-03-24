package com.arditzubaku;

import static java.util.Arrays.deepToString;

public class WorkingWith2DArrays {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                board[i][j] = '-';
            }
        }
        board[0][0] = '0';
        board[1][0] = '0';
        board[2][0] = '0';
        // used to print 2D arrays
        System.out.println(deepToString(board));

        char[][] boardTwo = new char[][]{
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'},
                new char[]{'-', '-', '-'}
        };
        System.out.println(deepToString(boardTwo));
    }
}
