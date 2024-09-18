package ContaBancaria;

public class Estudante {
	private String nome;
	private double nota1;
	private double nota2;
	
	public Estudante (String nome, double nota1, double nota2) {
		this.nome = nome;
		setnota1(nota1);
		setnota2(nota2);
	}
	public String getNome() {
		return nome;
	}
	public void setnome (String nome) {
		this.nome=nome;
	}
	public double nota1() {
		return nota1;
	}
	public void setnota1 (double nota1) {
		if (nota1 >=0 && nota1 <=10) {
			this.nota1 = nota1;
		}
		else {
			System.out.println("O valor deve estar dentre 0 e 10");
		}
	}
		public double getnota2() {
			return nota2;
		}
		public void setnota2 (double nota2) {
			if (nota2 >=0 && nota2 <=10) {
				this.nota2 = nota2;
			}
			else {
				System.out.println("Nota dois inválida! o valor deve estar dentre 0 e 10");
			}
		}
		public double calcularmedia() {
			return (nota1+nota2)/2;
			
		}
		public void exibirinformacos() {
			System.out.println("estudante: "+nome+ "tem uma média de "+calcularmedia());
		}
	}

