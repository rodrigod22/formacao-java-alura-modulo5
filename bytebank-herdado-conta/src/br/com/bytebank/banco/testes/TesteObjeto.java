package br.com.bytebank.banco.testes;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteObjeto {

	public static void main(String[] args) {
		
		System.out.println("x");
		System.out.println(3);
		System.out.println(false);
		
		ContaCorrente cc = new ContaCorrente(111, 111111);
		ContaPoupanca cp = new ContaPoupanca(2222, 222222);
		Cliente cliente = new Cliente();
		
		System.out.println(cc.toString());
		System.out.println(cp);
		System.out.println(cliente);
		
		//println(cliente);
		
	}
	
	static void println(Object obj) {
		
	}

}

