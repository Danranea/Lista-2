package listaexercicios2;
import java.util.Scanner;
public class Ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int valor = 0;
		System.out.println("Digite um número: ");
		valor = sc.nextInt();
		
		for (int n=0; n <=valor; n++ ) {
			System.out.println("O conjunto de números inteiros com base no número digitado é: " + n);
			
			}
		
		if (valor==valor) {
			System.out.println("O maior valor do conjunto apresentado anteriormente é: " + valor);
		
		}
	}
	
}


