package lab1;

import java.util.Random;

public class pb5 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(20);
        System.out.println("Număr aleatoriu: " + randomNumber);
        int k=2;
        int []v=new int[10];
        v[0]=0;
        v[1]=1;

        while(k<v.length){
            v[k]=v[k-1]+v[k-2];
            if(v[k]>=randomNumber){
                break;
            }
            k++;
        }
        if(v[k]==randomNumber){
            System.out.println("Nr face parte din sirul lui Fibonacci");
        }
        else{
            System.out.println("Nr nu face parte din sirul lui Fibonacci");
        }
    }
}
