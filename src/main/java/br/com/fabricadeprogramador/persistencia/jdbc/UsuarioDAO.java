/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.fabricadeprogramador.persistencia.jdbc;

import br.com.fabricadeprogramador.persistencia.entidade.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ProjetosPC
 */
public class UsuarioDAO {
    private Connection con = ConexaoFactory.getConnection();

    public void cadastrar(Usuario usu) {
        String sql = "insert into usuario (nome, login, senha) values (?, ?, ?)";
            //Criando um statement com auto close
        try (PreparedStatement preparador = con.prepareStatement(sql)){            
            preparador.setString(1, usu.getNome());
            preparador.setString(2, usu.getLogin());
            preparador.setString(3, usu.getSenha());
            //Executa o comando SQL
            preparador.execute();
        } catch (SQLException ex) {
            
        }
    }

    public void alterar(Usuario usu) {
        String sql = "update usuario set nome=?, login=?, senha=? where id=?";
            //Criando um statement com auto close
        try (PreparedStatement preparador = con.prepareStatement(sql)){            
            preparador.setString(1, usu.getNome());
            preparador.setString(2, usu.getLogin());
            preparador.setString(3, usu.getSenha());
             preparador.setInt(4, usu.getId());
            //Executa o comando SQL
            preparador.execute();
        } catch (SQLException ex) {
            
        }
    }

    public void excluir(Usuario usu) {
        String sql = "delete from usuario where id=?";
            //Criando um statement com auto close
        try (PreparedStatement preparador = con.prepareStatement(sql)){            
             preparador.setInt(1, usu.getId());
            //Executa o comando SQL
            preparador.execute();
        } catch (SQLException ex) {
            
        }
    }

}
