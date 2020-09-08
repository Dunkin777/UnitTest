package ru.croc;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverSettings {
    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "D:\\Downloads/chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("test start");
    }
    @After
    public void close() {
        System.out.println("test close");
        driver.quit();
    }
}
