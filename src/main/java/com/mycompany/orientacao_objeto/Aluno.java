/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.orientacao_objeto;

/**
 *
 * @author Lucas
 */
public class Aluno {
    
    String nome;
    String matricula;
    String nomeCurso;
    String[] nomeDisciplina = new String[3];
    double[][] notaDisciplina = new double[3][4];
    
    void mostrarInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("matricula: " + matricula);
        System.out.println("Nome do curso: " + nomeCurso);
        
        for (int i=0; i<notaDisciplina.length; i++) {
            System.out.println("Notas das disciplana " + nomeDisciplina[i]);
            for (int j=0; j<notaDisciplina[i].length; j++) {
                System.out.println(notaDisciplina[i][j] + "");
            }
            
            System.out.println();
        }
    }
    
    boolean verificarAprovado(int indice) {
        
        double soma = 0;
        
        for (int i=0; i<notaDisciplina[indice].length; i++) {
            soma += notaDisciplina[indice][i];
        }
        
        double media = soma / 4;
        
        if (media >= 7) {
            return true;
            
        } else {
            return false;
        }
    }
    
}
