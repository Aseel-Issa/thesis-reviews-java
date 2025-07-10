
public class EbayReviewsCollector extends ReviewsCollector{

	EbayReviewsCollector(){
		super();
		this.app = "ebay.com";
	}
	
	public void collectReviewsOfBid(){
		super.collectReviewsOf("bid", 6);
	}
	
	public void collectReviewsOfAuction(){
		super.collectReviewsOf("auction", 6);
	}
	
	public void collectReviewsOfRating(){
		super.collectReviewsOf("rate", 9);
	}
	
	public void collectReviewsOffFeedback(){
		super.collectReviewsOf("feedback", 13);
	}
	
	public void collectReviewsOffOffer(){
		super.collectReviewsOf("offer", 9);
	}
	
	public void collectReviewsOffTopRated(){
		super.collectReviewsOf("top rated", 0);
	}
	
	public void collectReviewsOffPowerSeller(){
		super.collectReviewsOf("power seller", 1);
	}
	
	public void collectReviewsOffPowerBucks(){
		super.collectReviewsOf("bucks", 3);
	}

}
