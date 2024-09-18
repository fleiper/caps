package ContaBancaria;
import java.util.Scanner;
public class ObjEstudante {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		Estudante estudante = new Estudante ("abualani", 10,5);
		
		estudante.calcularmedia();
		estudante.exibirinformacos();
	}

}
