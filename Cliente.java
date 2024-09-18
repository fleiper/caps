package ContaBancaria;

public class Cliente {
	private int id;
	private String nome;
	private String tel;
	private String cpf;
	private String rg;


	public Cliente () {}


	public Cliente (int id,String nome,String tel,String cpf,String rg) {
		this.id = id;
		this.nome = nome;
		this.tel = tel;
		this.cpf = cpf;
		this.rg = rg;
	}
	public int getid () {
		return id;
	}
	public void setid(int id) {
		this.id = id;
	}
	public String getnome () {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String gettel () {
		return tel;
	}
	public void settel(String tel) {
		this.tel = tel;
	}
	public String getcpf () {
		return cpf;
	}
	public void setcpf(String cpf) {
		this.cpf = cpf;
	}
	public String getrg () {
		return rg;
	}
	public void setrg(String rg) {
		this.rg = rg;
	}
}