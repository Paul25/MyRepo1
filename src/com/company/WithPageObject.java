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
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class WithPageObject
{

    @Before
    public void qwerty()
    {

        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        PageObject.dr = new ChromeDriver();
        PageObject.dr.manage().window().maximize();
        PageObject.dr.get("http://angel.net/~nic/passwd.sha1.1a.html");
        //dr.get("http://oxogamestudio.com/passwd.current6.htm");
    }

    @After
    public void clean()
    {
        PageObject.dr.quit();
    }

    @Test
    public void test3() throws InterruptedException
    {
        PageObject.setMaster("12345");
        PageObject.setSite("p@m.ua");
        Thread.sleep(5000);
        PageObject.generate();
        /*
        dr.findElement(By.name("master")).sendKeys("12345678");
        dr.findElement(By.name("site")).sendKeys("missile2013@yandex.ru");
        dr.findElement(By.name("site")).sendKeys(Keys.ENTER);
        dr.findElement(By.name("password")).getAttribute("value");
        String s=dr.findElement(By.name("password")).getAttribute("value");
        */
        System.out.println(PageObject.passwrd());
        Thread.sleep(5000);
        Assert.assertEquals("Test passed","tPcfS2OZ1a",PageObject.passwrd());
    }

    @Test
    public void test4() throws InterruptedException
    {
        PageObject.setField("", "p@m.ua");
        PageObject.generate();
        System.out.println(PageObject.passwrd());
        Thread.sleep(3000);
        Assert.assertEquals("Password generator",PageObject.dr.getTitle());
    }
    @Test
    public void test5() throws InterruptedException
    {
        PageObject.setField("12345", "");
        PageObject.generate();
        System.out.println(PageObject.passwrd());
        Thread.sleep(3000);
        Assert.assertEquals("Password generator",PageObject.dr.getTitle());
    }

    @Test
    public void test6() throws InterruptedException
    {
        List<WebElement> list = new ArrayList<WebElement>();
        list = PageObject.dr.findElements(By.xpath("//input[@value='Generate']"));
        list.get(2).click();
        System.out.println(PageObject.passwrd());
        Thread.sleep(3000);
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", PageObject.passwrd());
    }
    @Test
    public void test7() throws InterruptedException
    {
        String str = "";
        for (int i = 0; i < 200; i++)
            str = str + 1;
        PageObject.setField(str, str);
        PageObject.generate();
        System.out.println(PageObject.passwrd());
        Thread.sleep(3000);
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", PageObject.passwrd());
    }
    @Test
    public void test8() throws InterruptedException
    {

        PageObject.setField("/';*&#&$@^!_...\\n", "/';*&#&$@^!_...\\n");
        PageObject.generate();
        System.out.println(PageObject.passwrd());
        Thread.sleep(5000);
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", PageObject.passwrd());
    }
    @Test
    public void test9()
    {
//        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("input")));
        //input[@type='submit']
        WebElement pasha= PageObject.dr.findElement(By.xpath("//input[@type='submit']"));
//        String title = list.get(2).getAttribute("value");
        //String title = pasha.getAttribute("value");

        try
        {
            Thread.sleep(5000);
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        Assert.assertEquals("Test failed!!!","Generate", pasha.getAttribute("value"));
    }
    @Test
    public void test10()
    {
        PageObject.setField("/';*&#&$@^!_...\\n", "/';*&#&$@^!_...\\n");
        PageObject.generate();
        Assert.assertEquals("/';*&#&$@^!_...\\n", PageObject.dr.findElement(By.name("master")).getAttribute("value"));
    }
    @Test
    public void test11()
    {
        PageObject.setField("/';*&#&$@^!_...\\n", "/';*&#&$@^!_...\\n");
        PageObject.generate();
        Assert.assertEquals("Master is not editable",true, PageObject.dr.findElement(By.name("master")).isEnabled());
    }
    @Test
    public void test12()
    {
        PageObject.setField("12345", "p@m.ua");
        PageObject.generate();
        Assert.assertEquals("Site is not editable",true, PageObject.dr.findElement(By.name("site")).isEnabled());
    }
    @Test
    public void test13()
    {
        PageObject.setField("12345", "p@m.ua");
        PageObject.generate();
        Assert.assertEquals("Password is not editable",true, PageObject.dr.findElement(By.name("password")).isEnabled());
    }
    @Test
    public void test14()
    {
        List<WebElement> list = new ArrayList<WebElement>(PageObject.dr.findElements(By.tagName("td")));
        String title = list.get(0).getText();
        Assert.assertEquals("Test failed!!!","Your master password", title);
    }
    @Test
    public void test15()
    {
        List<WebElement> list = new ArrayList<WebElement>(PageObject.dr.findElements(By.tagName("td")));
        String title = list.get(2).getText();
        Assert.assertEquals("Test failed!!!","Site name", title);
    }
    @Test
    public void test16()
    {
        List<WebElement> list = new ArrayList<WebElement>(PageObject.dr.findElements(By.tagName("td")));
        String title = list.get(5).getText();
        Assert.assertEquals("Test failed!!!","Generated password", title);
    }


}