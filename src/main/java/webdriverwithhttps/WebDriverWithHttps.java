package webdriverwithhttps;


import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import com.gargoylesoftware.htmlunit.WebClient;


public class WebDriverWithHttps {

	public static WebDriver getTestContent(String relativeTestUrl) throws MalformedURLException {
		   String url = relativeTestUrl;
		   DesiredCapabilities capability = DesiredCapabilities.htmlUnit();
		   capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		   capability.setCapability("setAcceptUntrustedCertificates",true);
		   capability.setCapability("setAssumeUntrustedCertificateIssuer", false);
		   WebDriver driver = new HtmlUnitDriver() {
			   protected WebClient modifyWebClient(final WebClient client) {
			     client.getOptions().setUseInsecureSSL(true);
			     client.getOptions().setSSLInsecureProtocol("TLSv1");
			     return client;
			   }
			};
	      System.out.println("************** " + url + " **************");
	      driver.get(url);
	      return driver;
	   }	
	public static void main(String[] args) throws MalformedURLException {
		 String url="https://www.webres.stratus.qa.ebay.com/WebResTest/tests/run?class=secureTest.jsp";
		 getTestContent(url);
	}

}
