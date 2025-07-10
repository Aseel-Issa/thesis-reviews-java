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
		
		EbayReviewsCollector ebay = new EbayReviewsCollector();
//		ebay.collectReviewsOfBid();
//		ebay.collectReviewsOfAuction();
//		ebay.collectReviewsOfRating();
//		ebay.collectReviewsOffFeedback();
//		ebay.collectReviewsOffOffer();
//		ebay.collectReviewsOffTopRated();
//		ebay.collectReviewsOffPowerSeller();
//		ebay.collectReviewsOffPowerBucks();
		
		TophatterReviewsCollector tophatter = new TophatterReviewsCollector();
//		tophatter.collectReviewsOfBid();
//		tophatter.collectReviewsOfAuction();
//		tophatter.collectReviewsOfBadge();
//		tophatter.collectReviewsOfCredit();
//		tophatter.collectReviewsOfReward();
//		tophatter.collectReviewsOfBadge();
//		tophatter.collectReviewsOfWheel();
//		tophatter.collectReviewsOfReview();
//		tophatter.collectReviewsOfRefer();
//		tophatter.collectReviewsOfFeedback();
//		tophatter.collectReviewsOfRate();
//		tophatter.collectReviewsOfShare();
		
		WishReviewsCollector wish = new WishReviewsCollector();
//		wish.collectReviewsOfPoints();
//		wish.collectReviewsOfReward();
//		wish.collectReviewsOfWheel();
//		wish.collectReviewsOfBlitzBuy();
//		wish.collectReviewsOfRefferal();
//		wish.collectReviewsOfWishlist();
//		wish.collectReviewsOfFollow();
//		wish.collectReviewsOfDeal();
//		wish.collectReviewsOfRefer();
//		wish.collectReviewsOfRate();
//		wish.collectReviewsOfFeedback();
		
		SheinReviewsCollector shein = new SheinReviewsCollector();
//		shein.collectReviewsOfPoints();
//		shein.collectReviewsOfRewards();
//		shein.collectReviewsOfCoupons();
//		shein.collectReviewsOfWishlist();
//		shein.collectReviewsOfFollow();
//		shein.collectReviewsOfBestSeller();
//		shein.collectReviewsOfShare();
//		shein.collectReviewsOfRefer();

	}

}
