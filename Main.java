/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

import java.util.Scanner;

/**
 *
 * @author aluno
 */
public class Main {
     
       public  Scanner teclado = new Scanner(System.in);
   
    
       public static void main(String[] args) {
        
        
       Personagem personagemUm   = new Personagem();
       Personagem personagemDois = new Personagem();   
  

          
        Batalha UltimaBattle      = new Batalha();
       
        Ataque ataqueUm           = new Ataque();
        Ataque ataqueDois         = new Ataque();
       
       
        personagemUm.setNome(" Um ");
        personagemUm.setAtributos(100.00,100.00,100.00,25.00,25.00,25.00,25.00);
     
        personagemDois.setNome(" Dois ");
        personagemDois.setAtributos(100.00,100.00,100.00,25.00,25.00,25.00,25.00);
        
        
        
        ataqueUm.setAtributos(70.00, 30.00, 50.00, 0.00);
        ataqueDois.setAtributos(50.00, 40.00, 60.00, 0.00);
        
        
        UltimaBattle.setPersonagemUm(personagemUm);
        UltimaBattle.setPersonagemDois(personagemDois);
        
        
        UltimaBattle.setNomes();
        UltimaBattle.setClasses();
        
        
        UltimaBattle.setAtaqueUm(ataqueUm);
        UltimaBattle.setAtaqueDois(ataqueDois);
        
       
        
        
        while(UltimaBattle.emAndamento == true){
            
            UltimaBattle.ataquePersonagemUm();
            
            if(UltimaBattle.getPersonagemDois().getPontoVida() <= 0.00 ||
                UltimaBattle.getPersonagemUm().getPontoVida()  <= 0.00) {
                UltimaBattle.emAndamento = false;
            }
            
            UltimaBattle.ataquePersonagemDois();
         
            if(UltimaBattle.getPersonagemDois().getPontoVida() <= 0.00 ||
                UltimaBattle.getPersonagemUm().getPontoVida()  <= 0.00) {
                UltimaBattle.emAndamento = false;
            }

        }
        
        System.out.printf("Vida P1: %f", UltimaBattle.getPersonagemUm().getPontoVida());
        
        System.out.printf("Vida P2: %f", UltimaBattle.getPersonagemDois().getPontoVida());   
        
        System.out.println();
    }

    
}
    