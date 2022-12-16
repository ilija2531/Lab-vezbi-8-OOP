package zadaca2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Glavna {

	public static void main(String[] args) {
		try
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String s = br.readLine();
			
			Recnik r = new Recnik();
			r.VnesiZbor();
			r.Translate(s);
		}
		
		catch (IOException e) {
			System.out.println(e.toString());
		}

	}

}
