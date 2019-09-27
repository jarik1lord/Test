package pacage2;

import java.util.Scanner;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad2 {
    public Zad2(){

    }
    public static void exp(){
        int n1,n2;
        int n11,n22;
        Scanner in = new Scanner(System.in);
        System.out.print("введите число 1: ");
        if(in.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            n1 = in.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            System.out.print("введите число 2: ");
            if(in.hasNextInt()) {
                n2 = in.nextInt();
                if ((n2!=0)&&(n1!=0)) {
                    if (n2<0) n2=n2*(-1);
                    if (n1<0) n1=n1*(-1);
                    n11=n1;n22=n2;
                    while (n11!=n22){
                        if (n11>n22) n11=n11-n22;
                        else n22=n22-n11;
                    }
                    {System.out.println("НОД ="+n11+" НОК ="+(n1*n2/n11));}
                }
                else {System.out.println("одно из чисел =0");}
            }else {System.out.println("что то не то с 2 числом");}
        }
        else {System.out.println("что то не то с 1 числом");}
    }
}
