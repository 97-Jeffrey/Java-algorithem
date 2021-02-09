package com.Jeffrey;

public class JewelsAndStone {

    public static int solution(String jewels, String stones){
        int count = 0;
        char[] chars = stones.toCharArray();
        for(int i=0; i<chars.length; i++){
            if(jewels.indexOf(chars[i])>=0)
                count++;
        }
        return count;
    }
}
