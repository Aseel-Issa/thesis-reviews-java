
public class EbayReviewsCollector extends ReviewsCollector{

	EbayReviewsCollector(){
		super();
		this.app = "ebay.com";
	}
	
	public void collectReviewsOfBid(){
		super.collectReviewsOf("bid", 6);
	}

}
