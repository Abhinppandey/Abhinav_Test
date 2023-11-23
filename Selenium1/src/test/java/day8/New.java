package day8;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class New {

	@Test
	public class Before_After_Method {

		@BeforeMethod
		public void Setup() {

			System.out.println("setup");

		}

		public void Standard_user() {

			System.out.println("Standard_user");
		}

		public void lockedOut_user() {
			System.out.println("lockedOut_user");

		}

		public void problem_user() {

			System.out.println("problem_user");

		}

		public void performance_glitch_user() throws InterruptedException {

			System.out.println("performance_glitch_user");

		}

		@AfterMethod
		public void lastMethod() {

			System.out.println("close");
		}

	}

}
