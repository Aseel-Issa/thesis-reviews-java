
public class WishReviewsCollector extends ReviewsCollector{

	WishReviewsCollector(){
		super();
		this.app = "wish.com";
	}
	
	public void collectReviewsOfPoints(){
		super.collectReviewsOf("points", 5);
	}
	
	public void collectReviewsOfReward(){
		super.collectReviewsOf("reward", 1);
	}
	
	public void collectReviewsOfWheel(){
		super.collectReviewsOf("wheel", 1);
	}
	
	public void collectReviewsOfBlitzBuy(){
		super.collectReviewsOf("blitz buy", 1);
	}
	
	public void collectReviewsOfRefferal(){
		super.collectReviewsOf("refferal", 1);
	}
	
	public void collectReviewsOfWishlist(){
		super.collectReviewsOf("wishlist", 1);
	}
	
	public void collectReviewsOfFollow(){
		super.collectReviewsOf("follow", 5);
	}
	
	public void collectReviewsOfDeal(){
		super.collectReviewsOf("deal", 17);
	}
	
	public void collectReviewsOfRefer(){
		super.collectReviewsOf("refer", 4);
	}
	
	public void collectReviewsOfRate(){
		super.collectReviewsOf("rate", 16);
	}
	
	public void collectReviewsOfFeedback(){
		super.collectReviewsOf("feedback", 3);
	}
	

	
}
