
public class Classroom {

	public static void main(String[] args) {
		Wilder JeanClaude = new Wilder("Jean-claude", true);
		Wilder Henri = new Wilder("Henri", false);

		System.out.println(JeanClaude.whoAmI());
		System.out.println(Henri.whoAmI());
	}

}
