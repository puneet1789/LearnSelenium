package mypackage;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Login {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Hello World");

		FirefoxDriver FF = new FirefoxDriver();
	
		FF.get("http://www.google.com");	
		Thread.sleep(5000);
		
	}
}