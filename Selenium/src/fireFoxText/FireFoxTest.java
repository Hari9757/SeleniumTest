package fireFoxText;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class FireFoxTest {
    public static void main(String[] args)
    {
    	WebDriver driver = new FirefoxDriver();

        driver.get("https://aniwave.to/home");

        //driver.quit();
    }
}
