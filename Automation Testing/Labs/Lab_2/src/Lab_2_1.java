/*
 - Mở trang web: https://daotao.qnu.edu.vn
 - Phóng lớn (Maximize) cửa sổ windows
 - Check title của website và in kết quả
 - Đóng trình duyệt
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_2_1 {
    public static void main(String[] args) throws Exception {
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://daotao.qnu.edu.vn");
        Thread.sleep(2000);

        driver.manage().window().maximize();
        
        String title = driver.getTitle();
        System.out.println(title);

        Thread.sleep(2000);
        driver.quit();
    }
}
