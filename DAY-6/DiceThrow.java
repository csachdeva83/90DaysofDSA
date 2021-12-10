package com.CherishDSA;

import java.util.ArrayList;

public class DiceThrow {
    public static void Dice(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            Dice(p+i,target-i);
        }
    }
    public static ArrayList DiceList(String p, int target){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=6 && i<=target;i++){
            ans.addAll(DiceList(p+i,target-i));
        }
        return ans;
    }
    public static ArrayList diceCustomFacesList(String p, int target,int face){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<=face && i<=target;i++){
            ans.addAll(diceCustomFacesList(p+i,target-i,face));
        }
        return ans;
    }
    public static void main(String[] args) {
//        Dice("",12);
//        System.out.println(DiceList("",14));
        System.out.println(diceCustomFacesList("",14,8));
    }
}
