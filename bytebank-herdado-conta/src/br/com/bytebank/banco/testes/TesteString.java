package br.com.bytebank.banco.testes;

public class TesteString {

	public static void main(String[] args) {
		
		//String nome = new String("Alura");
		String nome = "Alura"; 
		
		nome.replace("A", "a");
		
		String testeVazio = nome.trim();
		
		//nao funcionou o replace devido a classe string ser imutavel para alterar tem que criar uma nova string
		System.out.println(nome);
		
//		char c  = nome.charAt(2);
//		System.out.println(c);
		
//		int pos = nome.indexOf("ur");
//		System.out.println(pos);
		
//		String sub = nome.substring(1);
//		System.out.println(sub);
		
//	    int tamanho = nome.length();
//	    System.out.println(tamanho);
	    

	    System.out.println(testeVazio.isEmpty());
				

	    System.out.println(nome.contains("z"));
	    
		String outra = nome.replace("A", "a");
		
		//String outra = nome.toLowerCase();
		
		System.out.println(outra);
		

	}

}
