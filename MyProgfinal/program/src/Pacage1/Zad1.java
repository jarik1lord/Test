package Pacage1;
import java.util.Scanner;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad1 {
    public Zad1(){

    }
    public static void exp( ){
        int n=1;
        Scanner in = new Scanner(System.in);
        System.out.print("введите число: ");
        if(in.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
            n = in.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
            if(n==2){ System.out.println("четное простое: "+n);}
            else{
                if ((n % 2)==0) {
                    if (n > 2) {
                        System.out.println("четное составное: " + n);
                    }else System.out.println("четное и не простое и не составное: " + n);
                }
                else {
                    int i=3;
                    if (n>2){
                        while ((i*i)<=n){
                            if (n % i ==0){ System.out.println("нечетное не простое: "+n);break;}
                            i=i+2;
                        }
                        if (i*i>n){System.out.println("нечетное простое: "+n);}
                    }
                    else{
                        System.out.println("нечетное и не составное и не простое: "+n);}
                }
            }
        }
        else {System.out.println("что то не то с числом");}
    }
}
