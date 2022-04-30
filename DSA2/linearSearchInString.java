package com.DSA2;

public class linearSearchInString {
    public static void main(String[] args) {
        String str = "shambho";
        char target = 'o';
        System.out.println(Search(str,target));
    }
    static boolean Search(String str,int targat){
        if(str.length()==0){
            return false;
        }
        for(int i=0;i<str.length();i++){
            if(targat==str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
