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
   public static void printN(String s1) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {


                System.out.print(s1 + " ");
            }
            System.out.println();
        }
   }
/*

        int j = 0;
        for (int i = 0; i < 5; i++)
            for (j; j < 10; j++)
                System.out.print(s1 + " " ); // но в конце у тебя будет пробел
        j = 0;
*/



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


        { String s="MAY 6 1983";
            System.out.println("I was born "+s);
        }

        printN("Pasha");
        //Вывести на экран произведение 10 чисел от 1 до 10. Результат - 1 число.
        //Подсказка: будет три миллиона с хвостиком.
        int mp=1;
        for(int i1=1; i1<=10; i1++)
        {
         mp=mp*i1;
        }System.out.println(mp);
        /*Сумма 10 чисел
        Вывести на экран сумму чисел от 1 до 10 построчно:
        1
        1+2=3
        1+2+3=6
        1+2+3+4=10
        */

        int mp1=1;
        for(int i2=2; i2<=10; i2++)
        {
            System.out.println(mp1);
            mp1=mp1+i2;

        }
        /* Мама мыла раму
Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
МылаРамуМама
РамуМамаМыла
...
*/
        String s="Мама";
        String s1="Мыла";
        String s2="Раму";
        String[] text ={"Мама", "Мыла", "Раму"};
        int n = text.length;
        for (int i1 = 0; i1 < n; i1++) {
            for (int i2 = 0; i2 < n; i2++) {
                for (int i3 = 0; i3 < n; i3++) {
                    if (i1!=i2&i1!=i3&i2!=i3)
                        System.out.println(text[i1]+text[i2]+text[i3]);
                }
            }
        }
        /* Таблица умножения
Выведи на экран таблицу умножения 10 на 10 в следующем виде:
1 2 3 …
2 4 6 …
3 6 9 …
…
*/
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


    }
}






