package com.CherishDSA;

public class Factorial {
    public static int fac(int n){
        if(n==1){
            return 1;
        }
        return n*fac(n-1);
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
