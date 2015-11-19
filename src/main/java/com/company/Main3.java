package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

/**
 * Created by XPS on 30.03.2015.
 */
public class Main3 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("https://google.com");
        String title = h.getTitle();
        System.out.println(h.getTitle());
        WebElement s = h.findElement(By.name("q"));
        //s.sendKeys("qa factory");
        s.sendKeys("qa factory", Keys.ENTER);
        Thread.sleep(5000);
        WebElement rso = h.findElement(By.id("rso"));
        rso.findElement(By.tagName("a"));
        WebElement f = rso.findElement(By.tagName("a"));
        System.out.println(f.getText());
        List<WebElement> as = rso.findElements(By.tagName("a"));
        for (int i = 0; i < as.size(); i++) {
            System.out.println(as.get(i));
        }

        int j = 0;
        int els = as.size();
        while (j < els) {
            System.out.println(as.get(j).getText());
            System.out.println(as.get(j).getAttribute("href"));
            j = j + 1;
        }
        s.clear();
        s.sendKeys("angel sha1");
        h.findElement(By.name("btnG")).click();


        h.quit();
        //Thread.sleep(5000);

        // String s="Hello";
        //int i=10;
        //i=s.length;
        //System.out.println(i);
        //s.contains("c");
        //String g=new String();
        //g="";

    }
}



