package Selenium_pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Calculator {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();

		// Multiplication
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();

		// Division
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[4]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[3]/div/table/tbody/tr/td[1]/table/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();

		// Addition
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[5]")).click();

		// Subtraction
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[4]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[4]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[2]/span[1]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[1]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[2]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[3]/span[3]")).click();
		driver.findElement(By.xpath("//*[@id='sciout']/tbody/tr[2]/td[2]/div/div[5]/span[4]")).click();
		Thread.sleep(3000);

		driver.quit();
		
	}

}
