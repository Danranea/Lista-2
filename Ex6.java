package listaexercicios2;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int idadeA, idadeB, idadeC, idadeD, idadeE; 
		String nomeA, nomeB, nomeC, nomeD, nomeE, sexoA, sexoB, sexoC, sexoD, sexoE;
		
		do {
			System.out.print("Digite o nome do Aluno A: ");
			nomeA = sc.next();
			System.out.print("Digite a idade do Aluno A: ");
			idadeA = sc.nextInt();
			System.out.print("Digite o sexo do Aluno A: ");
			sexoA = sc.next();
			
			System.out.print("Digite o nome do Aluno B: ");
			nomeB = sc.next();
			System.out.print("Digite a idade do Aluno B: ");
			idadeB = sc.nextInt();
			System.out.print("Digite o sexo do Aluno B: ");
			sexoB = sc.next();
			
			System.out.print("Digite o nome do Aluno C: ");
			nomeC = sc.next();
			System.out.print("Digite a idade do Aluno C: ");
			idadeC = sc.nextInt();
			System.out.print("Digite o sexo do Aluno C: ");
			sexoC = sc.next();
			
			System.out.print("Digite o nome do Aluno D: ");
			nomeD = sc.next();
			System.out.print("Digite a idade do Aluno D: ");
			idadeD = sc.nextInt();
			System.out.print("Digite o sexo do Aluno D: ");
			sexoD = sc.next();
			
			System.out.print("Digite o nome do Aluno E: ");
			nomeE = sc.next();
			System.out.print("Digite a idade do Aluno E: ");
			idadeE = sc.nextInt();
			System.out.print("Digite o sexo do Aluno E: ");
			sexoE = sc.next();
								
			if (idadeA>idadeB && idadeA>idadeC && idadeA>idadeD && idadeA>idadeE) {
				System.out.println("Os dados do alunos mais velho são: " + nomeA + " - " +idadeA + " - " + sexoA);
			}
			if (idadeB>idadeA && idadeB>idadeC && idadeB>idadeD && idadeB>idadeE) {
				
				System.out.println("Os dados do alunos mais velho são: " + nomeB + " - " + idadeB + " - " + sexoB);
			}
			if (idadeC>idadeA && idadeC>idadeB && idadeC>idadeD && idadeC>idadeE) {
				System.out.println("Os dados do alunos mais velho são: " + nomeC + " - " + idadeC + " - " + sexoC);
			}
			if (idadeD>idadeA && idadeD>idadeB && idadeD>idadeD && idadeD>idadeE) {
				System.out.println("Os dados do alunos mais velho são: " + nomeD + " - " + idadeD + " - " + sexoD);
			}
			if (idadeE>idadeA && idadeE>idadeB && idadeE>idadeC && idadeE>idadeE) {
				System.out.println("Os dados do alunos mais velho são: " + nomeE + " - " + idadeE + " - " + sexoE);
			}
					
		} while ((idadeA<=0 && idadeB<=0 && idadeC<=0 && idadeD<=0 && idadeE<=0));
		
		
	}

}
