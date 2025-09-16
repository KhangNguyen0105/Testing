import java.sql.Driver;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Lab_4_1 {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://automationexercise.com/");
        driver.manage().window().maximize();

        testRegister(driver);

        driver.quit();
    }

    public static void testRegister(WebDriver driver) {
        String expectedUrl = "https://automationexercise.com/";
        String actualUrl = driver.getCurrentUrl();

        if (!actualUrl.contains(expectedUrl)) {
            System.out.println("TC1: Failed - Invalid URL");
            return;
        }

        WebElement signup_login_btn = driver.findElement(By.xpath("//a[normalize-space()='Signup / Login']"));
        signup_login_btn.click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signup_form = wait
                .until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='signup-form']")));
        if (!signup_form.isDisplayed()) {
            System.out.println("TC1: Failed - Sign Up form is not visible");
            return;
        }

        WebElement name = driver.findElement(By.xpath("//input[@placeholder='Name']"));
        WebElement signup_email = driver.findElement(By.xpath("//input[@data-qa='signup-email']"));

        name.sendKeys("NMKhang");
        signup_email.sendKeys("ladailoc9a3@gmail.com");

        WebElement signup_btn = driver.findElement(By.xpath("//button[normalize-space()='Signup']"));
        signup_btn.click();

        WebElement info_form = driver.findElement(By.xpath("//div[@class='login-form']"));
        if (!info_form.isDisplayed()) {
            System.out.println("TC1: Failed - Enter Account Information form is not visible");
            return;
        }

        WebElement title = driver.findElement(By.xpath("//input[@id='id_gender1']"));
        title.click();

        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("ladailoc");

        WebElement day_dob = driver.findElement(By.xpath("//select[@id='days']"));
        Select daySelect = new Select(day_dob);
        daySelect.selectByValue("9");

        WebElement month_dob = driver.findElement(By.xpath("//select[@id='months']"));
        Select monthSelect = new Select(month_dob);
        monthSelect.selectByValue("9");

        WebElement year_dob = driver.findElement(By.xpath("//select[@id='years']"));
        Select yearSelect = new Select(year_dob);
        yearSelect.selectByValue("2004");
    }

}