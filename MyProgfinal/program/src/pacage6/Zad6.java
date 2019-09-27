package pacage6;

import java.util.Scanner;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad6 {
    public Zad6(){

    }
    private static int l=10;
    private static int m=2;
    public static void exp() {
        int n=0;

        Scanner in = new Scanner(System.in);
        System.out.print("введите грузоподъемность: ");
        n=in.nextInt();
        int[][] nabor_v= new int[l][m];
        nabor_v[0][0]=45;nabor_v[0][1]=400;
        nabor_v[1][0]=30;nabor_v[1][1]=350;
        nabor_v[2][0]=25;nabor_v[2][1]=200;
        nabor_v[3][0]=20;nabor_v[3][1]=150;
        nabor_v[4][0]=15;nabor_v[4][1]=300;
        nabor_v[5][0]=15;nabor_v[5][1]=100;
        nabor_v[6][0]=10;nabor_v[6][1]=200;
        nabor_v[7][0]=10;nabor_v[7][1]=600;
        nabor_v[8][0]=2;nabor_v[8][1]=100;
        nabor_v[9][0]=2;nabor_v[9][1]=50;
        if (n>0) {
            Sort_mas p=new Sort_mas(n);
            for (int i=0;i<l;i++){
                p.add_mas(i,nabor_v[i][0],nabor_v[i][1]);
            }
            System.out.println(p.max_vmest());
            System.out.println(p.max_st);
        } else {System.out.println("N<1: ");}
    }
}
