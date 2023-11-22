import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trial {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\rajes\\eclipse-workspace\\CICDTrial\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().window().maximize();
		driver.get("https://www.linkedin.com");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"session_key\"]")).sendKeys("jassypdy@gmail.com");
		driver.findElement(By.xpath("//input[@name='session_password']")).sendKeys("Rags@2023");
		driver.findElement(By.xpath("//button[contains(text(),'Sign in')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//*[text()='Messaging'])[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Rajesh Murthy']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[contains(@aria-label,'Write a message')]"))
				.sendKeys("Hi, I'm looking for the opportunity. Kindly help!!");
		//driver.findElement(By.xpath("//button[text()='Send']")).click();
		Thread.sleep(3000);
		driver.close();
	}

}
