package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by XPS on 04.04.2015.
 */
public class MyTraining {

    //public static void main(String[] args)


     //1
        /*
        System.setProperty("webdriver.chrome.driver","E:/Course/chromedriver_win32/chromedriver.exe");
        WebDriver h=new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://homka.ua");
        //Thread.sleep(10000);
        //String title=h.getTitle();
        //System.out.println(h.getTitle());
        //WebElement s=h.findElement(By.name("о продукции"));
        //s.sendKeys("qa factory");
        //h.findElement(By.name("о продукции")).click();
        h.quit();
        */


        //2
        /*

        String[] s={"Hello","Class","."};
        List<String> f=new ArrayList<String>();
        f.add("Privet");
        f.add("Class");
        f.add(".");
        System.out.println(s[0]);
        System.out.println(s[1]);
        System.out.println(s[2]);
        System.out.println(f.get(0));
        System.out.println(f.get(1));
        System.out.println(f.get(2));
        */
        //3
        public static void print (List<String> s)
        {

        for (int i = 0; i < s.size(); i++)
        {

            System.out.println(s.get(i));
        }

        }
        public static boolean areListsEqual (List s, List f){

        if (s.equals(f)){
            return true;
        }

        return false;
    }

    public static void print (String[] a){

        for (int i = 0; i < a.length; i++) {

            System.out.print(a[i]);

        }

        System.out.println();

    }
    public static boolean isEqual(String[]a, List<String> s){

        if (a.length == s.size()) {

            /*for (int i = 0; i < a.length; i++) {

                if (a[i] == s.get(i)){
                    System.out.println(a[i] + " = " + s.get(i));

                }
           */  return true;}

        return false;
    }


    public static void main(String[] args)  {

        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        print(s);

        List<String> f = new ArrayList<String>();
        f.add("a");
        f.add("b");
        f.add("c");
        f.add("d");
        System.out.println(areListsEqual(s, f));

        f.add("d");
        System.out.println(areListsEqual(s, f));

        s.add("b");
        System.out.println(areListsEqual(s, f));

        List<String> s1 = new ArrayList<String>();
        List<String> s2 = new ArrayList<String>();
        System.out.println(areListsEqual(s1, s2));

        String[] a = {"a", "b", "c", "d", "b"};
        print(a);

        System.out.println(isEqual(a, s));

    }

}

