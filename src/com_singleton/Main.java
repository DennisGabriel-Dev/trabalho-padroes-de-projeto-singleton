package com_singleton;

public class Main {
	public static void main(String[] args) {
		CaixaSingleton caixa = CaixaSingleton.getINSTANCE();
		
		caixa.incrementaValorAcumulado(10.0);
		System.out.println(caixa.getValorAcumulado());
		
		caixa.incrementaValorAcumulado(15.0);
		System.out.println(caixa.getValorAcumulado());
		
		caixa.incrementaValorAcumulado(20.0);
		System.out.println(caixa.getValorAcumulado()); //45.0
		
		caixa = CaixaSingleton.getINSTANCE();
		System.out.println(caixa.getValorAcumulado()); // continua sendo 45.0
	}
}
