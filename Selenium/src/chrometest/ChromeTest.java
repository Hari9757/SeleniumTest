package chrometest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class ChromeTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();

        driver.get("https://aniwave.to/home");

        //driver.quit();
    }
}
