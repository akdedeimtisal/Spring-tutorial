package com.springdemoannotation;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortuneService() {
		// TODO Auto-generated method stub
		return "lucky day";
	}

}
