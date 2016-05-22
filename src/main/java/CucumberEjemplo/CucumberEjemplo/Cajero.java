package CucumberEjemplo.CucumberEjemplo;

public class Cajero {
	
	private int saldo;
	
	public Cajero(){
		saldo = 0;
	}

	public void saldoInicial(int saldo) {
		this.saldo = saldo;
	}

	public void descontar(int saldoADescontar) {
		this.saldo = this.saldo - saldoADescontar;	
	}
	
	public boolean estaVacio(){
		return this.saldo <=0;
	}

}
