package com_singleton;

public class CaixaSingleton {
	private double valorAcumulado;
	private static CaixaSingleton INSTANCE;
	private CaixaSingleton() {
		this.valorAcumulado = 0;
	}
	
	public void incrementaValorAcumulado(double valor) {
		valorAcumulado += valor;
	}
	
	public double getValorAcumulado() {
		return valorAcumulado;
	}
	
	public static CaixaSingleton getINSTANCE() {
		if(INSTANCE == null) {
			INSTANCE = new CaixaSingleton();
		}
		return INSTANCE;
	}

}
