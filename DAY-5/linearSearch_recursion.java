package com.CherishDSA;

import java.util.ArrayList;

public class linearSearch_recursion {
    public static boolean find(int[] arr,int target,int index){
        if(index==arr.length){
            return false;
        }
        return arr[index]==target || find(arr,target,++index);
    }
    public static int findIndex(int[] arr,int target,int index){
        if(index==arr.length){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,++index);
    }
    public static int findIndexLast(int[] arr,int target,int index){
        if(index<0){
            return -1;
        }
        if(arr[index]==target){
            return index;
        }
        return findIndex(arr,target,--index);
    }
    public static ArrayList findAllIndex(int[] arr,int target,int index, ArrayList<Integer> list){
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        return findAllIndex(arr,target,++index,list);
    }
    static ArrayList findAllIndex2(int[] arr,int target,int index){
        ArrayList<Integer> list=new ArrayList<>();
        if(index==arr.length){
            return list;
        }
        if(arr[index]==target){
            list.add(index);
        }
        ArrayList<Integer> ansFromBelowCalls=findAllIndex2(arr,target,++index);
        list.addAll(ansFromBelowCalls);
        return list;
    }
    public static void main(String[] args) {
        int[] arr={23,567,45,23,567,567,456};
        int target=567;
//        System.out.println(find(arr,target,0));
//        System.out.println(findIndex(arr,target,0));
//        System.out.println(findIndexLast(arr,target,arr.length-1));
        System.out.println(findAllIndex2(arr,target,0));
    }
}
