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
public class PageObject
{
    public static WebDriver dr;
    public static void setMaster(String master)
    {
        WebElement mstr=dr.findElement(By.xpath("//td[text()='Your master password']/following::input[1]"));
        mstr.clear();
        mstr.sendKeys(master);
    }
    public void setSite (String site)
    {
        WebElement st=dr.findElement(By.xpath("//td[text()='Site name']/following::input[1]"));
        st.clear();
        st.sendKeys(site);
    }
    public static String passwrd()
    {
        WebElement ps=dr.findElement(By.xpath("//td[text()='Generated password']/following::input[1]"));
        return ps.getAttribute("value");
    }
    public static void generate()
    {
        WebElement list =  dr.findElement(By.xpath("//input[@value='Generate']"));
        list.click();
    }
    public static void setField(String label, String val)
    {
        if ("Your master password".equals(label))
        {
            setMaster(val);
        }
        if ("Site name".equals(label))
        {
            setSite(val);
        }
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



}