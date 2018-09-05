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
public class Animais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Animal atual, primeiro = new Animal("humano","raciocina");
        atual = primeiro;
        String nome, caracteristica;
        JOptionPane.showMessageDialog(null, "Bem vindo ao Jogo dos Animais. Vamos começar?", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
        
        JOptionPane.showMessageDialog(null, "Pense em um animal.", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, "alert", "alert", JOptionPane.OK_OPTION);
        while(true) {
            if (0 == JOptionPane.showConfirmDialog(null, "O animal que você pensou " + atual.getCaracteristica() + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION)){
                if (0 == JOptionPane.showConfirmDialog(null, "O animal que você pensou é um(a) " + atual.getNome() + "?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION)){
                    JOptionPane.showMessageDialog(null, "Acertei!", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
                }
                else if (atual.getSemelhante() == null) {
                    atual.setSemelhante();
                }
                else {
                    atual = atual.getSemelhante();
                    continue;
                }
            }
            else if (atual.getDiferente() == null) {
                atual.setDiferente();
            }
            else {
                atual = atual.getDiferente();
                continue;
            }
            if (0 == JOptionPane.showConfirmDialog(null, "Vamos continuar?", "Jogo dos Animais", JOptionPane.YES_NO_OPTION)) {
                atual = primeiro;
                JOptionPane.showMessageDialog(null, "Pense em um animal.", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
                continue;
            }
            break;
        }
        JOptionPane.showMessageDialog(null, "Obrigado por jogar!", "Jogo dos Animais", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
