package com.vytrack.test.recurringEvent.test_method_bodies;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class Recurring {

    public static void recurring(WebDriver driver) throws InterruptedException {

        driver.findElement(By.xpath("//a//span[contains(text(),'Activities')]")).click();
        driver.findElement(By.xpath("(//span[contains(text(),'Calendar Events')])")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@title='Create Calendar event']")).click();

        driver.findElement(By.xpath("//input[@data-name='recurrence-repeat']")).click();
        WebElement daysBox = driver.findElement(By.xpath("//span[.='day(s)']/..//input[3]"));
        String daysBoxValue = daysBox.getAttribute("value");
        Assert.assertEquals(daysBoxValue,"1", "did not match");
        daysBox.clear();
        String warningMess = driver.findElement(By.xpath("//*[text()='This value should not be blank.']")).getText();
        String expectedWarningMess = "This value should not be blank.";
        Assert.assertEquals(warningMess, expectedWarningMess);
    }
}
