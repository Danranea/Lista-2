package listaexercicios2;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		
		
		
		int lersenha = 0, senha = 2002;
				
		
		while (lersenha != senha) {
			
			System.out.println("Digite a senha: ");
			lersenha = ler.nextInt();
			
			if (lersenha == senha){
				System.out.println("Acesso Permitido");
			}
			else {
				System.out.println("Senha Invalida");
			}
		}

		ler.close();
		
		}
			
			          
      }

	
	

