/*
 - Mở trang web: https://www.google.com
 - Phóng lớn (Maximize) cửa sổ windows
 - Check title của website là Google
 - Check trang web hiện tại có phải là google.co.in
 - Lấy nguồn trang (mã nguồn HTML) và độ dài nguồn trang
 - Đóng trình duyệt
*/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lab_2_2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");
        Thread.sleep(1000);

        driver.manage().window().maximize();

        String title = driver.getTitle();
        if (title.toLowerCase().equals("google")) {
            System.out.print("TC1: Pass" + "  |  ");
        } else {
            System.out.print("TC1: Fail" + "  |  ");
        }
        System.out.println("Expected: google  |  Actual: " + title.toLowerCase());

        String url = driver.getCurrentUrl();
        if (url.contains("google.co.in")) {
            System.out.print("TC2: Pass" + "  |  ");
        } else {
            System.out.print("TC2: Fail" + "  |  ");
        }
        System.out.println("Expected: google.co.in  |  Actual: " + url);

        String src = driver.getPageSource();
        int src_length = src.length();
        System.out.println("Source length: " + src_length);

        Thread.sleep(1000);
        driver.quit();
    }
}
