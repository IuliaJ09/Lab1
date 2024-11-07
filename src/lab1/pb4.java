package lab1;

import java.util.Random;

public class pb4 {
    public static void main(String[] args) {
        Random rand = new Random();
        int a=rand.nextInt(30);
        int b=rand.nextInt(30);
        System.out.println(a);
        System.out.println(b);
        while(a!=b)
            if(a>b)
                a=a-b;
            else
                b=b-a;
        System.out.println(a);
    }
}
