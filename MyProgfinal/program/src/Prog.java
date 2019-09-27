import java.util.Scanner;

import Pacage1.Zad1;
import pacage2.Zad2;
import pacage3.Zad3;
import pacage4.Zad4;
import pacage5.Zad5;
import pacage6.Zad6;

public class Prog {
    public static void main( String[] args){
        int n=-1;
        Scanner in = new Scanner(System.in);
        while(n!=0) {
            System.out.print("введите число номер задания или 0 для выхода: ");
            if (in.hasNextInt()) { // возвращает истину если с потока ввода можно считать целое число
                n = in.nextInt(); // считывает целое число с потока ввода и сохраняем в переменную
                switch (n){
                    case 1:{
                        Zad1 z=new Zad1();
                        z.exp();
                        break;}
                    case 2:{
                        Zad2 z=new Zad2();
                        z.exp();
                        break;}
                    case 3:{
                        Zad3 z=new Zad3();
                        z.exp();break;}
                    case 4:{
                        Zad4 z=new Zad4();
                        z.exp();break;}
                    case 5:{
                        Zad5 z=new Zad5();
                        z.exp();break;}
                    case 6:{
                        Zad6 z=new Zad6();
                        z.exp();break;}
                    default: break;
                }
            } else {
                System.out.println("что то не то с числом");
            }
        }
    }
}
