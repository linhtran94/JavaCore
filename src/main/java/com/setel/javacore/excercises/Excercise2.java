package com.setel.javacore.excercises;

import java.util.ArrayList;
import java.util.List;

public class Excercise2 {
    public String bai2 (String input) {
        StringBuffer a =new StringBuffer(input);
//        List<Character> list_a = new ArrayList<>();
//        List<Character> list_b = new ArrayList<>();
        for(int i = 0; i < input.length(); i++){
            if(Character.isUpperCase(input.charAt(i))) {
                a.setCharAt(i,Character.toLowerCase(input.charAt(i)));
//                list_a.add(input.charAt(i));
            } else {
                a.setCharAt(i,Character.toUpperCase(input.charAt(i)));
//                list_b.add(input.charAt(i));
            }
        }
        return a.toString();
//        System.out.println("Nhung chu cai hoa: " + list_a);
//        System.out.println("Nhung chu cai thuong: " + list_b);
    }
}

//        System.out.println("Xin moi nhap chu: ");
//        Scanner sc = new Scanner(System.in);
//        String a = sc.nextLine();
//
//        Excercise2 ex2 = new Excercise2();
////        ex2.bai2(a);
//        System.out.println(ex2.bai2(a));
