package siteTestSample;
import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample1 {
	public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Site URL");
    	String url= sc.next();
    	//String url="https://naveenprojects.blogspot.com/2023/09/selenium-with-java.html";
    	driver.manage().window().maximize();
    	driver.get(url);
        String page_title = driver.getTitle();
        WebElement id= driver.findElement(By.id("one"));
        id.sendKeys("HaC");
        WebElement name=driver.findElement(By.name("input name"));
        name.sendKeys("Selenium code");
        System.out.println(page_title);
        //driver.quit();
	}
	}
