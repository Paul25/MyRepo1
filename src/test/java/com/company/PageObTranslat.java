package com.company;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by XPS on 05.05.2015.
 */
public class PageObTranslat
{
    public static WebDriver dr;
    @Before
    public void qwerty()
    {

        System.setProperty("webdriver.chrome.driver", "E:/Course/chromedriver_win32/chromedriver.exe");
        dr = new ChromeDriver();
        dr.manage().window().maximize();
        dr.get("https://translate.google.ru/");
        //dr.get("http://oxogamestudio.com/passwd.current6.htm");
    }

    @After
    public void clean()
    {
        dr.quit();
    }
    public static void clickButt()
    {
        WebElement butt=dr.findElement(By.xpath("//*[@id='gt-submit']"));
        butt.sendKeys();
    }
    public static void inpData(String data)
    {
        WebElement inp=dr.findElement(By.xpath("//*[@id='source']"));
        inp.clear();
        inp.sendKeys(data);
    }
    public static void selectLangLeft()
    {
        WebElement selec=dr.findElement(By.xpath("//*[@id='gt-sl-sugg'']/div[1]"));
        selec.sendKeys();
    }
    public static void selectLangRight()
    {
        WebElement selec=dr.findElement(By.xpath("(//div[contains(@value, 'ru')])[2]"));
        selec.sendKeys();
    }
    ////span[@id='result_box']
}
