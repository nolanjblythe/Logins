////////////////////////////////////////////////////////////////////////////////
//
// Title:			Vanguard
// Files:			Vanguard.java
//
// Author:			Nolan J. Blythe
// Version: 		1.0
//
////////////////////////////////////////////////////////////////////////////////

package auto;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Scanner;


/**
 * Class that prompts the user for credentials and automatically
 * logs them into Vanguard.
 * 
 * @author nolan
 *
 */

public class Vanguard {

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
		
		System.out.print("What is your Vanguard username?: ");
		username = in.nextLine();
		
		System.out.print("What is your password?: ");
		password = in.nextLine();
		
		// Launch browser and enter credentials
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://investor.vanguard.com/my-account/log-on");
		driver.findElement(By.id("USER")).sendKeys(username);
		driver.findElement(By.id("PASSWORD")).sendKeys(password);
		driver.findElement(By.id("login")).click();
		driver.findElement(By.id("continueInput")).click();
		
		
		in.close();
	}

}
