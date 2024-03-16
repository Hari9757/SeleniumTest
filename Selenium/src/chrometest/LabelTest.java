package chrometest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class LabelTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        String url="https://www.google.co.uk/";
        driver.get(url);
        String page_title=driver.getTitle();
        System.out.println(page_title);
        driver.quit();
    }
}
