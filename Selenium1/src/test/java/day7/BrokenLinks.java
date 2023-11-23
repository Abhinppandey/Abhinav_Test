package day7;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.apache.poi.util.SystemOutLogger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Base.Base;

public class BrokenLinks extends Base {

	@Test
	public void Tc1() {
		driver.get("http://amazon.in");
		List<WebElement> list = driver.findElements(By.tagName("a"));
		System.out.println(list.size());
		for (WebElement webElement : list) {
			String AllLinks = webElement.getAttribute("href");
			checkBrokenLinks(AllLinks);
		}
	}

	public static void checkBrokenLinks(String urlLink) {
		try {
			URL url = new URL(urlLink);
			HttpURLConnection httpurlConnection = (HttpURLConnection) url.openConnection();
			httpurlConnection.setConnectTimeout(200);
			httpurlConnection.connect();

			if (httpurlConnection.getResponseCode() >= 400) {
				System.out.println(urlLink + "-->" + httpurlConnection.getResponseMessage() + "link is broken");
			} else {
				System.out.println(urlLink + "-->" + httpurlConnection.getResponseMessage());
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
