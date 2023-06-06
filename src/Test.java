import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Duration;
import org.json.simple.JSONObject;    


public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		TophatterReviewsCollector tophatter = new TophatterReviewsCollector();
//		tophatter.collectReviewsOfBadge();
		
		EbayReviewsCollector ebay = new EbayReviewsCollector();
		ebay.collectReviewsOfBid();
		
	}

}
