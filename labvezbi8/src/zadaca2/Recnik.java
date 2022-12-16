package zadaca2;

import java.util.Map;
import java.util.HashMap;

public class Recnik {
	
	Map<String,String> recnik = new HashMap<String,String>();
		
	public void VnesiZbor() {
		recnik.put("where", "kade");
		recnik.put("how", "kako");
		recnik.put("when", "koga");
		recnik.put("who", "koj");
		recnik.put("what", "shto");
		
	}
	
	public void Translate(String s) {
		
		if(recnik.containsKey(s)) {
			System.out.println(recnik.get(s));
	}
		else 
		{
			System.out.println("Takov zbor ne postoi");
		}
		
	}

}
