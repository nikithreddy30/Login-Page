import java.util.HashMap;

public class IDAndPasswords {
	HashMap<String,String> logininfo = new HashMap<String,String>();
	
	public IDAndPasswords() {
		logininfo.put("Messi", "Pessi");
		logininfo.put("Grizzi", "Prizzi");
		logininfo.put("Beckham", "Peckham");
	}

	protected HashMap<String, String> getLogininfo() {
		return logininfo;
	}


	
	
}
