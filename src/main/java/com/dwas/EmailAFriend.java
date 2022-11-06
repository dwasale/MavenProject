package com.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailAFriend extends FirstMaven{ // Inherits all the attributes and methods of parent class

    public static void main(String[] args) {
        //System.setProperty() method forms the basis for test automation on any browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver"); //It forms the test case automation on chrome
        driver = new ChromeDriver();    //Creating driver as an object for ChromeDriver
        driver.get("https://demo.nopcommerce.com/");  //Navigate the given URL and wait till page load
        driver.manage().window().maximize(); //It returns instance of option interface and returns instance of window interface
        driver.findElement(By.linkText("Apple MacBook Pro 13-inch")).click(); //Uniquely identify the element within the web page and perform given action click
        driver.findElement(By.className("email-a-friend")).click(); //Uniquely identify the element within the web page and perform given action click
        driver.findElement(By.className("friend-email")).sendKeys("friendemail@email.com"); //Uniquely identify the element within the web page fill it with the given user data
        driver.findElement(By.className("your-email")).sendKeys("myemail@email.com"); //Uniquely identify the element within the web page fill it with the given user data
        driver.findElement(By.name("PersonalMessage")).sendKeys("This is one of the best laptop in the market " +
                "with very high specs for day to day computing" +
                ". I recommend to get the latest 2022 version of macBook air with M2 chip."); //Uniquely identify the element within the web page fill it with the given user data
        driver.findElement(By.name("send-email")).click(); //It will click the send email button

        String getMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText(); //It will store the String value of validation after clicking send button
        System.out.println(getMessage); //Prints the message in console

        driver.quit();  //Quits all the browser window and terminates the WebDriver session
    }
}
