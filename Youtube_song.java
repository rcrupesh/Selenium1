package Assigment_3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube_song {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Rupesh\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.youtube.com/");

		driver.findElement(By.name("search_query")).sendKeys("sandeep maheshwri");
		Thread.sleep(4000);
		//driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//button[@id='search-icon-legacy']")).click();
		//driver.findElement(By.className("style-scope ytd-searchbox")).click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/SRl335wMrQU/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB1oMvIxaFfACqkyRbybI1dGBfEog']"));
		//driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/Bg8Yb9zGYyA/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLDHx9U-r_Hgh6Us0Of3ok4NNbxUxg']"));
	
		//driver.findElement(By.xpath("(//img[contains(@src,'https://i.ytimg.com/vi')])[1]")).click();
	  driver.findElement(By.xpath("//img[@src='https://i.ytimg.com/vi/SRl335wMrQU/hq720.jpg?sqp=-oaymwEcCOgCEMoBSFXyq4qpAw4IARUAAIhCGAFwAcABBg==&rs=AOn4CLB1oMvIxaFfACqkyRbybI1dGBfEog']")).click();
	}

}
