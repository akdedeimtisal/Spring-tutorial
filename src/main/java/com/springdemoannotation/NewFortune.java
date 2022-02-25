package com.springdemoannotation;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;


@Component
public class NewFortune implements FortuneService{

	ArrayList<String> data = new ArrayList<>();
	
	@PostConstruct
	public void postConstructMethod() throws FileNotFoundException {
		
		File file = new File("C:\\Users\\ASUS\\Desktop\\fortune.txt");
	    Scanner sc = new Scanner(file);
	    int i = 0;
	    while (sc.hasNextLine()) {
	    	
	     data.add(sc.nextLine());
	
	      
	    }
	}

	@Override
	public String getFortuneService() throws Exception {
		// TODO Auto-generated method stub
	
		Random random = new Random();
		int index = random.nextInt(data.size());
		String theFortune = data.get(index);
		
		return theFortune;
	
	}

}
