package example;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class App {

	public static void main(String[] args) {
		Config config = ConfigFactory.load();
		System.out.println(config.getString("word1"));
	}

}
