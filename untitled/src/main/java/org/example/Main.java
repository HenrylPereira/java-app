package org.example;

import org.example.entidade.Tarefa;
import org.example.persistencia.CriarTabelas;
import org.example.servico.CriarTarefa;
import org.example.servico.ListarTarefas;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CriarTabelas.criarTabelas();

        Tarefa tarefa = new Tarefa();
        tarefa.setDescricao("tarefa");
        tarefa.setPrioridade("alta");

        ArrayList lista = new ArrayList<Tarefa>();
        lista.add(tarefa);


        CriarTarefa criarTarefa = new CriarTarefa();

        try {
            criarTarefa.criar(tarefa);
        }catch (Exception e){
            e.printStackTrace();
        }

        ListarTarefas listarTarefas = new ListarTarefas();
        for(Tarefa t : listarTarefas.obterTodos()){
            System.out.println(t);
        }

    }

}
