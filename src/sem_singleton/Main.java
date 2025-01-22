package sem_singleton;

public class Main {

	public static void main(String[] args) {
		Caixa caixa = new Caixa();
		
		caixa.incrementaValorAcumulado(10);
		
		System.out.println(caixa.getValorAcumulado());
		
		
		caixa.incrementaValorAcumulado(15.0);
		
		System.out.println(caixa.getValorAcumulado());
		
		caixa.incrementaValorAcumulado(20.0);
		
		System.out.println(caixa.getValorAcumulado()); // 45.0
		
		caixa = new Caixa();
		
		System.out.println(caixa.getValorAcumulado()); // 0.0
	}

}
