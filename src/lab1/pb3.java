package lab1;

import java.util.Scanner;

public class pb3 {
    public static void main(String[] args) {
        int n,i,nr=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("n= ");
        n = scanner.nextInt();
        scanner.close();

        for(i=2;i<n;i++)
            if(n%i==0)
            {System.out.println(i);
                nr++;
            }
        if(nr==0)
            System.out.println("Numarul este prim");
    }
}
