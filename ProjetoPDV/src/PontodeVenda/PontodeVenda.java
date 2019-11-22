/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PontodeVenda;

import apresentacao.JFrameAluno;

/**
 *
 * @author bruno.smedeiros
 */
public class PontodeVenda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        JFrameAluno jFrameAluno = new JFrameAluno(); //Cria o objeto Janela
        jFrameAluno.setTitle("PDV - ponto de venda"); //Define o título na Janela
        jFrameAluno.setLocationRelativeTo(null); //Coloca a janela no centro da tela
        jFrameAluno.setVisible(true); //Mostra a janela
    }
    
}
