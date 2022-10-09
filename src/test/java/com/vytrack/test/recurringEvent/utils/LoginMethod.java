package com.vytrack.test.recurringEvent.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginMethod {

    public static void Login(WebDriver driver, String userName, String Password){

        driver.get("https://qa2.vytrack.com/user/login");
        driver.findElement(By.id("prependedInput")).sendKeys(userName);
        driver.findElement(By.id("prependedInput2")).sendKeys(Password);
        driver.findElement(By.id("_submit")).click();

    }

}
