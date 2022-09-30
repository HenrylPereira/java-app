package org.example.persistencia;

import org.example.entidade.Prioridade;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PrioridadeDAO extends BaseDAO{
    public void inserir(Prioridade prioridade) {
        String sql = "insert into prioridade(id, nome) values(? ,?)";
        try(Connection c = obterConexao();
            PreparedStatement p = c.prepareStatement(sql)){
            p.setInt(1,prioridade.getId());
            p.setString(2, prioridade.getNome());
            p.execute();
        }catch (SQLException e){
            System.out.println("Erro ao inserir prioridade ");
            e.printStackTrace();
        }
    }
}
