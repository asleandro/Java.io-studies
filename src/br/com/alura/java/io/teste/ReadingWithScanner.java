package br.com.alura.java.io.teste;

import java.io.File;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class ReadingWithScanner {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) {
			String linha = scanner.nextLine();
//			System.out.println(linha);
									
//			String[] valores = linha.split(",");
//			System.out.println(Arrays.toString(valores));
			
			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useDelimiter(",");
			linhaScanner.useLocale(Locale.US);
			
			String valor1 = linhaScanner.next();
			int agencia = linhaScanner.nextInt();
			int numero = linhaScanner.nextInt();
			String titular = linhaScanner.next();
			double saldo = linhaScanner.nextDouble();
			
//			String valorFormatado = String.format(new Locale("pt","BR"), "%s | Ag-Conta %04d-%d | Titular: %-12s | Saldo: R$ %.2f",
//					valor1, agencia, numero, titular, saldo);
//			System.out.println(valorFormatado);
			
			System.out.format(new Locale("pt","BR"), "%s | Ag-Conta %04d-%d | Titular: %-12s | Saldo: R$ %.2f %n", 
					valor1, agencia, numero, titular, saldo);			
						
			linhaScanner.close();
			
		} 
		
		scanner.close();

	}
}
