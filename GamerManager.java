
public class GamerManager implements GamerService{
	
	private ValidationManager validationManager;
	
	public GamerManager(ValidationManager validationManager) {
		this.validationManager = validationManager;
	}
	

	@Override
	public void add(Gamer gamer) {
		if (this.validationManager.validate(gamer)) {
			System.out.println("Gamer has been added: " + gamer.getFirstName() + " " + "(" + gamer.getNickName() + ")" + " " + gamer.getLastName());
		}
		else {
			System.out.println("Invalid value");
		}
		
	}

	@Override
	public void remove(Gamer gamer) {
		System.out.println("Gamer has been removed: " + gamer.getFirstName() + " " + "(" + gamer.getNickName() + ")" + " " + gamer.getLastName());
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer has been updated: " + gamer.getFirstName() + " " + "(" + gamer.getNickName() + ")" + " " + gamer.getLastName());
		
	}

}
