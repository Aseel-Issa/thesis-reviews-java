
public class SheinReviewsCollector extends ReviewsCollector{

	SheinReviewsCollector(){
		super();
		this.app = "shein.com";
	}
	
	public void collectReviewsOfPoints(){
		super.collectReviewsOf("points", 8);
	}
	
	public void collectReviewsOfRewards(){
		super.collectReviewsOf("reward", 1);
	}
	
	public void collectReviewsOfCoupons(){
		super.collectReviewsOf("coupon", 4);
	}
	
	public void collectReviewsOfWishlist(){
		super.collectReviewsOf("wishlist", 1);
	}
	
	public void collectReviewsOfFollow(){
		super.collectReviewsOf("follow", 4);
	}
	
	public void collectReviewsOfBestSeller(){
		super.collectReviewsOf("best seller", 1);
	}
	public void collectReviewsOfShare(){
		super.collectReviewsOf("share", 2);
	}
	public void collectReviewsOfRefer(){
		super.collectReviewsOf("refer", 1);
	}
	

	
}