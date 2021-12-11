package com.CherishDSA;

public class NQueens {
    public static boolean isSafe(boolean[][] board,int row,int col){
        // check vertical row
        for(int i=0;i<row;i++){
            if(board[i][col]){
                return false;
            }
        }
        // diagonal left
        int maxLeft=Math.min(row,col);
        for(int i=1;i<=maxLeft;i++){ // start with subtracting 1
            if(board[row-i][col-i]){
                return false;
            }
        }
        // diagonal right
        int maxRight=Math.min(board.length-1-col,row);
        for(int i=1;i<=maxRight;i++){ // start with subtracting 1
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true; // u can place the queen
    }
    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    public static int queens(boolean[][] board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        // placing the queen and checking for every row and col
        for(int col=0;col< board.length;col++){
            // place the queen if it is safe
            if(isSafe(board,row,col)){
                board[row][col]=true; // this row is placed now check for the below ones
                count+=queens(board,row+1);
                board[row][col]=false; // revert the changes
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        System.out.println(queens(board,0));
    }
}
