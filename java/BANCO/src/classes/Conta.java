package classes;

public class Conta {

	private int numero;
	private String nomeCliente;
	private double saldo;
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public double getSaldo() {
		return saldo;
	}
	
	public Conta(int numero, String nomeCliente) {
		super();
		this.numero = numero;
		this.nomeCliente = nomeCliente;
	}
	
	public double debito(double debito) {
		
		this.saldo -= debito;
		return saldo;
	}
	
	public double credito(double credito) {
		this.saldo += credito;
		return saldo;
	}

}




