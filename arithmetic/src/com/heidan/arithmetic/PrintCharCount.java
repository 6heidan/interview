package com.heidan.arithmetic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PrintCharCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        Map<Character,Integer> map = new HashMap<>();
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))!=null){
                Integer number = map.get(s.charAt(i));
                number++;
                map.put(s.charAt(i),number);
            }else {
                map.put(s.charAt(i),1);
            }
        }
        System.out.println(map);
//        for (Map.Entry<Character,Integer> entry:map.entrySet()){
//            System.out.println("key="+entry.getKey() + "\tvalue="+ entry.getValue());
//        }
    }
}
