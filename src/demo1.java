import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.edge.driver", "C:\\Users\\selvi\\Downloads\\edgedriver_win64\\msedgedriver.exe");	
		WebDriver driver = new EdgeDriver();
		driver.get("https://google.com");
		System.out.println(driver.getTitle());
	}

}
