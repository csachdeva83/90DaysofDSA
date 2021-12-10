package com.CherishDSA;

public class isSorted_recursion {
    public static boolean isSorted(int[] arr,int index,int n){
        if(index==n-1){
            return true;
        }
        return arr[index]<arr[index+1] && isSorted(arr,++index,n);
    }
    public static void main(String[] args) {
        int[] arr={2,34,56,78,1829,400};
        System.out.println(isSorted(arr,0,arr.length));
    }
}
