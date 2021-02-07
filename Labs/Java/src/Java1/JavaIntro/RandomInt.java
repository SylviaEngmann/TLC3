package Java1.JavaIntro;

import java.util.Random;

public class RandomInt {
    public static void main(String[] args){
        //double n = (int)(Math.random()*100)+1;
        Random r = new Random();
        //double n = r.nextInt(100 + 1) + 1;
        double n = (int)(Math.random()*100)+1;


        if (n%2==0)
        {
            System.out.println(n);
            System.out.println("Number is even");
        }
        else
        {
            System.out.println(n);
            System.out.println("Number is odd");
        }


        if(n==0){
            System.out.println(n+ " is Frozen");
        }
        else if (1 >= n && n <= 14) {
            System.out.println(n+" is Cold");
        }
        else if(15 >= n && n <= 24) {
            System.out.println(n+ " is Cool");
        }
        else if(25 >= n && n <= 40) {
            System.out.println(n+ " Warm");
        }
        else if(41 >= n && n <= 60) {
            System.out.println(n+ " is Hot");
        }
        else if (61 >= n && n <= 80){
            System.out.println(n+ " is very Hot");
        }
        else if (81 >= n && n <= 99) {
            System.out.println(n+ " is extremely Hot");
        }
        else if (n == 100) {
            System.out.println(n+ " is Boiling");
        }
        else
            System.out.println("What is you up to, mate?");
    }
}
