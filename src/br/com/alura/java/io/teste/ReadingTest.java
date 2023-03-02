package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class ReadingTest {

	public static void main(String[] args) throws IOException {
		
		//Input flow with file		
		InputStream fis = new FileInputStream("lorem.txt");
		Reader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		
		String line = br.readLine();
		
		while(line != null){
			System.out.println(line);
			line = br.readLine();
		}
		
		br.close();
	}

}
