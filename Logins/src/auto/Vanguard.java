package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;

public class Vanguard {

	public static void main(String[] args) {
		System.setProperty("geckodriver", "/user/bin");
		
		String username;
		String password;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your Vanguard username?: ");
		username = in.nextLine();
		
		System.out.print("What is your password?: ");
		password = in.nextLine();
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://investor.vanguard.com/my-account/log-on");
		driver.findElement(By.id("USER")).sendKeys(username);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("continueInput")).click();
		
		
		in.close();
	}

}
