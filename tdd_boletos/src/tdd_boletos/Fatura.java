package tdd_boletos;

import java.util.ArrayList;

public class Fatura {
	
	private String data;
	private double valor;
	private String nomeCliente;
	private boolean faturaPaga = false;
	private ArrayList<Pagamento> pagamentos;
	private double totalPago = 0;
	
	public Fatura(String data, double valor, String nomeCliente) {
		super();
		this.data = data;
		this.valor = valor;
		this.nomeCliente = nomeCliente;
		pagamentos = new ArrayList<Pagamento>();
	}
	
	public double getTotalPago() {
		return this.totalPago;
	}
	
	public boolean getFaturaPaga() {
		return this.faturaPaga;
	}
	
	public double getValor() {
		return this.valor;
	}
	
	public void addTotalPago(double valorPago) {
		this.totalPago += valorPago;
	}
	
	public void addPagamentos(ArrayList<Pagamento> novosPagamentos) {
		pagamentos.addAll(novosPagamentos);
	}
	
	public void setFaturaPaga() {
		this.faturaPaga = true;
	}
}
