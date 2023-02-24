package Controller;

import Model.Usuario;

public class ControllerCadastro {

    

   public String cadastroUsuario(String nome, String senha){
        Usuario usuario = new Usuario(nome, senha);
        return "Usuário cadastrado: " + usuario.getNome();

    }

}
