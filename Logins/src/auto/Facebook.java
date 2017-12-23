////////////////////////////////////////////////////////////////////////////////
//
// Title:			Facebook
// Files:			Facebook.java
//
// Author:			Nolan J. Blythe
// Version:			1.0
//
////////////////////////////////////////////////////////////////////////////////

package auto;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Class that prompts the user for credentials and automatically
 * logs them into Facebook.
 * 
 * @author nolan
 *
 */

public class Facebook {
	
	/**
	 * Entry point
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		// Set path for geckodriver
		
		System.setProperty("geckodriver", "/user/bin");
		
		// Get credentials from the user
		
		String username;
		String password;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your Facebook username?: ");
		username = in.nextLine();
		
		System.out.print("What is your password?: ");
		password = in.nextLine();
	
		// Launch browser and enter in credentials
		
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(username);
		driver.findElement(By.id("pass")).sendKeys(password);
		driver.findElement(By.id("loginbutton")).click();
		
		in.close();
	}

}
