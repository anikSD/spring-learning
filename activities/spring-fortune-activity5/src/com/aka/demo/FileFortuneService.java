package com.aka.demo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private String filePath = "D:\\Work_Project\\_self\\projects\\java\\self-projects\\spring-learning\\activities\\spring-fortune-activity5\\src\\data.txt";
	private List<String> data;
	private Random random = new Random();
	private BufferedReader buffer;
	private FileReader fileReader;
	
	public FileFortuneService() {
		System.out.println(">> Cosntroctor:-> constructor bean");
	}
	
	@PostConstruct
	private void initBean() {
		try {
			System.out.println(">> initBean called:-> Initializing bean");
			this.data = new ArrayList<>();
			File file = new File(filePath);
			fileReader = new FileReader(file);
			buffer = new BufferedReader(fileReader);
			String line = "";
			while((line = buffer.readLine()) != null) {
				this.data.add(line);
			}
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@PreDestroy
	private void destroyBean() {
		System.out.println(">> destroyBean called:-> Desctroying bean");
		try {
			if(buffer != null) buffer.close();
			if(fileReader != null) fileReader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		String theFortune = "No Fortune";
		System.out.println(this.data.size() + " size of the data");
		int index = random.nextInt(this.data.size());
		theFortune = this.data.get(index);
		return theFortune;
	}

}
