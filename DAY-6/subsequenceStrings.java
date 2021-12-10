package com.CherishDSA;

import java.util.ArrayList;
import java.util.List;

public class subsequenceStrings {
    public static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subseq(p,up.substring(1));
        subseq(p+ch,up.substring(1));
    }
    public static ArrayList<String> subseqList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqList(p,up.substring(1));
        ArrayList<String> right=subseqList(p+ch,up.substring(1));
        left.addAll(right);
        return left;
    }

    public static ArrayList<String> subseqASCIIList(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subseqASCIIList(p,up.substring(1));
        ArrayList<String> mid=subseqASCIIList(p+(ch+0),up.substring(1));
        ArrayList<String> right=subseqASCIIList(p+ch,up.substring(1));
        left.addAll(mid);
        left.addAll(right);
        return left;
    }

    public static List<List<Integer>> subset(int[] arr){
        List<List<Integer>> outer=new ArrayList<>();
        outer.add(new ArrayList<>()); // [] in outer
        for(int num: arr){
            int n=outer.size();
            for(int i=0;i<n;i++){
                List<Integer> internal=new ArrayList<>(outer.get(i)); // copy of List
                internal.add(num);
                outer.add(internal);
            }
        }
        return outer;
    }

    public static void main(String[] args) {
        int[] arr={1,2,3};
//        subseq("","abc");
//        System.out.println(subseqList("","abc"));
//        System.out.println(subseqASCIIList("","abc"));
        List<List<Integer>> ans=subset(arr);
        for(List<Integer> list: ans){
            System.out.println(list);
        }
    }
}
