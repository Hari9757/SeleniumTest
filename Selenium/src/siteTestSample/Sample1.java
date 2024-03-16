package siteTestSample;
//import org.openqa.selenium.By;
import java.util.*;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Sample1 {
	public static void main(String[] args) {
    	WebDriver driver = new ChromeDriver();
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the Site URL");
    	String url= sc.nextLine();
    	//String url="https://naveenprojects.blogspot.com/2023/09/selenium-with-java.html";
    	driver.manage().window().maximize();
    	driver.get(url);
        String page_title = driver.getTitle();
        //driver.findElement(By.id("cookieChoiceDismiss")).click();
        //String ExpectedTitle="Java Projects: Selenium With Java";
        //if (page_title.equals(ExpectedTitle)) {
        	//System.out.println("The Test is a Pass");
        //}
        //else {
        	//System.out.println("The Test is a Fail");
        //}
        //WebElement idField= driver.findElement(By.id("one"));
        //idField.sendKeys("HaC");
       // WebElement nameField=driver.findElement(By.name("input name"));
        //nameField.sendKeys("Selenium code");
        //WebElement emailfield= driver.findElement(By.xpath("(//input[@placeholder='email'])[1]"));
        //emailfield.sendKeys("HaChaparla@gmail.com");
        System.out.println(page_title);
        //driver.quit();
	}
	}
