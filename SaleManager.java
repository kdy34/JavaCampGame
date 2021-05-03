
public class SaleManager implements SaleService{

	@Override
	public void sell(Gamer gamer, Game game, Campaign campaign) {
		System.out.println("The game which name is " + game.getName() + " has been sold to " + gamer.getFirstName() + " with " + campaign.getName());
		
	}

	@Override
	public void withoutCampain(Gamer gamer, Game game) {
		System.out.println("The game which name is " + game.getName() + " has been sold to " + gamer.getFirstName() + " without campaign");
		
	}

}
