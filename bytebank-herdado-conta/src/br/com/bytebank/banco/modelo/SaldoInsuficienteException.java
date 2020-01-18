package br.com.bytebank.banco.modelo;

public class SaldoInsuficienteException extends Exception{
	
	SaldoInsuficienteException(String msg) {
		super(msg);
	}

}
