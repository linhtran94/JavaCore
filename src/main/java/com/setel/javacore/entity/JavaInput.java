package com.setel.javacore.entity;

//    packagerivate //used in this class, can't not use from outside class
//    public // world wide
//    protected // used for another packages, another project can't use
//    default// used for class in package, can't use for another package

import java.math.BigDecimal;
import java.math.RoundingMode;

public class JavaInput {

//    private String name; //text
//    private Integer number; // number: 0,1,3,4,....
//    private Double number_dou; // number: 0.0, 0.1, 1.1,...
//    private Float number_float; //number; 0L,1.1L,...
//    private BigDecimal amount; //number: 17000.00, 17000.00000
    String global = new String(); // bien toan cuc -> goi everywhere
    public static final String fullGlobal = "XPATH "; // bien tinh toan cuc final, ko the map bien cua module khac vao
    public void getString() {  // public void -> function ko tra ve gia tri
        String result = "Testing";

        int a = 20, b = 10, c = 0, d = 20, e = 40, f = 30;
        Double g = 123.23;
        String x = "1000";
        String y = "Lession Learn";
        String z = "Testing"; // value: Testing
        global = y; // set gia tri thu nhat
        System.out.println("a + b = " + (a + b)); // total
        System.out.println("a - b = " + (a - b)); // substract

        global = z; //set gia tri thu hai
        System.out.println("x + y = ".concat(x).concat(String.valueOf(" ")).concat(y)); // ghep string
        System.out.println("Change to Dobule = " + Double.valueOf(b)); // chuyen so tu int qua Double
        System.out.println("Change to BigDecimal = " + new BigDecimal(g)); // chuyen so tu double qua BigDecimal
        System.out.println("round up to BigDecimal = " + new BigDecimal(g).setScale(4, RoundingMode.HALF_UP)); // lam tron so thap phan
        // * and / operator
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));

        // modulo operator gives remainder
        // on dividing first operand with second

        System.out.println("a % b = " + (a % b));

        Integer number = Integer.parseInt(x);
        System.out.println(number);
        int number2 = Integer.parseInt(x);
        System.out.println(number2);

        process();
    }

    public void process() { // ko tra gia tri gi ve -- void

        String getGlobal = global;
        String getFull = fullGlobal;
        System.out.println(getGlobal); // Lession Learn or Testing


    }

    public String testing() { //phai tra ve gia tri theo khai bao
        String result = "";

        return result;
    }
}
