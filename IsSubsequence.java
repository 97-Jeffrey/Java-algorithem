package com.Jeffrey;

public class IsSubsequence {

    public static Boolean solution(String s, String t){
        int p=0;
        int q = 0;

        while(p<s.length() && q<t.length()){
            if(s.charAt(p)==t.charAt(q++)){
                p++;
            }
        }
        return p == s.length();
    }
}
