package homeworks;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseReport;

public class D15HW2 extends TestBaseReport {

    /*
        Test Case2: Negative Username Test
        Open page https://practicetestautomation.com/practice-test-login/
        Type username incorrectUser into Username field.
        Type password Password123 into Password field.
        Click Submit button.
        Verify error message is displayed.
        Verify error message text is Your username is invalid!

     */

    @Test
    public void test01(){
        driver.get("https://practicetestautomation.com/practice-test-login/");

        System.out.println("git test");
        driver.findElement(By.id("username")).sendKeys("incorrectUser");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        Assert.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'Your username is invalid!')]")).size()>0);

    }
}
