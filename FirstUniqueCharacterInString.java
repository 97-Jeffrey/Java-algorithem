package com.Jeffrey;

public class FirstUniqueCharacterInString {

    public static int solution(String s){
        for(int i=0; i<s.length(); i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i)))
                return s.indexOf(s.charAt(i));
        }
        return -1;
    }
}
