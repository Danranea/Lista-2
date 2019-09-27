package listaexercicios2;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n, n1;
		int n2, n3;
		System.out.println("Digite um valor menor que 46: ");
		n = sc.nextInt();
		
		n1 = n-1;
		n2=n;
		
		while (n<46) {
			n3 = n1+n2;
			System.out.println("\n" + n3);
			n1=n2;
			n2=n3;
			n++;
		}
	}

}
