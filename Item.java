package ContaBancaria;

public class Item {
	
		private int id;
		private String nome;
		private String descricao;
		
		public Item () {}


		public Item (int id,String nome,String descricao) {
			this.id = id;
			this.nome = nome;
			this.descricao = descricao;
		
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
		public String getdescricao () {
			return descricao;
		}
		public void setdescricao(String descricao) {
			this.descricao = descricao;
		}
	
}
