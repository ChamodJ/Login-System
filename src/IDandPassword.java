import java.util.HashMap;

public class IDandPassword {

	HashMap<String,String> loginInfo = new HashMap<String , String>();
	
	IDandPassword() {
		loginInfo.put("Chamod", "CJ123");
		loginInfo.put("ChamodJanendra", "apple123");
		loginInfo.put("ChamodPerera", "ak47");
	}
	
	protected HashMap getLoginInfo() {
		return loginInfo;
	}
}
