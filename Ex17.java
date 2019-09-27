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
public class Ex17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = 0, i=1;
        
        System.out.print("Entre com um número: ");
        n = sc.nextInt();
        
       while (i<=n){
           if (n%i==0) {
               System.out.println(i);
               }
               i++;
           }
               
         }
    
}
