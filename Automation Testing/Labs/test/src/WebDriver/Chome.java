package WebDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chome {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://practice.bpbonline.com/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement parent = driver.findElement(By.xpath("//body/div[@id='bodyWrapper']/div[@id='columnRight']/div[2]"));

        List<WebElement> links = parent.findElements(By.tagName("a"));
        for (WebElement link : links)
            System.out.println(link.);

        Thread.sleep(3000);
        driver.quit();
    }
}
