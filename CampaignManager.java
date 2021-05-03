
public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		System.out.println("The campaign has been added: " + campaign.getName());
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println("The campaign has been deleted: " + campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println("The campaign has been updated: " + campaign.getName());
		
	}

	@Override
	public void apply(Campaign campaign, Game game) {
		
		double price1 = (game.getPrice() -((game.getPrice() * campaign.getDiscount() / 100)));
		
		System.out.println("Old price: " + game.getPrice() + " New price: " + price1);
		
		
	}
	

}
