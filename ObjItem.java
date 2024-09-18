package ContaBancaria;

public class ObjItem {

	public static void main(String[] args) {
		Item treco = new Item ();
		treco.setid(0);
		treco.setnome("max");
		treco.setdescricao("quebravel");
		System.out.println(treco.getid());
		System.out.println(treco.getnome());
		System.out.println(treco.getdescricao());
	

		
		
		
		Item coisa = new Item (8,"fellipe","tijolo");
		System.out.println(coisa.getid());
		System.out.println(coisa.getnome());
		System.out.println(coisa.getdescricao());


	}
	}
