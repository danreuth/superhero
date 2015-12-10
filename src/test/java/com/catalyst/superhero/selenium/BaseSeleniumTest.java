package com.catalyst.superhero.selenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


/**
 * Created by dan on 12/5/15.
 */
public class BaseSeleniumTest {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/home/dan/Documents/chromedriver");

        driver = new ChromeDriver();
    }

    @Test
    public void getTitle() {
        driver.get("localhost:8080");
        
        String actualTitle = driver.getTitle();

        assertEquals("Hero App", actualTitle);
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
        driver.quit();
    }


}
