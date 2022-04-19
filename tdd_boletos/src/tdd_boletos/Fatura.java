package tdd_boletos;

import java.util.ArrayList;

public class Fatura {
	
	private String data;
	private double valor;
	private String nomeCliente;
	private boolean faturaPaga = true;
	private double totalPago = 0;
	
	public Fatura(String data, double valor, String nomeCliente) {
		super();
		this.data = data;
		this.valor = valor;
		this.nomeCliente = nomeCliente;
	}
	
	public double getTotalPago() {
		return this.totalPago;
	}
	
	public boolean getFaturaPaga() {
		return this.faturaPaga;
	}
	
	public void addTotalPago(double valorPago) {
		this.totalPago += valorPago;
	}
	
}