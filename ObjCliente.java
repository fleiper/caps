package ContaBancaria;

public class ObjCliente {

	public static void main(String[] args) {
		Cliente cara = new Cliente ();
		cara.setid(0);
		cara.setnome("max");
		cara.settel("99665-6962");
		cara.setcpf("508.209.568-48");
		cara.setrg("69-259-???-09");
		System.out.println(cara.getid());
		System.out.println(cara.getnome());
		System.out.println(cara.gettel());
		System.out.println(cara.getcpf());
		System.out.println(cara.getrg());

		
		
		
		Cliente pessoa = new Cliente (8,"fellipe","99815-1009","150-478-408-16","69-259-???-09");
		System.out.println(pessoa.getid());
		System.out.println(pessoa.getnome());
		System.out.println(pessoa.gettel());
		System.out.println(pessoa.getcpf());
		System.out.println(pessoa.getrg());

	}

}
