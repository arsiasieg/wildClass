
public class Wilder {
	String firstname;
	boolean aware;
	
	public Wilder (String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	
	//getters
	public String getFirstname() {
		return this.firstname;
	}
	
	public boolean isAware() {
		return this.aware;
	}
	
	//setters
	public String setFirstname(String firstname) {
		return this.firstname = firstname;
	}
	
	public boolean setAware(boolean aware) {
		return this.aware = aware;
	}
	
	//instance method
	public String whoAmI() {
		if(this.aware) {
			return "Je m'appelle " + this.getFirstname() + " et je suis aware !";
		} else {
			return "Je m'appelle " + this.getFirstname() + " et je ne suis pas aware...";
		}
	}
	
	

}
