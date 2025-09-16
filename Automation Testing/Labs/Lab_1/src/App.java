import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class App {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();

        driver.get("http://google.com");
        Thread.sleep(5000);

        driver.get("http://practice.bpbonline.com");
        Thread.sleep(5000);

        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_locators.htm");;
        Thread.sleep(5000);
        
        driver.get("http://automationexercise.com/");
        Thread.sleep(5000);

        driver.get("https://opensource-demo.orangehrmlive.com/");
        Thread.sleep(5000);

        driver.quit();
    }
}
