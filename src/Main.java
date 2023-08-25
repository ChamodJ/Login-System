import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		IDandPassword idnpass = new IDandPassword();
		
		LoginPage lp = new LoginPage(idnpass.getLoginInfo());

	}

}
