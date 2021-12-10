package com.CherishDSA;

public class Reverse_Number {
    public static int helper(int n, int digits){
        if(n==0){
            return 0;
        }
        int rem=n%10;
        return rem*(int)(Math.pow(10,digits-1))+helper(n/10,digits-1);
    }
    public static int rev(int n){
        int digits=(int)Math.log10(n)+1; // 4
        return helper(n,digits);
    }
    public static void main(String[] args) {
        System.out.println(rev(4321));
        int n=121231;
        if(rev(121)==n){
            System.out.println("Pallindrome");
        }else{
            System.out.println("Not Pallindrome");
        }
    }
}
