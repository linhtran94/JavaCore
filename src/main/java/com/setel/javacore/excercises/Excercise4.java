package com.setel.javacore.excercises;

public class Excercise4 {
    public void bai4(int a, int b, int c) {
        int delta = (b * b) - (4 * a * c);
        if( delta < 0 ){
            System.out.println("phương trình vô nghiệm");
        }else if( delta == 0 ) {
            System.out.println("phương trình có nghiệm kép: " + ((-b)/2 * a));
        }else {
            System.out.println("phương trình có 2 nghiệm: ");
            double i1 = (-b + Math.sqrt(delta) ) / (2 * a);
            double i2 = (-b - Math.sqrt(delta) ) / (2 * a);
            System.out.println("x1 = " + i1);
            System.out.println("x2 = " + i2);
        }
    }
}
//        System.out.println("Xin moi nhap a: ");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
//        System.out.println("Xin moi nhap b: ");
//        Scanner sc1 = new Scanner(System.in);
//        int b = sc1.nextInt();
//        System.out.println("Xin moi nhap c: ");
//        Scanner sc2 = new Scanner(System.in);
//        int c = sc2.nextInt();
//
//        Excercise4 ex4 = new Excercise4();
//        ex4.bai4(a,b,c);
