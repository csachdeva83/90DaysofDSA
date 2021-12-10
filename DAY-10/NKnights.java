package com.CherishDSA;

public class NKnights {
    public static void display(boolean[][] board){
        for(boolean[] row:board){
            for(boolean element: row){
                if(element){
                    System.out.print("K ");
                }else{
                    System.out.print("_ ");
                }
            }
            System.out.println();
        }
    }
    public static boolean isValid(boolean[][] board,int row,int col){
        if(row>=0 && row<board.length && col>=0 && col<board.length){
            return true;
        }
        return false;
    }
    public static boolean isSafe(boolean[][] board,int row,int col){
        // knight moves in L shape
        // row -2/-1 and col -1/+1 // -2/+2 we ar placing in row then let the recursion do it for below row
        // check safe for above rows only
        if(isValid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isValid(board,row-2,col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isValid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isValid(board,row-1,col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }

    public static void knight(boolean[][] board,int row,int col,int knights){
        if(knights==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length-1 && col==board.length){
            return;
        }
        if(col==board.length){
            knight(board,row+1,0,knights);
            return;
        }
        if(isSafe(board,row,col)){
            board[row][col]=true;
            knight(board,row,col+1,knights-1);
            board[row][col]=false;
        }
        knight(board,row,col+1,knights);
    }
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        knight(board,0,0,4);
    }
}
