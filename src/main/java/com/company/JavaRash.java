package com.company;

import static java.lang.System.*;

/**
 * Created by XPS on 20.04.2015.
 */
public class JavaRash {

    /*//1
    public static int min(int a, int b, int c, int d)
    {
        int m = min(a, b);
        if (m<c && m<d)
            m = min(a, b);
        else if (c<d)
            m = c;
        else m = d;
        return m; //Напишите тут ваш код
    }
    public static int min(int a, int b)
    {
        int m2;
        if (a<b)
             m2 = a;
        else m2 = b;
        return m2; //Напишите тут ваш код
    }
    //2
   public static void printN(String s1) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {


                System.out.print(s1 + " ");
            }
            System.out.println();}}*/


    public static void main(String[] args) throws Exception {
        /*//1
        if (min(5, 8, 6, 6) != 5)
        {
            System.out.println("1) Неправильно для a"); //вывод=5
        }
        if (min(-1, -3, -2, -5) != -5)
        {
            System.out.println("2) Неправильно для отрицательных чисел"); //вывод=-5
        }
        if (min(10, 5, 20, 42) != 5)
        {
            System.out.println("3) Неправильно для b"); //вывод=5
        }
        if (min(5, 5, 5, 5) != 5)
        {
            System.out.println("4) Неправильно для всех равных чисел"); //вывод=5
        }
        if (min(8, 7, 5, 6) != 5)
        {
            System.out.println("5) Неправильно для c"); //вывод=5
        }
        if (min(8, 7, 5, 5) != 5)
        {
            System.out.println("6) Неправильно для равных c и d"); //вывод=5
        }
        if (min(5, 5, 6, 6) != 5)
        {
            System.out.println("7) Неправильно для равных двух пар"); //вывод=5
        }

        //3
        { String s="MAY 6 1983";
            System.out.println("I was born "+s);
        }

        //2
        printN("Pasha");
        //4 Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
        //Подсказка: будет три миллиона с хвостиком.
        int mp=1;
        for(int i1=1; i1<=10; i1++)
        {
         mp=mp*i1;
        }System.out.println(mp);
        //5
        *//*Сумма 10 чисел
        Вывести на экран сумму чисел от 1 до 10 построчно:
        1
        1+2=3
        1+2+3=6
        1+2+3+4=10
        *//*
        int mp1=1;
        for(int i2=2; i2<=10; i2++)
        {
            System.out.println(mp1);
            mp1=mp1+i2;

        }
        */
        /* //6 Мама мыла раму
             Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
             Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
             МылаРамуМама
             РамуМамаМыла
             */
     /*

        String s = "Мама";
        String s1 = "Мыла";
        String s2 = "Раму";
        String[] text = {"Мама", "Мыла", "Раму"};
        int n = text.length;
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                for (int i3 = 0; i3 < n; i3++) {
                    if (i1 != i2 & i1 != i3 & i2 != i3)
                        System.out.println(text[i1] + text[i2] + text[i3]);
                }
            }
        }
     */

        int qw = 5;
        int we = 6;
        int er = qw + we;

        System.out.print(er);
    }
}
        /*
        //7
        *//* Таблица умножения
       Выведи на экран таблицу умножения 10 на 10 в следующем виде:
        1 2 3 …
         2 4 6 …
        3 6 9 …
        …
         *//*
        int f=1;
        int r=1;
        for(int i1=1; i1<=10; i1++)
        {
             r=i1;
            for (int j1 = 1; j1 <= 10; j1++)
            {
               f = j1;
              System.out.print((r*f)+" ");
            }
            System.out.println();
        }
        //8
        String a="It's Windows path:";
        String a1="C:\\Program Files\\Java\\jdk1.7.0\\bin";
        String a2="\"";
        String b="It's Java string:";
        String b1="\\C:\\\\Program Files\\\\Java\\\\jdk1.7.0\\\\bin\\";
        String b2="\"";
        String b3="\\";
        *//*
        char sb="It's Windows path: "C:\Program Files\Java\jdk1.7.0\bin"";
        char sb1="It's Java string: \"C:\\Program Files\\Java\\jdk1.7.0\\bin\"";
        String s3=charachter.toString(sb);
        String s4=charachter.toString(sb);
        System.out.println(s3);
        System.out.println(s4)*//*;
        String s5  = "C:\\Program Files\\Java\\jdk1.7.0_45\\bin\\java.exe";
        System.out.println(a+" "+a2+a1+a2);
        System.out.println(b+" "+b2+b3+b1+b2);*/


        //9
/*
        String rainbow[] = {"красный", "оранжевый", "желтый", "зеленый", "голубой", "синий", "фиолетовый"};
        String rainbow1[] = {"КРАСНЫЙ", "ОРАНЖЕВЫЙ", "ЖЕЛТЫЙ", "ЗЕЛЕНЫЙ", "ГОЛУБОЙ", "СИНИЙ", "ФИОЛЕТОВЫЙ"};
        for (int i = 0; i < 3; i++)
        {
            System.out.print(rainbow[i] + " ");
        }
        System.out.println();
        for (int i = 3; i < 6; i++)
        {
            System.out.print(rainbow[i] + " ");
        }
        System.out.println();
        System.out.println(rainbow[6]);
        System.out.print("красный"+" ");
        System.out.print("оранжевый"+" ");
        System.out.println("желтый");
        System.out.print("зеленый"+" ");
        System.out.print("голубой"+" ");
        System.out.println("синий");
        System.out.print("фиолетовый");




    }
}
*/






