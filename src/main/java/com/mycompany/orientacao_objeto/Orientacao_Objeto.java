/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.orientacao_objeto;

import java.util.Scanner;

/**
 *
 * @author Lucas
 * 
 */
public class Orientacao_Objeto {

    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    Aluno Aluno = new Aluno();

    System.out.println("Entre com o nome do aluno: ");
    Aluno.nome = scanner.next();
        
    System.out.println("Entre com a matricula: ");
    Aluno.matricula = scanner.next();
    
    System.out.println("Entre com o nome do seu curso: ");
    Aluno.nomeCurso = scanner.next();
   
    
     for (int i=0; i<Aluno.nomeDisciplina.length; i++) {
         System.out.println("Entre com o nome da disciplina " + i);
         Aluno.nomeDisciplina[i] = scanner.next();
     }
     
     for (int i=0; i<Aluno.notaDisciplina.length; i++) {
         System.out.println("Obtendo notas da disciplinas: " + Aluno.nomeDisciplina[i]);
         
     for (int j=0; j<Aluno.notaDisciplina[i].length; j++) {
         System.out.println("Entre com a nota " + (j+1));
         Aluno.notaDisciplina[i][j] = scanner.nextDouble();
     }
    }
     
    Aluno.mostrarInfo();
     
    for (int i=0; i<Aluno.nomeDisciplina.length; i++) {
        if (Aluno.verificarAprovado(i)) {
            System.out.println("Disciplina: " + Aluno.nomeDisciplina[i] + " - Aprovado");
        } else {
            System.out.println("Disciplina: " + Aluno.nomeDisciplina[i] + " - Reprovado");
        }
    }
    
    
    
    
    }
}
