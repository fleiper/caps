package ContaBancaria;

public class ObjAtiv {

	public static void main(String[] args) {
		
		//FORMA 1
		
		Ativ abc = new Ativ ();
		
		
		abc.setid(1);
		abc.setnome("fellipe");
		abc.setValordoaluguel(1.500);
		abc.setcorTolha("azul");
		
		System.out.println(abc.getid());
		System.out.println(abc.getnome());
		System.out.println(abc.getValordoaluguel());
		System.out.println(abc.getcorTolha());
		//==============================================
		//FORMA 2
		
		Ativ cba = new Ativ(1,"fellipe",1.500,"azul");
		System.out.println(cba.getid());
		System.out.println(cba.getnome());
		System.out.println(cba.getValordoaluguel());
		System.out.println(cba.getcorTolha());
	}

}
