package com.vytrack.test.recurringEvent.test_executers;


import com.vytrack.test.recurringEvent.test_method_bodies.Recurring;
import com.vytrack.test.recurringEvent.utils.DataB;
import com.vytrack.test.recurringEvent.utils.LoginMethod;
import com.vytrack.test.recurringEvent.utils.WebDriverCreator;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.*;

public class RecurringCalenderEvent {
    WebDriver driver;


    @DataProvider(name = "credentials")
    public Object[][] cred(){
       return DataB.LoginCred();
    };


    @BeforeMethod
    public void setUp() {
        driver = WebDriverCreator.getDriver("chrome");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }


    @Test (dataProvider =  "credentials")
    public void testLogin1(String[] str) throws InterruptedException {
        LoginMethod.Login(driver, str[0], str[1]);
        Recurring.recurring(driver, str[0].substring(0,4));

    }
}
