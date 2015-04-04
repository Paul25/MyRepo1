package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by XPS on 04.04.2015.
 */
public class MyTraining {

    public static void main(String[] args)
    {
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
    }
}
