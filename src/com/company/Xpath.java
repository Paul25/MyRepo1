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
public class Xpath
{
    public WebDriver dr;
    public void mas(String master)
    {
        dr.findElement(By.xpath("//td[text()='Your master password']/following::input[1]")).sendKeys(master);
    }
    public void mysite (String site)
    {
        dr.findElement(By.xpath("//td[text()='Site name']/following::input[1]")).sendKeys(site);
    }
    /*public void sentkey ()
    {
         dr.findElement(By.xpath("//td[text()='Site name']/following::input[1]").sendKeys(Keys.ENTER));
    }*/
    /*
    dr.findElement(By.name("site")).sendKeys(Keys."Generate");
    WebElement pasha= dr.findElement(By.xpath("//input[@type='submit']"));//td[text()='Site name']/following::input[1]
    */
    public String passwrd() {String ps=dr.findElement(By.name("password")).getAttribute("value");
        return ps;
    }
    public void generate(){
        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("input")));
        list.get(2).click();
    }

    @Before
    public void qwerty()
    {

        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("http://angel.net/~nic/passwd.sha1.1a.html");
        //dr.get("http://oxogamestudio.com/passwd.current6.htm");
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
        generate();
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
        generate();
        System.out.println(passwrd());
        Assert.assertEquals("Password generator",dr.getTitle());
         }
    @Test
    public void test5() throws InterruptedException {
        mas("12345678");
        mysite ("");
        generate();
        System.out.println(passwrd());
        Assert.assertEquals("Password generator",dr.getTitle());
    }

    @Test
    public void test6(){
        List<WebElement> list = new ArrayList<WebElement>();
        list = dr.findElements(By.tagName("input"));
        list.get(2).click();
        System.out.println(passwrd());
        Assert.assertEquals("Test failed!!!","BaefBs8/Z/cm2@1a", passwrd());
    }
    @Test
    public void test7(){
        String str = "";
        for (int i = 0; i < 200; i++)
            str = str + 1;
        mas(str);
        mysite(str);
        generate();
        System.out.println(passwrd());
        Assert.assertEquals("Test failed!!!","aR8ztwNBbSqe5@1a", passwrd());
    }
    @Test
    public void test8(){

        mas("/';*&#&$@^!_...\\n");
        mysite("/';*&#&$@^!_...\\n");
        generate();
        System.out.println(passwrd());
        Assert.assertEquals("Test failed!!!","ctolW6AdI0te1@1a", passwrd());
    }
    @Test
    public void test9(){
//        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("input")));
        //input[@type='submit']
        WebElement pasha= dr.findElement(By.xpath("//input[@type='submit']"));
//        String title = list.get(2).getAttribute("value");
        //String title = pasha.getAttribute("value");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("Test failed!!!","Generate", pasha.getAttribute("value"));
    }
    @Test
    public void test10(){
        mas("/';*&#&$@^!_...\\n");
        mysite("/';*&#&$@^!_...\\n");
        generate();
        Assert.assertEquals("/';*&#&$@^!_...\\n", dr.findElement(By.name("master")).getAttribute("value"));
    }
    @Test
    public void test11(){
        mas("/';*&#&$@^!_...\\n");
        mysite("/';*&#&$@^!_...\\n");
        generate();
        Assert.assertEquals("Master is not editable",true, dr.findElement(By.name("master")).isEnabled());
    }
    @Test
    public void test12(){
        mas("12345678");
        mysite("gmail.com");
        generate();
        Assert.assertEquals("Site is not editable",true, dr.findElement(By.name("site")).isEnabled());
    }
    @Test
    public void test13(){
        mas("12345678");
        mysite("gmail.com");
        generate();
        Assert.assertEquals("Password is not editable",true, dr.findElement(By.name("password")).isEnabled());
    }
    @Test
    public void test14(){
        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("td")));
        String title = list.get(0).getText();
        Assert.assertEquals("Test failed!!!","Your master password", title);
    }
    @Test
    public void test15(){
        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("td")));
        String title = list.get(2).getText();
        Assert.assertEquals("Test failed!!!","Site name", title);
    }
    @Test
    public void test16(){
        List<WebElement> list = new ArrayList<WebElement>(dr.findElements(By.tagName("td")));
        String title = list.get(5).getText();
        Assert.assertEquals("Test failed!!!","Generated password", title);
    }


}