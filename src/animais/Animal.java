/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import javax.swing.JOptionPane;

/**
 *
 * @author Fernando
 */
public class Animal {
    private String caracteristica, nome, novaCaracteristica, novoNome;
    private Animal semelhante;
    private Animal diferente;
    
    public Animal(String nome, String caracteristica) {
        this.nome = nome;
        this.caracteristica = caracteristica;
    }

    public String getCaracteristica() {
        return caracteristica;
    }

    public String getNome() {
        return nome;
    }

    public Animal getSemelhante() {
        return semelhante;
    }

    public Animal getDiferente() {
        return diferente;
    }

    public void setSemelhante() {
        lerDados();
        this.semelhante = new Animal(novoNome, novaCaracteristica);
    }

    public void setDiferente() {
        lerDados();
        this.diferente = new Animal(novoNome, novaCaracteristica);
    }
    
    private void lerDados() {
        novoNome = JOptionPane.showInputDialog(null, "Qual animal você pensou?", "Jogo dos Animais", JOptionPane.QUESTION_MESSAGE);
        novaCaracteristica = JOptionPane.showInputDialog(null, "Um(a) " + novoNome + " _______ mas um(a) " + this.getNome() + " não.", "Jogo dos Animais", JOptionPane.QUESTION_MESSAGE);           
    }
    
}
