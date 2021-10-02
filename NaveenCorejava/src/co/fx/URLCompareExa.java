package co.fx;

import java.net.MalformedURLException;
import java.net.URL;

public class URLCompareExa {
	/**
	 * What will be output when you compre site URL with its ip address*/
	public static void main(String[] args) {
		
		try {
			System.out.println(new URL("https://www.hubspot.com").equals(new URL("https://199.60.103.226")));
			System.out.println(new URL("https://www.youtube.com").equals(new URL("https://142.250.179.142")));
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
	}

}
