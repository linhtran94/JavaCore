import com.setel.javacore.entity.JavaInput;
import com.setel.javacore.entity.JavaInput2;
import com.setel.javacore.excercises.Excercise1;
import com.setel.javacore.excercises.Excercise2;
import com.setel.javacore.excercises.Excercise3;
import com.setel.javacore.excercises.Excercise4;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class HelloWorld {

    String global = new String(); // bien global, tao variable global co the thay value khi

    private int number;

    public static void main (String[] agrs) {
        System.out.println("Please input a: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Please input b: ");
        Scanner sc1 = new Scanner(System.in);
        int b = sc1.nextInt();
        System.out.println("Please input c: ");
        Scanner sc2 = new Scanner(System.in);
        int c = sc2.nextInt();

        Excercise4 ex4 = new Excercise4();
        ex4.bai4(a,b,c);
    }


}
