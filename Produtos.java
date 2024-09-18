package ContaBancaria;

public class Produtos {	
	private String nome;
	private double preco;

	
	public Produtos (String nome, double preco) {
		this.nome = nome;
		setpreco(preco);
	
	}
	public String getNome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getpreco() {
			return preco;
		}
	public void setpreco (double preco) {
		if (preco >= 0) {
			this.preco = preco;
		}
		else {
			System.out.println("Preço Inválido! Não pode ser negativo");
		}
	}
	public void exibirInformacoes() {
		System.out.println("produtos:"+",preço"+",preco");
	}
}

