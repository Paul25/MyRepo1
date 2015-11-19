package com.company;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

@RunWith(JUnit4.class)
public class AngelTest
{
    public WebDriver dr;


    @After
    public void clean()
    {
        dr.quit();
    }

   @Test
   public void test3() throws InterruptedException {

       dr.findElement(By.name("master")).sendKeys("12345678");
       dr.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");
       dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
       dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
        System.out.println(s);
        Thread.sleep(5000);
        Assert.assertEquals("nVQiy+y71a",s);

    }



    @Test
    public void test4() throws InterruptedException {

        dr.findElement(By.name("master")).sendKeys("");
        dr.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
        System.out.println(s);
        Assert.assertEquals("Password generator",dr.getTitle());
        //Thread.sleep(5000);
        //dr.quit();
    }
    @Test
    public void test5() throws InterruptedException {

        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("");
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
        System.out.println(s);
        Assert.assertEquals("Password generator",dr.getTitle());
        //Thread.sleep(5000);
        //h.quit();
    }

    @Before
    public void qwerty()
    {

        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://angel.net/~nic/passwd.sha1.1a.html");
    }
}
