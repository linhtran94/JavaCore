package com.setel.javacore.entity;


import java.util.ArrayList;
import java.util.List;

public class JavaInput2 {

    //Array - List
    List<String> listContains = new ArrayList<>(); // khoi tao list empty

    Integer[] listInt = {1,2,3,4,5,7}; // mang
    String[] listString = {"test","a","b"}; // mang

    public void test() {

        String a = "Test"; // tao bien gan vao list va print
        listContains.add(a);

        for(Integer p : listInt) { // list co the lap kieu nay
            System.out.println(p);
        }
        System.out.println("==============");
        for(String s: listString) { // java 8
            listContains.add(s);
            System.out.println(s);
        }
        System.out.println("==============");
        for(String w: listContains) {
            if (w.equals("a") || w.equals("b"))
                System.out.println(w);
        }
        System.out.println("==============");
        for(int i=0; i<listContains.size(); i++) {  // size danh cho list - lenght danh cho mang or bien string
            String result = "";
            result = listContains.get(i);
            if(result.equals("a") || result.equals("b")) {
                System.out.println(result);
                //line 2
            }
        }
    }
}
