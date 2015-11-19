package com.company;

/**
 * Created by XPS on 25.03.2015.
 */
public class Main2 {
    public static void main(String[] args) {
        //System.out.println(args[0]);
        //Если первый элемпент арг равен Хелло-напечатать  в консоль Класс, иначе напечатать Гуд бай
        if (args[0].equals("Hello")) {
            System.out.println("Class");
        } else {
            System.out.println("Good-bye");
        }
        if (args[0].equals("Hello")) {
            System.out.println("Success");
        } else {
            System.out.println("Success");
        }
        if (args[1].equals("Class"))

        {
            System.out.println("Success");
        } else {
            System.out.println("Good-bye");
        }

        int s = 10;
        while (s < 15) {
            System.out.println("s is" + " " + s);
            s = s + 1;
        }
        while (true) {
            if (s > 15) {
                break;
            }
            s = s + 1;
        }
        if (s > s) {
            System.out.println("s greater s");
        } else if (s < s) {
            System.out.println("s less s");
        } else {
            System.out.println("other");
        }
        if (false) {
            System.out.println("hi there");
        }
        int n = 20;
        int b = n + 5;
        while (n > 0) {
            System.out.println("Recycle " + b);
            n = n - 10;
        }
        boolean pereryv = true;
        boolean luchshe = false;
        if (!luchshe && pereryv) {
            System.out.println("Перерьіву не бьіть.");
        } else if (!(luchshe && pereryv)) {
            System.out.println("Перерьіву бьіть.");
        }

        //oolean URLboolean = false;
        //Stirng URL = "";
        //if URL != ""
       // {
          //  URLboolean = true;}
        /*int i=0;
        while (i<5)
        {
            i=i+1;
            System.out.println(i);
        }
        System.out.println(i);
        String f ="f";
        for(int j=0; j<5; j=j+1)
        {
            System.out.println(j);
        }
        if (f.equals("error"))
        {
            break;
        }
        System.out.println("Hello");
        if (f.equals("error"))
        {
            continue;
        }
       /* System.out.println("Hello");






    }
}*/
        String a = "Hello Class";
        System.out.println(a);


}

}