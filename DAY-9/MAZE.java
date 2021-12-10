package com.CherishDSA;

import java.util.ArrayList;
import java.util.Arrays;

public class MAZE {
    public static int count(int r,int c){
        if(r==1 || c==1){
            return 1;
        }
        int left=count(r-1,c);
        int right=count(r,c-1);

        return left+right;
    }
    public static void path(String p,int r,int c){
        if(r==1 && c==1){
            System.out.println(p);
            return;
        }
        if(r>1){
            path(p+"D",r-1,c);
        }
        if(c>1){
            path(p+"R",r,c-1);
        }
    }
    public static ArrayList<String> pathList(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(pathList(p+"D",r-1,c));
        }
        if(c>1){
            ans.addAll(pathList(p+"R",r,c-1));
        }
        return ans;
    }
    public static ArrayList<String> pathDiagonalList(String p,int r,int c){
        if(r==1 && c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1 && c>1){
            ans.addAll(pathList(p+"D",r-1,c));
        }
        if(r>1){
            ans.addAll(pathList(p+"V",r-1,c));
        }
        if(c>1){
            ans.addAll(pathList(p+"H",r,c-1));
        }
        return ans;
    }
    public static void pathRestriction(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        if(r<maze.length-1){
            pathRestriction(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestriction(p+"R",maze,r,c+1);
        }
    }
    public static void pathRestrictionUDLR(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1 && c==maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // I am considering this block in my path so that it doesn't return to the same position
        maze[r][c]=false;

        if(r<maze.length-1){
            pathRestrictionUDLR(p+"D",maze,r+1,c);
        }
        if(c<maze[0].length-1){
            pathRestrictionUDLR(p+"R",maze,r,c+1);
        }
        if(c>0){
            pathRestrictionUDLR(p+"L",maze,r,c-1);
        }
        if(r>0){
            pathRestrictionUDLR(p+"U",maze,r-1,c);
        }

        // this line is where the funcn will be over
        // so before the funcn gets removed, also remove the changes made by that funcn
        maze[r][c]=true;
    }
    public static void pathRestrictionUDLRPrint(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if(r==maze.length-1 && c==maze[0].length-1){
            path[r][c]=step;
            for(int[] arr: path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            System.out.println( );
            return;
        }
        if(!maze[r][c]){
            return;
        }

        // I am considering this block in my path so that it doesn't return to the same position
        maze[r][c]=false;
        path[r][c]=step;
        if(r<maze.length-1){
            pathRestrictionUDLRPrint(p+"D",maze,r+1,c,path,step+1);
        }
        if(c<maze[0].length-1){
            pathRestrictionUDLRPrint(p+"R",maze,r,c+1,path,step+1);
        }
        if(c>0){
            pathRestrictionUDLRPrint(p+"L",maze,r,c-1,path,step+1);
        }
        if(r>0){
            pathRestrictionUDLRPrint(p+"U",maze,r-1,c,path,step+1);
        }

        // this line is where the funcn will be over
        // so before the funcn gets removed, also remove the changes made by that funcn
        maze[r][c]=true;
        path[r][c]=0;
    }
    public static void main(String[] args) {
        boolean[][] maze={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
//        System.out.println(count(3,3));
//        path("",3,3);
//        System.out.println(pathList("",3,3));
//        System.out.println(pathDiagonalList("",3,3));
//        pathRestriction("",maze,0,0);
//        pathRestrictionUDLR("",maze,0,0);
        int[][] path=new int[maze.length][maze[0].length];
        pathRestrictionUDLRPrint("",maze,0,0,path,1);
    }
}
