package ContaBancaria;

public class ObjEndereco {

	public static void main(String[] args) {
		Endereco local = new Endereco ();
		local.setid(0);
		local.setlogradouro("max");
		local.setnumero(99665-6962);
		local.setcomplemento("e");
		local.setbairro("d");
		local.setcidade("c");
		local.setcep("b");
		local.setuf("a");
		System.out.println(local.getid());
		System.out.println(local.getlogradouro());
		System.out.println(local.getnumero());
		System.out.println(local.getcomplemento());
		System.out.println(local.getbairro());
		System.out.println(local.getcidade());
		System.out.println(local.getcep());
		System.out.println(local.getuf());


		System.out.println("-==============================================");
		
		
		Endereco endereco = new Endereco (8,"fellipe",150478,"69-259-???-09","a","b","c","d");
		System.out.println(endereco.getid());
		System.out.println(endereco.getlogradouro());
		System.out.println(endereco.getnumero());
		System.out.println(endereco.getcomplemento());
		System.out.println(endereco.getbairro());
		System.out.println(endereco.getcidade());
		System.out.println(endereco.getcep());
		System.out.println(endereco.getuf());


	}

}
