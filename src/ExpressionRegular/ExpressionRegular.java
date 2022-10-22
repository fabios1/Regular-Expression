package ExpressionRegular;

import java.io.Console;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ExpressionRegular {
	public static void main (String[] args) {
		
		
		Scanner ler = new Scanner(System.in);
		System.out.printf("Informe a expressão:");
		String texto = ler.nextLine();
		
		
			
			String regex = "[a-zA-Zà-úÀ-Ú]{1,2}+[,]+[ ]+[0-9-0-32]{1,2}+[ ]+[d-e]{2}+[ ]+(janeiro|fevereiro|março|abril|maio|junho|julho|agosto|setembro|outubro|novembro|dezembro)C?{1}+[ ]+[d-e]{2}+[ ]+[\\d]{2,4}$";
			
			//"^\\p{L}+[\\p{L} ]+,+ +[1-30]{1,2}+ +[d-e]{2}+ +(janeiro|fevereiro|março|abril|maio|junho|julho|agosto|setembro|outubro|novembro|dezembro){1}+ +[d-e]{2}+ +\\d{2}|\\d{4}$";
			//"[a-z,A-Z,à-ú,À-Ú]{1,2}+[1-30]{1,2}+[d-e]{2}+(janeiro|fevereiro|março|abril|maio|junho|julho|agosto|setembro|outubro|novembro|dezembro){1}+[d-e]{2}+\\d{2,4}|$";
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
