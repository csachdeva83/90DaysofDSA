package com.CherishDSA;

public class Binary_Search {
    public static int binarySearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }else if(arr[m]>target){
            return binarySearch(arr,target,s,m-1);
        }
        return binarySearch(arr,target,m+1,e);
    }
    public static void main(String[] args) {
        int[] arr={23,45,67,89};
        int target=67;
        System.out.println(binarySearch(arr,target,0,arr.length-1));
    }
}
