package sem_singleton;

public class Caixa {
	private double valorAcumulado;
	
	public Caixa() {
		this.valorAcumulado = 0;
	}
	
	public void incrementaValorAcumulado(double valor) {
		valorAcumulado += valor;
	}
	
	public double getValorAcumulado() {
		return valorAcumulado;
	}
}
