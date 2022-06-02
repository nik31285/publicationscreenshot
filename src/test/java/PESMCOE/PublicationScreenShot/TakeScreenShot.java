package PESMCOE.PublicationScreenShot;

import java.io.IOException;

import org.testng.annotations.Test;

import PESMCOE.publication.config.BaseTest;
import PESMCOE.publication.keywords.UIKeywords;

public class TakeScreenShot extends BaseTest {
	@Test(dataProvider = "publicationURL",dataProviderClass = PESMCOE.PublicationScreenShot.URLProvider.class)
	public void takeScreenShot(String index,String url) throws InterruptedException, IOException {
		keyword.launchURL(url);
		keyword.takeScreenShot(index);
	}
}
