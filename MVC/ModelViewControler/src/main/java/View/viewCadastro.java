/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.ControllerCadastro;
import java.util.Scanner;

/**
 *
 * @author pedro
 */
public class viewCadastro {

    public static void main(String[] args) {
    
    String nome;
    String senha;

    Scanner dados = new Scanner(System.in);

    System.out.println ("Nome: ");
    nome = dados.nextLine();
    
    System.out.println ("Senha: ");
    senha = dados.nextLine();

    ControllerCadastro cadastro = new ControllerCadastro();
    System.out.println(cadastro.cadastroUsuario(nome, senha));
}

}
