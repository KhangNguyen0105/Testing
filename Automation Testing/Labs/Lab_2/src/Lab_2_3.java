/*
 - Mở trang web: https://www.google.com
 - Phóng lớn (Maximize) cửa sổ windows
 - Chuyển đến trang web: https://www.facebook.com
 - Chuyển về trang trước
 - Chuyển hướng đến trang kế tiếp
 - Làm mới lại trang hiện tại
 - Đóng trình duyệt
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_2_3 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        Thread.sleep(3000);

        driver.navigate().to("https://www.facebook.com");
        Thread.sleep(3000);
        
        driver.navigate().back();
        Thread.sleep(3000);

        driver.navigate().forward();
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        driver.quit();
    }
}
