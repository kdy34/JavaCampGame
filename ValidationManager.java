
public class ValidationManager implements ValidationService{

	@Override
	public boolean validate(Gamer gamer) {
		
		if (gamer.getFirstName().startsWith("D") && gamer.getId() > 0) {
			System.out.println("Your account has been validated");
			return true;
		}
		else {
			System.out.println("Your account has not been validated. Please try again.");
			return false;
		}
	}

}
