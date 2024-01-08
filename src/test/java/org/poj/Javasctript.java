package org.poj;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Javasctript {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\subithra\\eclipse-workspace\\Action\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://toolsqa.com/");

		driver.manage().window().maximize();

		// step1
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement scrldwn = driver.findElement(By.xpath("//div[contains(text(),'Find')]"));

		js.executeScript("arguments[0].scrollIntoView(true)", scrldwn);

		Thread.sleep(5000);
		WebElement scrlup = driver.findElement(By.xpath("//div[text()='Selenium Online Trainings']"));

		js.executeScript("arguments[0].scrollIntoView(true)", scrlup);

	}

}
