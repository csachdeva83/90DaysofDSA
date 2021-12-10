package com.CherishDSA;

public class Main {

    public static int fibo(int n){
        // base condition
        if(n<2){
            return n;
        }
        return fibo(n-2)+fibo(n-1);
    }
    public static void main(String[] args) {
	    System.out.println(fibo(5));
    }
}
