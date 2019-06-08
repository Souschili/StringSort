package com.company;



import java.util.List;
import java.util.Scanner;

public class Main {

    static private String poem =
            "И сидит, сидит зловещий Ворон черный, Ворон вещий, " +
            "С бюста бледного Паллады не умчится никуда. " +
            "Он глядит, уединенный, точно Демон полусонный, " +
            "Свет струится, тень ложится,- на полу дрожит всегда. " +
            "И душа моя из тени, что волнуется всегда. " +
            "Не восстанет никогда!";
    public static void main(String[] args) {
        String clearPoem=poem.replaceAll("\\pP", ""); // зачищаем строку
        System.out.println(clearPoem);                                //для проверки можно удалить
        String [] poemArr=clearPoem.split(" ");                       // получаем массив строк

        //типа интерактивный интерфейс
        do {
            System.out.println("1. Сортировака по возрастанию");
            System.out.println("2. Сортировка по убыванию");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n==1)
            {
                WordsSort ws=new WordsSort(poemArr);
                for(String str:ws.higthBuble())
                {
                    System.out.println(str+"---"+str.length());
                }
            }
            else if(n==2)
            {
                WordsSort ws=new WordsSort(poemArr);
                for(String str:ws.lowBuble())
                {
                    System.out.println(str+"---"+str.length());
                }
            }

            if( n!=1 || n!=2)
                break;
        }while(true);






    }
}
