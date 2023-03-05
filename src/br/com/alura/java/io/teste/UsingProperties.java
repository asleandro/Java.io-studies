package br.com.alura.java.io.teste;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class UsingProperties {

	public static void main(String[] args) throws IOException {
		Properties props = new Properties();
		props.setProperty("login", "Leandro");
		props.setProperty("password", "superpass");
		props.setProperty("adress", "www.leandro.com");
		
		props.store(new FileWriter("conf.properties"), "comment");
		
		//Para ler esse arquivo de properties, basta usar o método load
		props.load(new FileReader("conf.properties"));
		
		String login = props.getProperty("login");
		String password = props.getProperty("password");
		String adress = props.getProperty("adress");
		
		System.out.format("Login: %s%nPassword: %s%nAdress: %s", login, password, adress);
		
		//Repare que, uma vez lido o arquivo, podemos usar o método getProperty(key),
		//da classe Properties, para recuperar o seu valor.

	}

}
