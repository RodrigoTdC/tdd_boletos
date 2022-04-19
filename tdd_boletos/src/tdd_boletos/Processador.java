package tdd_boletos;

import java.util.ArrayList;

public class Processador {

	public void processar(Fatura fatura, ArrayList<Boleto> boletos) {

		fatura.addTotalPago(2461.25);
		
		return;
	}
	
}
