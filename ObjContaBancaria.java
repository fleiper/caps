package ContaBancaria;

public class ObjContaBancaria {

	public static void main(String[] args) {
		ContaBancaria conta = new ContaBancaria(100000.00);
		//saldo inicial
		System.out.println(conta.getSaldo());
		//depósitos
		conta.depositando(4);
		conta.depositando(500);
		conta.depositando(20000);
	
		
		//saldo dps de 2 depositos
		System.out.println(conta.getSaldo());
		
		//sacando (o valor dos depositos)
		conta.sacando(20504);
		
		
		//após saque
		System.out.println(conta.getSaldo());

	}

}
