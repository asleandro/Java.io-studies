package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadingTest {

	public static void main(String[] args) throws IOException {
		
		//Input flow with file		
		FileInputStream fis = new FileInputStream("lorem.txt"); //creating concrete flow with binary file
		InputStreamReader isr = new InputStreamReader(fis); //converting binary to char
		BufferedReader br = new BufferedReader(isr); //
		
		String line = br.readLine();
		
		System.out.println(line);
		
		br.close();
	}

}
