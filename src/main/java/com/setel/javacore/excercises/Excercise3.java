package com.setel.javacore.excercises;

public class Excercise3 {
    public void bai3(int a, int b) {
        if( a == 0 && b == 0 ){
            System.out.println("phương trình có vô số nghiệm");
        }else if( a == 0 && b != 0) {
            System.out.println("phương trình vô nghiệm");
        }else {
            System.out.println("phương trình có nghiệm duy nhất: " + ((-b)/a));
        }
    }
}

//        System.out.println("Xin moi nhap a: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("Xin moi nhap b: ");
//        Scanner sc1 = new Scanner(System.in);
//        int b = sc1.nextInt();
//
//        Excercise3 ex3 = new Excercise3();
//        ex3.bai3(a,b);
//        }
