package com.company;

/**
 * Created by XPS on 25.03.2015.
 */
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        //Если первый элемпент арг равен Хелло-напечатать  в консоль Класс, иначе напечатать Гуд бай
        if (args[0].equals("Hello"))
        {
            System.out.println("Class");
        } else {
            System.out.println("Good-bye");
       }
        if(args[0].equals("Hello"))
      {
          System.out.println("Success");
      } else {
            System.out.println("Success");
        }
           if(args[1].equals("Class"))

        {
        System.out.println("Success");
        }
        else {System.out.println("Good-bye");
        }

    int s=10;
    while (s < 15)
    {
        System.out.println("s is" + s);
        s=s+1;
    }
        while (true)
        {
         if (s>15)
         {
            break;
         }
            s=s+1;
        }
    }
}
