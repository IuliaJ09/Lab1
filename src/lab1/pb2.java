package lab1;
import java.io.*;
import java.util.Scanner;

public class pb2 {
    public static void main(String[] args) throws IOException {
        int x=0,nr=0;
        float mediaA=0;
        int minn=Integer.MAX_VALUE,maxx=Integer.MIN_VALUE;
        String nume_fis= "in.txt ";
        Scanner flux_in;

        flux_in = new Scanner(new File("C:\\pj\\Lab1\\src\\lab1\\in.txt"));


        while(flux_in.hasNextInt()){
            x=flux_in.nextInt();
            if(x>maxx)
                maxx=x;
            if(x<minn)
                minn=x;
            nr++;
            mediaA=mediaA+x;
        }
        System.out.println("Suma lor este: "+mediaA);
        mediaA=mediaA/nr;
        System.out.println("Media lor aritmetica este: "+mediaA);
        System.out.println("Minimul: "+minn);
        System.out.println("Maximul este "+maxx);

    }
}

