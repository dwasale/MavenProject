package com.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Products extends FirstMaven{   // 'extends' keyword inherits all the attributes and methods

    public static void main(String[] args){
        // System.setProperty() method forms the basis for test automation on any browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe"); // Test case automation on chrome
        driver = new ChromeDriver();    // Instantiating for ChromeDriver
        driver.get("https://demo.nopcommerce.com"); // Navigating the given url and wait till the page loads
        driver.manage().window().maximize();    // It returns instance of option interface and returns instance of window interface
        driver.findElement(By.linkText("Computers")).click();   // Navigates through given unique locator and performs click action
        driver.findElement(By.linkText("Desktops")).click();    // Navigates through given unique locator and performs click action

        String getMessage = driver.findElement(By.className("center-2")).getText(); // This command/statement will store all the String value from Desktops div
        System.out.println(getMessage);     // It will print the String value stored in getMessage

        driver.quit();  // Quits all the browser window and end the WebDriver session
    }
}
