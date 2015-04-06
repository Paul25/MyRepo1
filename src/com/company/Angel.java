package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

/**
 * Created by XPS on 06.04.2015.
 */
public class Angel {
    public static String Angel (WebDriver h, String master, String site){
        h.findElement(By.name("master")).sendKeys(master);
        h.findElement(By.name("site")).sendKeys(site);
        h.findElement(By.name("site")).sendKeys(Keys.ENTER);
        h.findElement(By.name("password")).getAttribute("value");
        String s=h.findElement(By.name("password")).getAttribute("value");
        return s;
    }

        public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        WebDriver h = new ChromeDriver();
        h.manage().window().maximize();
        h.get("http://angel.net/~nic/passwd.sha1.1a.html");
            compare(Angel(h, "12345678", "missile2013@yandex.ru"), "nVQiy+y71a");
       // h.findElement(By.name("master")).sendKeys("12345678");
       // h.findElement(By.name("asda")).getAttribute("value");
       // h.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");


       // System.out.println(s);
        //System.out.println(h.getTitle());
        //WebElement s = h.findElement(By.name("q"));
        //s.sendKeys("qa factory");
        //s.sendKeys("qa factory", Keys.ENTER);
        System.out.println(Angel(h, "12345678", "missile2013@yandex.ru"));

        Thread.sleep(5000);
        h.quit();

    }
    public static void compare(String real, String unreal) {
        if (real == unreal) {
            System.out.println("Test Passed");
        } else {
            System.out.println("Test failed");
        }
    }

}
