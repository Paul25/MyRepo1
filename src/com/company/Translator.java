package com.company;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by XPS on 29.04.2015.
 */
public class Translator
{
    @Before
    public void qwerty()
    {

        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        PageObTranslat.dr = new ChromeDriver();
        PageObTranslat.dr.manage().window().maximize();
        PageObTranslat.dr.get("https://translate.google.ru/");
        //dr.get("http://oxogamestudio.com/passwd.current6.htm");
    }

    @After
    public void clean()
    {
        PageObTranslat.dr.quit();
    }
    @Test
    public void CheckEmpty() throws InterruptedException {
        PageObTranslat.selectLangLeft();
        PageObTranslat.selectLangRight();
        PageObTranslat.inpData(" ");
        PageObTranslat.clickButt();
        Thread.sleep(5000);
        //Assert.assertEquals();
    }


}
