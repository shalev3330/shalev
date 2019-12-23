import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class hesseExam {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get("https://www.imdb.com/");
		driver.findElement(By.id("imdbHeader-navDrawerOpen--desktop")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div[2]/nav/div[2]/aside/div/div[2]/div/div[1]/span/div/div/ul/a[4]")).click();
		Thread.sleep(2000);

		
		String movie = driver.findElement(By.xpath("//*[@id=\"main\"]/div/span/div/div/div[3]/table/tbody/tr[6]")).getText();
		
		String[] splited= movie.split("\n");
		System.out.println(splited[0]);
		
		

		
		}
	}
