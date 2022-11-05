package com.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePageCategories extends FirstMaven{  // Inherits all the attributes and methods from FirstMaven super class

    public static void main(String[] args) {
        // System.setProperty() method forms the basis for test automation on any browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");  // Test case automation on chrome
        driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com");
        driver.manage().window().maximize();
        // Below statements from line 15-21 is just to show that given unique locator is navigation through the website as intended
        driver.findElement(By.linkText("Computers")).click();
        driver.findElement(By.linkText("Electronics")).click();
        driver.findElement(By.linkText("Apparel")).click();
        driver.findElement(By.linkText("Digital downloads")).click();
        driver.findElement(By.linkText("Books")).click();
        driver.findElement(By.linkText("Jewelry")).click();
        driver.findElement(By.linkText("Gift Cards")).click();
        //------------------------------------------------------------------------------------------------------

        String getMenuNames = driver.findElement(By.className("header-menu")).getText();// Store all the String value of given unique locator in getMenuNames variable
        System.out.println(getMenuNames);   // Printing the String value in console

//        String getTextComputer = driver.findElement(By.linkText("Computers")).getText();
//        System.out.print(getTextComputer + "\t");
//
//        String getTextElectronics = driver.findElement(By.linkText("Electronics")).getText();
//        System.out.print(getTextElectronics + "\t");
//
//        String getTextApparel = driver.findElement(By.linkText("Apparel")).getText();
//        System.out.print(getTextApparel + "\t");
//
//        String getTextDigital = driver.findElement(By.linkText("Digital downloads")).getText();
//        System.out.print(getTextDigital + "\t");
//
//        String getTextBooks = driver.findElement(By.linkText("Books")).getText();
//        System.out.print(getTextBooks + "\t");
//
//        String getTextJewelry = driver.findElement(By.linkText("Jewelry")).getText();
//        System.out.print(getTextJewelry + "\t");
//
//        String getTextGift = driver.findElement(By.linkText("Gift Cards")).getText();
//        System.out.print(getTextGift);

        driver.quit();  //Quits all browser window and terminates WebDriver session
    }
}
