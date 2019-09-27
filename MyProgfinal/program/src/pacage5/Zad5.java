package pacage5;

import java.util.Scanner;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad5 {
    public Zad5(){

    }
    public static void exp() {
        int n=0;
        Scanner in = new Scanner(System.in);
        System.out.print("введите длину последовательности N: ");
        n=in.nextInt();
        if ((n>0)&&(n<101)) {
            for (int i=0;i<n;i++){
                if (palindr(Integer.toString(i))){
                    System.out.println(i);
                }
            }
        } else {System.out.println("N!=(0;100]: ");}
    }
    public static boolean palindr(String st){
        for ( int i=0; i<=st.length()/2-1;i++){
            if (st.charAt(i)!=st.charAt(st.length()-i-1)) return false;
        }
        return true;
    }
}
