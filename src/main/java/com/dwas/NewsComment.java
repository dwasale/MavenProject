package com.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsComment extends FirstMaven{   // Extending the class from super class which inherits all the attributes and methods

    public static void main(String[] args) {
        //System.setProperty() method forms the basis for test automation on any browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver.exe");  //Test case automation on chrome
        driver = new ChromeDriver(); // Creating object for ChromeDriver
        driver.get("https://demo.nopcommerce.com");   //Navigate the given URL and wait till page load
        driver.manage().window().maximize();    //It returns instance of option interface and returns instance of window interface
        driver.findElement(By.xpath("//div[@class='news-item'][2]/div[3]")).click(); //It identifies unique element by xPath and clicks the button
        driver.findElement(By.name("AddNewComment.CommentTitle")).sendKeys("Very Good"); // Identifies unique element by name and insert "Very Good" in that field
        driver.findElement(By.name("AddNewComment.CommentText")).sendKeys("One of the demo web " +
                "page to work on for testing. " +
                "The contain are very simple and easy to navigate."); //Identifies unique element by name and insert user input data passed in sendKey() method in that field
        driver.findElement(By.name("add-comment")).click();  // It will click the button which has unique locator passed in findElement by name

        String getMessage = driver.findElement(By.className("result")).getText();   //It stores the result String value in getMessage
        System.out.println(getMessage); // It will print the getMassage String value in console

        driver.quit();  //It closes all the browser window and WebDriver session
    }
}
