package tdd_boletos;

import java.util.ArrayList;

public class Processador {

	public void processar(Fatura fatura, ArrayList<Boleto> boletos) {
		double valorTotal = 0;
		ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();
		
		for (Boleto boleto : boletos) {
			double valorBoleto = boleto.getValor();
			valorTotal += valorBoleto;
			pagamentos.add (new Pagamento(valorBoleto, boleto.getData(), "BOLETO"));
		}
		
		if (fatura.getValor() - fatura.getTotalPago() <= valorTotal) {
			fatura.setFaturaPaga();
		}
		
		fatura.addPagamentos(pagamentos);
		fatura.addTotalPago(valorTotal);
		
		return;
	}
	
}
