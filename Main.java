
public class Main {

	public static void main(String[] args) {
		
		
		Gamer gamer = new Gamer();
		
		gamer.setFirstName("Deniz");
		gamer.setId(1);
		gamer.setNatinalityId("12345");
		gamer.setLastName("Yazýcýoðlu");
		gamer.setNickName("kdy34");
		gamer.setBirthYear(2002);
		
		GamerManager gamerManager = new GamerManager(new ValidationManager());
		gamerManager.add(gamer);
		gamerManager.update(gamer);
		
		
		Game game = new Game();
		
		game.setGameId(2);
		game.setName("Uncharted");
		game.setPrice(234.5);
		
		GameManager gameManager = new GameManager();
		gameManager.add(game);
		gameManager.update(game);
		
		
		Campaign campaign = new Campaign();
		
		campaign.setCampaignId(3);
		campaign.setDiscount(25);
		campaign.setName("Summer discount");
		
		
		CampaignManager campaignManager = new CampaignManager();
		
		campaignManager.add(campaign);
		campaignManager.apply(campaign, game);
		
		ValidationManager validationManager = new ValidationManager();
		validationManager.validate(gamer);
		
		SaleManager saleManager = new SaleManager();
		saleManager.sell(gamer, game, campaign);
		saleManager.withoutCampain(gamer, game);
	}

}
