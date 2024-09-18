package ContaBancaria;

import java.security.PublicKey;

//privado
public class Ativ {
	private int id;
	private String nome;
	private double Valordoaluguel;
	private String corTolha;

	public Ativ () {}
	
	public Ativ (int id, String nome, double Valordoaluguel, String corTolha) {
		this.id = id;
		this.nome = nome;
		this.Valordoaluguel = Valordoaluguel;
		this.corTolha = corTolha;
	}
	public int getid () {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public double getValordoaluguel(){
		return Valordoaluguel;
	}
	public void setValordoaluguel (double Valordoaluguel) {
		this.Valordoaluguel = Valordoaluguel;
	}
	public String getcorTolha() {
		return corTolha;
	}
	public void setcorTolha(String corTolha) {
		this.corTolha = corTolha;
	}
}