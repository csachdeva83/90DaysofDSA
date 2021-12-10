package com.CherishDSA;

public class Rotated_binar_Search_leetcode33 {
    public static int binarySearch(int[] arr,int target, int s, int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==target){
            return m;
        }
        if(arr[s]<=arr[m]){
            if(arr[s]<=target && target<=arr[m]){
                return binarySearch(arr,target,s,m-1);
            }else{
                return binarySearch(arr,target,m+1,e);
            }
        }
        if(arr[m]<=target && target<=arr[e]){
            return binarySearch(arr,target,m+1,e);
        }else{
            return binarySearch(arr,target,s,m-1);
        }
    }
    public static int search(int[] arr, int target) {
        return binarySearch(arr,target,0,arr.length-1);
    }
    public static void main(String[] args) {
        int[] arr={5,6,7,8,9,1,2,3};
        System.out.println(search(arr,8));
    }
}
