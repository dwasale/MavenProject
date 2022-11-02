package com.dwas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.SimpleDateFormat;

public class FirstMaven {

    protected static WebDriver driver;  // Declaring WebDriver interface as 'driver' for global use

    public static void main(String[] args) {
        // System.setProperty() method forms the basis for test automation on any browser
        System.setProperty("webdriver.chrome.driver","src/test/java/Drivers/chromedriver");  // Test case automation on chrome
        driver = new ChromeDriver();        // Instantiating as ChromeDriver
        String timeStamp = new SimpleDateFormat("yyyyMMddHHmmss").format(new java.util.Date()); // Storing current date and time as given pattern
        driver.get("https://demo.nopcommerce.com");     // Navigate the given URL and wait till page load
        driver.manage().window();   // It returns instance of option interface and returns instance of window interface
        driver.findElement(By.className("ico-register")).click();   // Uniquely identify the element within the web page and perform given action
        driver.findElement(By.id("gender-male")).click();       // It identifies the unique element by id and performs click action
        driver.findElement(By.id("FirstName")).sendKeys("Test");    // It identifies the unique element by id and fill in FirstName field with "Test"
        driver.findElement(By.id("LastName")).sendKeys("TestAuto"); // It identifies the unique element by id and fill in LastName field with "TestAuto"
        driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")).sendKeys("12"); // Identifies the unique element by xPath and selects Date of birth Day by "12"
        driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")).sendKeys("August");  // Identifies the unique element by xPath and selects Date of birth Month by "August"
        driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")).sendKeys("1990"); // Identifies the unique element by xPath and selects Date of birth Year by "1990"
        driver.findElement(By.id("Email")).sendKeys("testmaven"+timeStamp+"@maven.com");    // Identifies unique element by id and fill it with given user inputs - timeStamp is used in between so everytime we test it will be unique and accepts the data
        driver.findElement(By.name("Company")).sendKeys("ABC Company"); // Identifies unique element by name and fill in Company field with user data "ABC Company"
        driver.findElement(By.id("Password")).sendKeys("abc1234");  // Identifies the unique element by id and fill the Password field with "abc1234"
        driver.findElement(By.id("ConfirmPassword")).sendKeys("abc1234"); // Identifies the unique element by id and fill the ConfirmPassword field with "abc1234" with should be same as above
        driver.findElement(By.id("register-button")).click(); // Identifies unique element by id and click the Register button

        String message = driver.findElement(By.className("result")).getText();      // It stores the value of result in 'message' String variables
        System.out.println(message);    // It prints out stored message variables

        driver.quit();  // Closes all browser window and ends the WebDriver Session
    }

}
