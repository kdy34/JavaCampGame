
public class Campaign {
	
	private int campaignId;
	private double discount;
	private String name;
	
	public Campaign() {
		System.out.println("The campaign code has been called.");
	}

	public Campaign(int campaignId, double discount, String name) {
		super();
		this.campaignId = campaignId;
		this.discount = discount;
		this.name = name;
	}

	public int getCampaignId() {
		return campaignId;
	}

	public void setCampaignId(int campaignId) {
		this.campaignId = campaignId;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	

}
