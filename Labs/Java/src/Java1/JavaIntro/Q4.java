package Java1.JavaIntro;

import java.util.Random;

public class Q4 {
    public static void main(String[] args) {
        double n;
        /*
        do
        {
            Random r = new Random();
            n = r.nextInt(3+3)-3;
            System.out.println("Value is " + n);
        }
        while(n!=0);
        */

        Random r = new Random();
        n = r.nextInt(3+3)-3;

        while(n!=0){
            n = r.nextInt(3+3)-3;
            System.out.println("Value is " + n);

        }
    }
}
