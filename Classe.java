/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Classe {

    static Classe Mago() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static Classe Outros() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
   public String nome;
   public Double pontoVida; 
   public Double pontosMana;
   public Double pontosStamina;
   public Double forca;
   public Double agilidade;
   public Double vitalidade;
   public Double energia;
   
   
   public static Classe setMago (){
       
       
     Classe classePersonagem = new Classe();
     
     
      classePersonagem.nome           = "Mago" ;
      classePersonagem.pontoVida      =  100.00; 
      classePersonagem.pontosMana     =  350.00;
      classePersonagem.pontosStamina  =   50.00;
      classePersonagem.forca          =   10.00;
      classePersonagem.agilidade      =   30.00;
      classePersonagem.vitalidade     =   20.00;
      classePersonagem.energia        =  250.00;
      
      
      return classePersonagem;
   
   }
    public static Classe  Duelista (){
       
       
     Classe classePersonagem = new Classe();
     
     
      classePersonagem.nome           = "Duelista" ;
      classePersonagem.pontoVida      =  100.00; 
      classePersonagem.pontosMana     =  300.00;
      classePersonagem.pontosStamina  =   40.00;
      classePersonagem.forca          =   15.00;
      classePersonagem.agilidade      =   30.00;
      classePersonagem.vitalidade     =   25.00;
      classePersonagem.energia        =  300.00;
      
      
      return classePersonagem;
   
   } public static Classe Irom (){
       
       
     Classe classePersonagem = new Classe();
     
     
      classePersonagem.nome           = "Irom" ;
      classePersonagem.pontoVida      =  100.00; 
      classePersonagem.pontosMana     =  150.00;
      classePersonagem.pontosStamina  =   55.00;
      classePersonagem.forca          =   20.00;
      classePersonagem.agilidade      =   25.00;
      classePersonagem.vitalidade     =   10.00;
      classePersonagem.energia        =  450.00;
      
      
      return classePersonagem; 
      
   }
    public static Classe Fakere (){
       
       
     Classe classePersonagem = new Classe();
     
     
      classePersonagem.nome           = "Faker" ;
      classePersonagem.pontoVida      =  100.00; 
      classePersonagem.pontosMana     =  400.00;
      classePersonagem.pontosStamina  =   40.00;
      classePersonagem.forca          =   20.00;
      classePersonagem.agilidade      =   30.00;
      classePersonagem.vitalidade     =   20.00;
      classePersonagem.energia        =  200.00;
      
      
      return classePersonagem;
   
   }
   }

    
 