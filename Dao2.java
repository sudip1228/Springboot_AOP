package data;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	
	public String retrievesomething() {

		System.out.println("commited ok");
		return "Dao200";
	}
	
}
