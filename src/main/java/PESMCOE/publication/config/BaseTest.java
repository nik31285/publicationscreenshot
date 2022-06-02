package PESMCOE.publication.config;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import PESMCOE.publication.keywords.UIKeywords;

public class BaseTest {
	public UIKeywords keyword=new UIKeywords();
	@BeforeMethod
	public void setup() {
		keyword.openBrowser();
	}
	@AfterMethod
	public void tearDown() {
		keyword.closeBrowser();
	}
}
