/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import br.com.fabricadeprogramador.persistencia.jdbc.UsuarioDAO;

/**
 *
 * @author ProjetosPC
 */
public class TestUsuarioDAO {
    public static void main(String[] args) {
   
        
        testExcluir();
    }
    
    public static void testExcluir(){
          Usuario usu = new Usuario();
        usu.setId(4);
        //Cadastrar usuario no banco
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.excluir(usu);
        System.out.println("Cadastrado com sucesso!!!");
    }
   /////////////////////////////////////////////////////////////
    public static void testCadastrar(){
             Usuario usu = new Usuario();
        usu.setNome("Jãozão");
        usu.setLogin("jzao");
        usu.setSenha("123");
        //Cadastrar usuario no banco
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.cadastrar(usu);
        System.out.println("Cadastrado com sucesso!!!");
    } 
    ////////////////////////////////////////////////////////
    public static void testAlterar(){
             Usuario usu = new Usuario();
        usu.setId(4);
        usu.setNome("Jãozão da Silva");
        usu.setLogin("jzaoss");
        usu.setSenha("12345678");
        //Cadastrar usuario no banco
        UsuarioDAO usuDAO = new UsuarioDAO();
        usuDAO.alterar(usu);
        System.out.println("Alterado com sucesso!!!");
    }
}
