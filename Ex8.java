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
public class Ex8 {
    public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		
		int x = 14, n = 73, soma = 0, contador = 0, media;
		
		while (x<n) {
			soma = soma + x;
			System.out.println("Os valores pares entre 14 e 73 são: " + x);
			x=x+2;
                        contador = contador + 1;
			
		}
		media=soma/contador;
		System.out.println("O resultado das soma dos números pares entre 13 e 73 é: " + soma);
                System.out.println("A média aritmética é: " + media);

}
}	

    

