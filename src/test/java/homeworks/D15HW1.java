package homeworks;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBaseReport;

public class D15HW1 extends TestBaseReport {

    /*
Test Case1: Positive Login Test
Open page https://practicetestautomation.com/practice-test-login/
Type username student into Username field
Type password Password123 into Password field
Click Submit button.
Verify new page URL contains practicetestautomation.com/logged-in-successfully/
Verify new page contains expected text ('Congratulations' or 'successfully logged in')
Verify button Log out is displayed on the new page.
*/

    @Test
    public void test01(){
        driver.get("https://practicetestautomation.com/practice-test-login/");

        driver.findElement(By.id("username")).sendKeys("student");
        driver.findElement(By.id("password")).sendKeys("Password123");
        driver.findElement(By.id("submit")).click();

        SoftAssert sa = new SoftAssert();

        sa.assertTrue(driver.getCurrentUrl().contains("practicetestautomation.com/logged-in-successfully/"));
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'Congratulations')]")).size()>0);
        sa.assertTrue(driver.findElements(By.xpath("//*[contains(text(),'successfully logged in')]")).size()>0);
        sa.assertTrue(driver.findElements(By.xpath("//a[contains(text(), 'Log out')]")).size()>0);

        sa.assertAll();

    }
}
