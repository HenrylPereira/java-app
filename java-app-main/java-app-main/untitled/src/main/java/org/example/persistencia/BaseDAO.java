package org.example.persistencia;

import java.sql.Connection;

class BaseDAO {

    protected Connection obterConexao(){
        return FabricaDeConexoes.obterInstancia().obterConexao();
    }

}
