package tdd_boletos;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProcessadorTest {
	
	@Test
	public void testFaturaPaga() {
		
		Processador processador = new Processador();
		
		Boleto b1 = new Boleto(512863, "03/08/2022", 1580.75);
		Boleto b2 = new Boleto(684661, "14/08/2022", 300.00);
		Boleto b3 = new Boleto(679125, "19/08/2022", 580.50);
		
		ArrayList<Boleto> listaDeBoletos = new ArrayList<Boleto>();
		
		Fatura f1 = new Fatura("22/08/2022", 2406.00, "Henzo Matias Caldeira");
		
		processador.processar(f1, listaDeBoletos);
		
		Assertions.assertEquals(true, f1.getFaturaPaga());
	}
	
}
