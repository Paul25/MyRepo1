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

    public static void main(String[] args)

    {
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
        List<String> s = new ArrayList<String>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");

                     System.out.print(s);      



    }
}
