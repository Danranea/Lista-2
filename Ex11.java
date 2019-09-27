/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author danilo.sranea
 */
public class Ex11 {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		double x=1, n, soma=0, i=0, i2 = -1;
                
                System.out.println("Digite o valor de N: ");
		n = sc.nextDouble();
                
                while (x<=n) {
                    if (x%2==0) {
                      i = -1*(1/x);  
                    } else {
                        i = 1/x;
                    }
                   soma=soma+i;
                   x++;
            
        }
                System.out.println("O resultado da soma é: " + soma);
		
    }

}
    

