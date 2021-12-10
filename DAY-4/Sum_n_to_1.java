package com.CherishDSA;

public class Sum_n_to_1 {
    public static int toSum(int n){
        if(n==0){
            return 0;
        }
        return n+toSum(n-1);
    }
    public static void main(String[] args) {
        System.out.println(toSum(5));
    }
}
