package com.company;

/**
 * Created by XPS on 20.04.2015.
 */
public class JavaRash {
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

    public static void main(String[] args) throws Exception
    {
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
    }
}