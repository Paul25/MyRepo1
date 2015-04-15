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
public class Shortcom
{
    public WebDriver dr;
    public void mas(String master)
    {
        dr.findElement(By.name("master")).sendKeys(master);
    }
    public void mysite (String site)
    {
        dr.findElement(By.name("site")).sendKeys(site);
            }
    public void sentkey ()
    {
        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
            }
    /*public void sentGener ()
    {

        dr.findElement(By.name("site")).sendKeys(Keys."Generate");
        }
        */
    public String passwrd()
    {
        String ps=dr.findElement(By.name("password")).getAttribute("value");
        return ps;
    }

    @After
    public void clean()
    {
        dr.quit();
    }

    @Test
    public void test3() throws InterruptedException {
        mas("12345678");
        mysite ("missile2013@yandex.ru");


        /*
        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");
        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
        */
        System.out.println(passwrd());
        Thread.sleep(5000);
        Assert.assertEquals("nVQiy+y71a",passwrd());

    }



    @Test
    public void test4() throws InterruptedException {
        mas("");
        mysite ("missile2013@yandex.ru");
      /*
        dr.findElement(By.name("master")).sendKeys("");
        dr.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
       */
        System.out.println(passwrd());
        Assert.assertEquals("Password generator",dr.getTitle());
        //Thread.sleep(5000);
        //dr.quit();
    }
    @Test
    public void test5() throws InterruptedException {
        mas("12345678");
        mysite ("");

       /*
        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("");
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
       */
        System.out.println(passwrd());
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