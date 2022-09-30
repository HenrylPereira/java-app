package org.example.servico;

import org.example.entidade.Tarefa;
import org.example.persistencia.TarefaDAO;

public class CriarTarefa {

    private TarefaDAO dao;

    public CriarTarefa(){
        dao = new TarefaDAO();
    }

    public void criar(Tarefa tarefa) throws Exception {
        if(tarefa.getDescricao() == null || tarefa.getDescricao().length() < 4){
            throw  new Exception("Favor informar a tarefa.");
        }
        dao.inserir(tarefa);
    }

}
