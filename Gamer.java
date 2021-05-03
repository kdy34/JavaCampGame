
public class Gamer {
	
	private int id;
	private String firstName;
	private String lastName;
	private String nickName;
	private String natinalityId;
	private int birthYear;
	
	public Gamer() {
		
	}

	public Gamer(int id, String firstName, String lastName, String nickName, String natinalityId, int birthYear) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.natinalityId = natinalityId;
		this.birthYear = birthYear;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getNatinalityId() {
		return natinalityId;
	}

	public void setNatinalityId(String natinalityId) {
		this.natinalityId = natinalityId;
	}
	
	public int getBirthYear() {
		return birthYear;
	}
	
	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}
	
	
}
