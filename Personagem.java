/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Personagem {
   
        
 private String nome;
 private Double pontoVida; 
 private Double pontosMana;
 private Double pontosStamina;
 private Double forca;
 private Double agilidade;
 private Double vitalidade;
 private Double energia;
 private Classe classe;

    public void setClasse(Classe classe) {
        this.classe = classe;
        
            this.pontoVida      = classe.pontoVida;
            this.pontosMana     = classe.pontosMana;
            this.pontosStamina  = classe.pontosStamina;
            this.forca          = classe.forca;
            this.energia        = classe.energia;
            this.agilidade      = classe.agilidade;
            this.vitalidade     = classe.vitalidade;
                    
    }

   
        public Double getEnergia() {
      return energia;
    }

        public void setEnergia(Double energia) {
     this.energia = energia;
    }
 
        public String getNome() {
     return nome;
    }

        public void setNome(String nome) {
     this.nome = nome;
    }

    
        public void setAtributos(Double vida,Double mana, Double forca,Double stamina, Double agilidade, Double energia, Double vitalidade) {
            this.pontoVida      = vida;
            this.pontosMana     = mana;
            this.pontosStamina  = stamina;
            this.forca          = forca;
            this.energia        = energia;
            this.agilidade      = agilidade;
            this.vitalidade     = vitalidade;
                    
                    
                    
}
    
        public Double getPontoVida() {
     return pontoVida;
    }

        public void setPontoVida(Double pontoVida) {
     this.pontoVida = pontoVida;
    }

        public Double getPontosMana() {
     return pontosMana;
    }

        public void setPontosMana(Double pontosMama) {
     this.pontosMana = pontosMama;
    }

        public Double getPontosStamina() {
     return pontosStamina;
    }

        public void setPontosStamina(Double pontosStamina) {
     this.pontosStamina = pontosStamina;
    }

        public Double getForça() {
     return forca;
    }

        public void setForca(Double forca) {
     this.forca = forca;
    }

        public Double getAgilidade() {
     return agilidade;
    }

        public void setAgilidade(Double agilidade) {
     this.agilidade = agilidade;
    }

        public Double getVitalidade() {
     return vitalidade;
    }

        public void setVitalidade(Double vitalidade) {
     this.vitalidade = vitalidade;
    }
 
        public void consumirMana (Double mana){
     this.pontosMana = mana;
      
  }
        public void consumirStamina (Double Stamia){
     this.pontosStamina = Stamia;
     }
     
        public void sofrerDanoMagico (Double magico){
     this.pontoVida -= magico;
     }
     
        public void sofrerDanoFisico(Double fisico){
     this.pontoVida -= fisico;
     } 

    Object getClasse() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
      
     
     
     
     
     
 }
    
    


