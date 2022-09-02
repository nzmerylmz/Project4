import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumProject4_Scenario3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demowebshop.tricentis.com/");
        WebElement logIn=driver.findElement(By.linkText("Log in"));
        logIn.click();

        WebElement email=driver.findElement(By.id("Email"));
        email.sendKeys("grup1@techno.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("123456789");

        WebElement logInBtn=driver.findElement(By.cssSelector("[value='Log in']"));
        logInBtn.click();

        WebElement orderItem=driver.findElement(By.linkText("$25 Virtual Gift Card"));
        orderItem.click();

        WebElement recipientName=driver.findElement(By.cssSelector("[id=\"giftcard_2_RecipientName\"]"));
        recipientName.sendKeys("Grup1");

        WebElement recipientEmail=driver.findElement(By.cssSelector("[id=\"giftcard_2_RecipientEmail\"]"));
        recipientEmail.sendKeys("grup1new@techno.com");

        WebElement itemAddToCart=driver.findElement(By.id("add-to-cart-button-2"));
        itemAddToCart.click();

        WebElement shoppingList=driver.findElement(By.cssSelector("[id='topcartlink'] span:nth-child(1)"));
        shoppingList.click();

        WebElement agreeTermsBtn=driver.findElement(By.id("termsofservice"));
        agreeTermsBtn.click();

        WebElement checkoutBtn=driver.findElement(By.cssSelector("[id='checkout']"));
        checkoutBtn.click();

        WebElement country=driver.findElement(By.cssSelector("[id='BillingNewAddress_CountryId']"));
        Select menu=new Select(country);
        menu.selectByValue("1");

        WebElement provinceId=driver.findElement(By.cssSelector("[id='BillingNewAddress_StateProvinceId']"));
        Select menu2=new Select(provinceId);
        menu2.selectByValue("29");

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("Boston");

        WebElement address1=driver.findElement(By.id("BillingNewAddress_Address1"));
        address1.sendKeys("Boston");

        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("01234");

        WebElement phoneNumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("0123456789");

        WebElement continueBtn=driver.findElement(By.cssSelector("[id='billing-buttons-container'] input"));
        continueBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.id("paymentmethod_3")));
        WebElement continueBtn2=driver.findElement(By.cssSelector("[class='button-1 payment-method-next-step-button']"));
        continueBtn2.click();


        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='You will pay by COD']")));
        WebElement continueBtn3=driver.findElement(By.cssSelector("[class='button-1 payment-info-next-step-button']"));
        continueBtn3.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-1 confirm-order-next-step-button']")));
        WebElement confirmBtn=driver.findElement(By.cssSelector("[class='button-1 confirm-order-next-step-button']"));
        confirmBtn.click();

        wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("[class='button-2 order-completed-continue-button']")));
        WebElement orderMessage=driver.findElement(By.cssSelector("div[class='title'] strong"));
        Assert.assertTrue(orderMessage.isDisplayed());

        BekleKapat();

    }
}
