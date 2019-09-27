import java.util.Scanner;
public class ex21 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc = new Scanner(System.in);
		
		int n = 0, i=1, soma = 0;
        
        System.out.print("Entre com um número: ");
        n = sc.nextInt();
        
        while (i<n){
           if (n%i==0) {
               System.out.println(i);
               soma = soma+i;
               }
               i++;
               
        }
        
       if (soma==n) {
        	System.out.println("Número perfeito");
			
		}else {
			System.out.println("Número Imperfeito");
        
			
		}
        



	}

}
