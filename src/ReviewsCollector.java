import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONObject;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReviewsCollector {
	ReviewsCollector(){
		
	}
	
	protected String app;
	
	protected void collectReviewsOf(String searchString, int stopPoint){
		this.collectReviewsOf(this.app, searchString, stopPoint);
	}
	
	protected void collectReviewsOf(String app, String searchString, int stopPoint){
//		System.setProperty("webdriver.chrome.driver", "/Applications/chromedriver");
		System.setProperty("webdriver.chrome.driver", "/Users/aseel/Downloads/chromedriver-mac-x64 2/chromedriver");
		WebDriver driver = new ChromeDriver();
		try {
			
			String site = "https://www.sitejabber.com/reviews/";

			driver.get(site+app);
			Duration duration = Duration.ofSeconds(5);
			driver.manage().timeouts().implicitlyWait(duration);

			// Get search box element from webElement 'q' using Find Element
//			WebElement searchBox = driver.findElement(By.id("search"));
			WebElement searchBox = driver.findElement(By.xpath("//input[@placeholder='Search reviews']"));
			
			searchBox.sendKeys(searchString);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			searchBox.sendKeys(Keys.RETURN);
//		int stopPoint = 3;
			
			// first time waits until the search is done, next waits until the content is refreshed
			int pageCount = 0;
			WebDriverWait myWaitVar = new WebDriverWait(driver, Duration.ofSeconds(30));
			boolean popup = true;
			try {
				String fileName = (app.split("\\."))[0] + "-" + searchString + ".json";
				PrintWriter out = new PrintWriter(fileName);
				out.println("{ \"app\": \""+app+"\", \"search-string\": \""+searchString+"\", \"allReviews\": [");
				boolean isNext;
				do{
					System.out.println(pageCount);
			        if (pageCount == 0) {
			        	try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
			            // waits until the cancel icon appears which is an indication that the search is done
//			            driver.findElement(By.className("custom-icon-cancel"));
			            System.out.println("search is done!");
			        } else {
			        	Thread.sleep(5000);
			            // waits until the div is refreshed
			        	myWaitVar.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Search reviews']")));
			        	// if corona virus popup appears
//			        	try {
//							if(popup){
//								myWaitVar.until(ExpectedConditions.presenceOfElementLocated(By.className("ad-popup__widget__title_close")));
//								driver.findElement(By.className("ad-popup__widget__title_close")).click();
//								popup = false;
//							}
//						} catch (Exception e) {
//							// TODO Auto-generated catch block
//							System.out.println("pop-up didn't appear");
//						}
			        }
			     // get all the reviews elements
			       
//			        List<WebElement> reviews = driver.findElements(By.className("review__text"));
			        List<WebElement> reviews = driver.findElements(By.cssSelector("div.text-sub-main-light p.break-words"));
			        // get all the reviews titles elements
//			        List<WebElement> titles = driver.findElements(By.xpath("//span[@class='review__title__text']"));
			        List<WebElement> titles = driver.findElements(By.cssSelector("div.space-y-4 div.relative a.title.relative"));
			        List<JSONObject> reviewsText = new ArrayList<JSONObject>();
			        
			        Iterator<WebElement> iter = reviews.iterator();
			        Iterator<WebElement> iter2 = titles.iterator();
			        while(iter.hasNext()){
			        	JSONObject obj = new JSONObject();
			        	// Concatenate the review's title with the review's text and add it to the reviewsText arraylist
			        	obj.put("review", iter2.next().getText()+" "+iter.next().getText());
			        	reviewsText.add(obj);}
			        
			        JSONObject chunk = new JSONObject();
			        chunk.put("chunk-number", pageCount);
			        chunk.put("reviews", reviewsText);
//			        System.out.println(chunk);
			        // add , after each json object "chunk" except for the last one and write it into the json file
//			        if(pageCount!=stopPoint)
//			        	out.println(chunk.toString()+","); //.toString()
//			        else
//			        	out.println(chunk.toString());
			        // Let webdriver click on the next button to load the next page
			        try{
			        	WebElement next = driver.findElement(By.cssSelector("[aria-label='Page navigation']"));
						JavascriptExecutor js = (JavascriptExecutor) driver;
						js.executeScript("arguments[0].scrollIntoView();", next);
						try {
							Thread.sleep(5000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						js.executeScript("document.querySelector('[aria-label=\"Go to next page\"]').click();");
						Thread.sleep(5000);
						// add , after each json object "chunk" except for the last one and write it into the json file
				        if(pageCount!=stopPoint)
				        	out.println(chunk.toString()+","); //.toString()
				        else
				        	out.println(chunk.toString());
						pageCount++;
						
// maybe we can check from the beginning when pageCount>0						driver.findElement(By.className("pagination__button--enabled"));
						isNext = true;
					}catch(org.openqa.selenium.JavascriptException e){
						//org.openqa.selenium.NoSuchElementException
//						e.printStackTrace();
						out.println(chunk.toString());
						isNext = false;
					}catch(NoSuchElementException e) {
						out.println(chunk.toString());
						isNext = false;
					}
					// loop until there is no more pages or the stop point is reached
			}while(isNext && pageCount<=stopPoint);
				out.println("]}");
				out.close();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.quit();
		} finally{
			driver.quit();
		}
	}
}
