package com.CherishDSA;

public class Count_Zeroes {
    public static int helper(int n,int c){
        if(n==0){
            return c;
        }
        int rem=n%10;
        if(rem==0){
            return helper(n/10,++c);
        }else{
            return helper(n/10,c);
        }
    }
    public static int countZero(int n){
        int count=0;
        return helper(n,count);
    }
    public static void main(String[] args) {
        System.out.println(countZero(103004));
    }
}
