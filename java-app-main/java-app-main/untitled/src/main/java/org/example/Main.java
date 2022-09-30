package org.example;

import org.example.entidade.Prioridade;
import org.example.entidade.Tarefa;
import org.example.persistencia.CriarTabelas;
import org.example.servico.CriarPrioridade;
import org.example.servico.CriarTarefa;
import org.example.servico.ListarTarefas;

public class Main {

    public static void main(String[] args) {

        CriarTabelas.criarTabelas();

        Prioridade prioridade = new Prioridade();
        prioridade.setId(1);
        prioridade.setNome("alta");

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("Segunda tarefa");
        tarefa.setPrioridade(prioridade);



        CriarTarefa criarTarefa = new CriarTarefa();
        CriarPrioridade criarPrioridade = new CriarPrioridade();

        try {
            criarTarefa.criar(tarefa);
            criarPrioridade.criar(prioridade);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
        }

    }

}
