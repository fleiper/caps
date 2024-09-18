package ContaBancaria;

public class ContaBancaria {
	
	//Atributo privado
	private double saldo;
	
	
	//Construtor para inicializar o saldo
	public ContaBancaria (Double saldoInicial) {
		if (saldoInicial >= 0) {
			this.saldo = saldoInicial;
		}
		else {
			this.saldo = 0;
		}
	}
	//Getter para o saldo
	public double getSaldo() {
		return saldo;
	}
	
	public void depositando (double valor) {
		if (valor>0) {
			saldo += valor;
		}
		else {
			System.out.println("Valor de depósito inválido");
		}
	}
	public void sacando (double valor) {
		if (valor > 0 && valor <=saldo) {
			saldo -=valor;
		}
		else {
			System.out.println("SAaque inválido! Verifique o valor na conta");
		}
	}
	}
