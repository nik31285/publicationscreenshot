package PESMCOE.PublicationScreenShot;

import java.io.*;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.testng.annotations.Test;

public class PdfScreenShot {
	@Test(dataProvider = "pdfpathprovider",dataProviderClass = PdfDataProvider.class)
	 public void pdfScreenShot(String path,String num)throws Exception
	    {
	        // Existing PDF Document
	        // to be Loaded using file io
	        File newFile
	            = new File("D:\\1_NAAC Criteria III\\DVV WORK\\PDF all papers\\"+path);
	        PDDocument pdfDocument = PDDocument.load(newFile);
	  
	        // PDFRenderer class to be Instantiated
	        // i.e. creating it's object
	        PDFRenderer pdfRenderer
	            = new PDFRenderer(pdfDocument);
	        // Rendering an image
	        // from the PDF document
	        // using BufferedImage class
	        
	        BufferedImage img = pdfRenderer.renderImage(0);
	        // Writing the extracted
	        // image to a new file
	        ImageIO.write(
	            img, "JPEG",
	            new File("D:\\1_NAAC Criteria III\\DVV WORK\\PDF all papers\\Images\\"+num+".jpeg"));
	        // Closing the PDF document
	        pdfDocument.close();
	    }
}
