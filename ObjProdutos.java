package ContaBancaria;

public class ObjProdutos {

	public static void main(String[] args) {
		Produtos prod = new Produtos ("	Queijo Prato", 50.00);

		System.out.println(prod.getNome()+ " "+ prod.getpreco());
		prod.setpreco(53);
		System.out.println(prod.getpreco());

		prod.setpreco(3);
		System.out.println(prod.getpreco());
		
		prod.setnome("Queijo Parmessão");
		prod.setpreco(80);
		System.out.println(prod.getNome());
		System.out.println(prod.getpreco());
	}

}
