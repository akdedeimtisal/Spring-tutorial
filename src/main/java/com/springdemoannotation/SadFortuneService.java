package com.springdemoannotation;

import java.io.FileNotFoundException;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortuneService() throws FileNotFoundException, Exception {
		return "Today is a sad day";
	}
	

}
