
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ASUS\\Downloads\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("http://sanbox.undostres.com.mx");
		driver.findElement(By.name("mobile")).sendKeys("8465433546");
		driver.findElement(By.className("action")).click();
		driver.findElement(By.linkText("Telcel")).click();
		driver.findElement(By.className("data-value")).click();
		driver.findElement(By.className("button")).click();
		driver.findElement(By.linkText("Tarjeta")).click();
		driver.findElement(By.className("radio-custom-label")).click();
		driver.findElement(By.className("radio-custom-label")).click();
		driver.findElement(By.linkText("Usar nueva tarjeta")).click();
		Thread.sleep(200);
		driver.findElement(By.linkText("Usar nueva tarjeta")).click();
		driver.findElement(By.id("cardnumberunique")).sendKeys("4111111111111111");
		driver.findElement(By.cssSelector("input[placeholder='Mes']")).sendKeys("11");
		driver.findElement(By.xpath("(//input[@name='expyear'])[2]")).sendKeys("25");
		driver.findElement(By.xpath("(//input[@name='cvvno'])[2]")).sendKeys("111");
		driver.findElement(By.xpath("(//input[@name='txtEmail'])[1]")).sendKeys("test@test.com");
		driver.findElement(By.xpath("(//button[@name='formsubmit'])[3]")).click();
		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("automationexcersise@test.com");
		driver.findElement(By.id("psw")).sendKeys("123456");
		
		Thread.sleep(5000);
		
		WebElement frame=driver.findElement(By.xpath("(//iframe[@title='reCAPTCHA'])[1]"));
	   
	    driver.switchTo().frame(frame);
		driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border']")).click();

		Thread.sleep(10000);
		driver.switchTo().parentFrame();
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		driver.findElement(By.xpath("(//button[@type='submit']")).click();
		driver.findElement(By.xpath("(//input[@class='confirmButton']")).click();
		driver.findElement(By.xpath("((//button[@name='formsubmit'])[1]")).click();
		driver.findElement(By.xpath("((//button[@id='wzrk-confirm']")).click();
		
	}

}

