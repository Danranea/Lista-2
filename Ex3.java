package listaexercicios2;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor = 0;
		System.out.println("Digite um n�mero: ");
		valor = sc.nextInt();
		
		for (int n=0; n <=valor; n++ ) {
			System.out.println("O conjunto de n�meros inteiros com base no n�mero digitado �: " + n);
			
			}
		
		if (valor==valor) {
			System.out.println("O maior valor do conjunto apresentado anteriormente �: " + valor);
		
		}
	}
	
}


