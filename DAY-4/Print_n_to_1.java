package com.CherishDSA;

public class Print_n_to_1 {
    public static void toPrint(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        toPrint(n-1);
    }
    public static void main(String[] args) {
        toPrint(5);
    }
}
