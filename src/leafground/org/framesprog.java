package leafground.org;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framesprog {
	

	private void sub() {
		System.out.println("subtraction");

	}

	private void add() {
		System.out.println("addition");
	}
	

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Acer\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/frame.html");
		driver.manage().window().maximize();
		
		Thread.sleep(1000);
		driver.switchTo().frame(0);
		
		Thread.sleep(1000);
		WebElement button1 = driver.findElement(By.xpath("//button[@id='Click']"));
		button1.click();
		
		driver.switchTo().defaultContent();
		
		Thread.sleep(1000);
		WebElement text = driver.findElement(By.xpath("//h1[text()='Fun with frames']"));
		String text2 = text.getText();
		System.out.println(text2);
		
		Thread.sleep(1000);
		driver.switchTo().frame(1);
		
		driver.switchTo().frame("frame2");
		
		Thread.sleep(1000);
		WebElement button2 = driver.findElement(By.xpath("//button[@id='Click1']"));
		button2.click();
		
		
	}

}
