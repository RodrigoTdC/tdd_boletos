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
		listaDeBoletos.add(b1);
		listaDeBoletos.add(b2);
		listaDeBoletos.add(b3);
		
		Fatura f1 = new Fatura("22/08/2022", 2406.00, "Henzo Matias Caldeira");
		
		processador.processar(f1, listaDeBoletos);
		
		Assertions.assertTrue(f1.getFaturaPaga());
		Assertions.assertEquals(2461.25, f1.getTotalPago());
		
		listaDeBoletos.remove(0);
		
		Fatura f2 = new Fatura("24/08/2022", 2406.00, "Lina Conde Maranhão");
		processador.processar(f2, listaDeBoletos);
		
		Assertions.assertTrue(f2.getFaturaPaga());
		Assertions.assertEquals(880.50, f2.getTotalPago());
	}
	
}
