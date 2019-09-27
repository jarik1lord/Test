package pacage4;

import java.util.Scanner;

/**
 * Created by jarik on 27.09.2019.
 */
public class Zad4 {
    public Zad4(){

    }
    public static void exp() {
        String slovo=new String();
        String text=new String();
        String st;
        Scanner in = new Scanner(System.in);
        System.out.print("введите слово: ");
        slovo=in.nextLine();
        System.out.print("введите текст: ");
        text=in.nextLine();
        short c=0,ind=-1;
        short i=0;
        for (i=0;i<text.length();i++){
            if(text.charAt(i)==' ') {if ((i-1!=ind)) {if(slovo.equalsIgnoreCase(text.substring(ind+1,i))) c++;} ind=i;}
        }
        if (ind<i-1) if(slovo.equalsIgnoreCase(text.substring(ind+1,i)))c++;
        System.out.println("Количество совпадений: "+c);

    }
}
