/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp.senai.br.main;

/**
 *
 * @author aluno
 */
public class Ataque {
    
       
 private String nome;
 private Double mana;
 private Double danoMagico;
 private Double danoFisico;
 private Double requisitoMana;
 private Double requisitoStamina;
 
 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAtributos(Double requisitoMana,Double requisitoStamina,Double danoMagico,Double danoFisico){
  
 this.requisitoMana      = requisitoMana;
 this.requisitoStamina   = requisitoStamina;       
 this.danoMagico         = danoMagico;
 this.danoFisico         = danoFisico;


}
    
    
    
    public Double getmana() {
        return mana;
    }

    public void setmana(Double mana) {
        this.mana = mana;
    }

    public Double getDanoMagico() {
        return danoMagico;
    }

    public void setDanoMagico(Double danoMagico) {
        this.danoMagico = danoMagico;
    }

    public Double getDanoFisico() {
        return danoFisico;
    }

    public void setDanoFisico(Double danoFisico) {
        this.danoFisico = danoFisico;
    }

    public Double getRequisitoMana() {
        return requisitoMana;
    }

    public void setRequisitoMana(Double requisitoMana) {
        this.requisitoMana = requisitoMana;
    }

    public Double getRequisitoStamina() {
        return requisitoStamina;
    }

    public void setRequisitoStamina(Double requisitoStamina) {
        this.requisitoStamina = requisitoStamina;
    }
    
}
   