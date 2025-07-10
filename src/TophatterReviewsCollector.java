
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
		super.collectReviewsOf("bid", 317);
	}
	
	public void collectReviewsOfAuction(){
		collectReviewsOf("auction", 27);
	}
	
	public void collectReviewsOfBadge(){
		collectReviewsOf("badge", 1);
	}
	
	public void collectReviewsOfReward(){
		collectReviewsOf("reward", 1);
	}
	
	public void collectReviewsOfCredit(){
		collectReviewsOf("credit", 10);
	}
	
	public void collectReviewsOfWheel(){
		collectReviewsOf("wheel", 1);
	}
	
	public void collectReviewsOfReview(){
		collectReviewsOf("review", 8);
	}
	
	public void collectReviewsOfRefer(){
		collectReviewsOf("refer", 2);
	}
	public void collectReviewsOfFeedback(){
		collectReviewsOf("feedback", 4);
	}
	public void collectReviewsOfRate(){
		collectReviewsOf("rate", 16);
	}
	
	public void collectReviewsOfShare(){
		collectReviewsOf("share", 2);
	}
}
