package org.example.servico;

import org.example.entidade.Prioridade;
import org.example.persistencia.PrioridadeDAO;

public class CriarPrioridade {

    private PrioridadeDAO dao;

    public CriarPrioridade(){
        dao = new PrioridadeDAO();
    }

    public void criar(Prioridade prioridade) throws Exception {
        if(prioridade.getNome() == null){
            throw  new Exception("Favor informar a prioridade.");
        }
        dao.inserir(prioridade);
    }

}
