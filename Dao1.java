package data;

import org.springframework.stereotype.Repository;

import aop.TrackTime;

@Repository
public class Dao1 {

	@TrackTime//this annotation is made by ourself.see TrackTime class which defines this annotation for further details.
	public String retrievesomething() {
		
		return "Dao1";
	}
	
}
