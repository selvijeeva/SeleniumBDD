import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\selvi\\Downloads\\chromedriver_win32\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.cleartrip.com");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div//button[contains(@class,'bn p-2 hover:bg-neutral-0 br-4')]")).click();
		driver.findElement(By.xpath("//span[contains(text(),'Australian Dollar')]")).click();
		driver.findElement(By.xpath("//div//label[1]")).click();
		driver.findElement(By.xpath("//input[contains(@class,'transparent bc-neutral-100 pr-2 pl-3')]")).sendKeys("Mel");
		Thread.sleep(2000);
		List<WebElement> options = driver.findElements(By.xpath("//div[@class='bg-white br-4 elevation-5 p-1 p-absolute mt-1 z-50 l-0']//ul//li"));
		
		for(WebElement option : options) {
			
		if(option.getText().contains("Tullamarine")) {
			
			option.click();
			System.out.println("aa");
			break;
		}
		}
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("ne");
		Thread.sleep(1000);
		List<WebElement> options1 = driver.findElements(By.xpath("//div[contains(@class,'p-absolute')]//ul//li"));
		
		for(WebElement option1 :options1) {
			
			if(option1.getText().contains("Neyveli")) {
				
				option1.click();
				break;
			}
			
		}
		
		
			
			
		}
		
		
	}

