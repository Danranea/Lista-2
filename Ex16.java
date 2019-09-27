package listaexercicios2;
import java.util.Scanner;
public class Ex16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Digite um valor: ");
		n = sc.nextInt();
		
		int n1=n+10;
		
		do {
			n++;
			if (n==0) {
				System.out.println("Nulo" + " - " + n);
			}
			if (n%2==0 && n!=0) {
				System.out.println("Número Par" + " - " + n);
			}
			if (n%2!=0 && n!=0) {
				System.out.println("Número ímpar" + " - " + n);
			}
			if (n<0) {
				System.out.println("Número negativo");
			}
			if (n>0) {
				System.out.println("Número positivo");
			}
						
			
		} while ((n<=n1));

	}

}
