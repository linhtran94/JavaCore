package com.setel.javacore.excercises;

public class Excercise1 {
    public int bai1(int input) {
        int i = 0;
        if(1 <= input && input <= 9){
            i = input;
        }
        else {
            i = 0;
        }
        return i;
    }
}


//         HelloWorld main
//        System.out.println("Xin moi nhap so");
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();

//        Excercise1 ex1 = new Excercise1();
//        int b = 0;
//        b = ex1.bai1(a);
//        if(b == 0) {
//            System.out.println("ko doc duoc");
//        }
//        else{
//            System.out.println(b);
//        }
