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
public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nalunos, x = 0, soma = 0, media, nota=0;
        
        System.out.println("Digite o número de alunos da sala: ");
        nalunos = sc.nextInt();
        
        while (x<nalunos) {
            x = x+1;
            System.out.println("Digite a nota do aluno: ");
            nota = sc.nextInt();
             soma = soma + nota;           
            }
        
        media = soma/nalunos;
        System.out.println("A media aritmética das notas é: " + media);
        
      }
    
}
