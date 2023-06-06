
public class TophatterReviewsCollector extends ReviewsCollector{

	TophatterReviewsCollector(){
		super();
		this.app = "tophatter.com";
	}
	
//	private String app;
	
//	private void collectReviewsOf(String searchString, int stopPoint){
//		super.collectReviewsOf(this.app, searchString, stopPoint);
//	}
	
	public void collectReviewsOfBid(){
		super.collectReviewsOf("bid", 3);
	}
	
	public void collectReviewsOfAuction(){
		collectReviewsOf("auction", 3);
	}
	
	public void collectReviewsOfBadge(){
		collectReviewsOf("badge", 1);
	}
	
	public void collectReviewsOfReward(){
		collectReviewsOf("reward", 3);
	}
}
