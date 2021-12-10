package com.CherishDSA;

public class Print_1_to_n {
    public static void toPrint(int n){
        if(n==0){
            return;
        }
        toPrint(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        toPrint(5);
    }
}
