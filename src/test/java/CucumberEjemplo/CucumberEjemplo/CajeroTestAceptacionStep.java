package CucumberEjemplo.CucumberEjemplo;

import static org.junit.Assert.*;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
 
public class CajeroTestAceptacionStep {

	Cajero cajero = new Cajero();
			
	//Cuando hay un cajero con $10
	@Given("^Cuando hay un cajero con \\$(\\d+)$")
	public void setSaldoInicial(final int saldo) {
		cajero.saldoInicial(saldo);
	}
	//saco $10
	@When("^saco \\$(\\d+)$")
	public void restarSaldo(final int saldoADescontar) {
		cajero.descontar(saldoADescontar);
	}
	//el cajero queda vacio
	@Then("el cajero queda vacio")
	public void verificarMonto() {
		assertTrue(cajero.estaVacio());
	}


}
