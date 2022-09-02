import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SeleniumProject4_Scenario2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("grup1@techno.co");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456789");

        WebElement logInBtn=driver.findElement(By.cssSelector("[value='Log in']"));
        logInBtn.click();

        WebElement invalidCredentialMessage=driver.findElement(By.cssSelector("[class='validation-summary-errors']"));
        Assert.assertTrue(invalidCredentialMessage.isDisplayed());
        System.out.println(invalidCredentialMessage.getText());

        BekleKapat();
    }
}
