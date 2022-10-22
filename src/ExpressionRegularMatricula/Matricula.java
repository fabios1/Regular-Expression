package ExpressionRegularMatricula;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Matricula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner ler = new Scanner(System.in);
			System.out.printf("Informe a expressão:");
			String texto = ler.nextLine();
		
		
			
			String regex = "[a-zA-Z]{2}+[0-9]{3}+[a-zA-Z]{1}+[0-9]{1}$";
			
			
			Pattern pattern = Pattern.compile(regex);
			Matcher matcher = pattern.matcher(texto);
		
			
			if(matcher.find()) {
				System.out.print("Expressão: "+texto+":" + " esta no formato correto!");

		    } 
			else {
				System.out.print("a expressão nao esta no formato correto"); 
			}
		

	}

}
