package listaexercicios2;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double saldoinicial, dep�sito, saque, sair, saldofinal = 0;
		double opera��o;
		
		System.out.print("Digite o saldo inicial da Conta: ");
		saldoinicial = sc.nextDouble();
		
			
		do {
									
			System.out.print("Digite 1 para dep�sito, 2 para saque e 3 para encerramento: ");
			opera��o = sc.nextDouble();
			
			if (opera��o == 1) {
				
				System.out.print("Digite o valor para dep�sito: ");
				dep�sito = sc.nextDouble();
				saldoinicial = saldoinicial+dep�sito;
				saldofinal = saldoinicial;
			}
			if (opera��o == 2) {
				
				System.out.println("Digite o valor do saque: ");
				saque = sc.nextDouble();
				saldoinicial = saldoinicial-saque;
			}   saldofinal = saldoinicial;
			if (opera��o == 3) {
				
				System.out.println("Opera��o encerrada");
			}
		
		} while (!(opera��o==3));
		
		if (saldofinal>0) {
			System.out.println("Conta preferencial - seu saldo � de: " + saldofinal);
		}
		
		if (saldofinal<0) {
			System.out.println("Conta Estourada - seu saldo � de: " + saldofinal);
		} 
		
		if (saldofinal == 0) {
			System.out.println("Conta Zerada");
		}
	}

}
