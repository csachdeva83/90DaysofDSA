package com.CherishDSA;

public class Count_Steps_Leetcode_1342 {
    public static void main(String[] args) {

    }
    public int numberOfSteps(int n) {
        int count=0;
        return helper(n,count);
    }
    private int helper(int n,int c){
        if(n==0){
            return c;
        }
        if(n%2==0){
            return helper(n/2,++c);
        }else{
            return helper(n-1,++c);
        }
    }
}
