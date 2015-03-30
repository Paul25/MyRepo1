package com.company;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by XPS on 30.03.2015.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","E:/Course/chromedriver_win32/chromedriver.exe");
        WebDriver h=new ChromeDriver();
        h.manage().window().maximize();
        h.get("https://google.com");
        Thread.sleep(5000);
        h.quit();
        String s="Hello";
        int i=10;
        //i=s.length;
        System.out.println(i);
        s.contains("c");
        String g=new String();
        g="";
    }
}
