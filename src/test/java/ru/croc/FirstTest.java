package ru.croc;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {
    @Test
    public void firstTest() {
        driver.get("https://croc.ru/");
        String title = driver.getTitle();
        Assert.assertEquals("КРОК ИТ-компания - Croc", title);
    }

    @Test
    public void firstTest2() {
        driver.get("https://croc.ru/");
        String title = driver.getTitle();
        driver.manage().window().setSize(new Dimension(200,200));
        Assert.assertEquals("КРОК ИТ-компания - Croc", title);
    }

    @After
    public void close() {
    System.out.println("test close");
    driver.quit();
    }
}
