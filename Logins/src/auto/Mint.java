////////////////////////////////////////////////////////////////////////////////
//
// Title:			Mint
// Files:			Mint.java
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
 * logs them into Mint, a budgeting site.
 * 
 * @author nolan
 *
 */

public class Mint {
	
	/**
	 * Entry point
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		System.setProperty("geckodriver", "/user/bin");
		
		// Get credentials from the user
		
		String email;
		String password;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("What is your Mint email?: ");
		email = in.nextLine();
		
		System.out.print("What is your password?: ");
		password = in.nextLine();
		
		// Launch browser and enter in credentials
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.intuit.com/index.html?offering_id=Intuit."
				+ "ifs.mint&namespace_id=50000026&redirect_url=https%3A%2F%2Fmint"
				+ ".intuit.com%2Foverview.event%3Futm_medium%3Ddirect%26cta%3Dnav_"
				+ "login_dropdown");
		driver.findElement(By.name("Email")).sendKeys(email);
		driver.findElement(By.name("Password")).sendKeys(password);
		driver.findElement(By.name("SignIn")).click();
		
		in.close();
	}

}
