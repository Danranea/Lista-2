package listaexercicios2;
import java.util.Scanner;
public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int x=0, n, soma = 0;
		
		System.out.println("Digite um n�mero: ");
		n = sc.nextInt();
		
		while (x<n) {
			x=x+1;
			System.out.println("Os valores entre 1 e N s�o: " + x);
			
			if(x>0) {
				soma = soma + x;
				
				System.out.println("O resultado das soma dos n�meros inteiros entre 1 e N �: " + soma);
				
			}
			
			}
		}

}
