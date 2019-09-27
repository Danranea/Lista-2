package listaexercicios2;
import java.util.Scanner;
public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double saldoinicial, depósito, saque, sair, saldofinal = 0;
		double operação;
		
		System.out.print("Digite o saldo inicial da Conta: ");
		saldoinicial = sc.nextDouble();
		
			
		do {
									
			System.out.print("Digite 1 para depósito, 2 para saque e 3 para encerramento: ");
			operação = sc.nextDouble();
			
			if (operação == 1) {
				
				System.out.print("Digite o valor para depósito: ");
				depósito = sc.nextDouble();
				saldoinicial = saldoinicial+depósito;
				saldofinal = saldoinicial;
			}
			if (operação == 2) {
				
				System.out.println("Digite o valor do saque: ");
				saque = sc.nextDouble();
				saldoinicial = saldoinicial-saque;
			}   saldofinal = saldoinicial;
			if (operação == 3) {
				
				System.out.println("Operação encerrada");
			}
		
		} while (!(operação==3));
		
		if (saldofinal>0) {
			System.out.println("Conta preferencial - seu saldo é de: " + saldofinal);
		}
		
		if (saldofinal<0) {
			System.out.println("Conta Estourada - seu saldo é de: " + saldofinal);
		} 
		
		if (saldofinal == 0) {
			System.out.println("Conta Zerada");
		}
	}

}
