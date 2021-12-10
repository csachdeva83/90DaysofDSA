package com.CherishDSA;

public class Product_of_Digits {
    public static int productDigits(int n){
        if(n==0){
            return 1;
        }
        return (n%10)*(productDigits(n/10));
    }
    public static void main(String[] args) {
        System.out.println(productDigits(12345));
    }
}
