package pacage3;

import java.util.Scanner;

import pacage3.predloj.Predl;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad3 {
    public Zad3(){

    }
    public static void exp() {
        Predl stroka=new Predl();
        Scanner in = new Scanner(System.in);
        System.out.print("введите строку: ");
        stroka.setST(in.nextLine());
        System.out.println("Количество слов: "+stroka.colslov());
        System.out.println("Отсортированная строка: "+stroka.sortST().toString());
        System.out.println("ЗАмена первых букв слов на заглавные: "+stroka.capsST().toString());
    }

}
