package com.betrybe.sistemadevotacao;

import java.util.ArrayList;
import java.util.Objects;

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<>();
  private final ArrayList<String> cpfsComputados = new ArrayList<>();

  /**
   * cadastrarPessoaCandidata.
   **/
  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número da pessoa candidata já utilizado!");
        return;
      }
    }
    pessoasCandidatas.add(new PessoaCandidata(nome, numero));
  }

  /**
   * cadastrarPessoaEleitora.
   */
  public void cadastrarPessoaEleitora(String nome, String cpf) {
    for (int i = 0; i < pessoasEleitoras.toArray().length; i++) {
      if (Objects.equals(PessoaEleitora.getCpf(), cpf)) {
        System.out.println("Pessoa eleitora já cadastrada!");
        return;
      }
    }
    pessoasEleitoras.add(new PessoaEleitora(nome, cpf));
  }

  /**
   * votar.
   */
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    for (int i = 0; i < cpfsComputados.toArray().length; i++) {
      if (Objects.equals(cpfsComputados.get(i), cpfPessoaEleitora)) {
        System.out.println("Pessoa eleitora já votou!");
        return;
      }
    }
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      if (pessoasCandidatas.get(i).getNumero() == numeroPessoaCandidata) {
        PessoaCandidata pessoaCandidata = pessoasCandidatas.get(i);
        pessoaCandidata.receberVoto();
        cpfsComputados.add(cpfPessoaEleitora);
      }
    }
  }

  /**
   * mostrarResultado.
   */
  public void mostrarResultado() {
    if (cpfsComputados.toArray().length <= 0) {
      System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.");
    }
    int total = cpfsComputados.toArray().length;
    for (int i = 0; i < pessoasCandidatas.toArray().length; i++) {
      int votos = pessoasCandidatas.get(i).getVotos();
      double porcentagem = (double) votos / total * 100;
      System.out.println("Nome: " + pessoasCandidatas.get(i).getNome() + " - "
                    + votos + " votos" + " ( " + Math.round((porcentagem)));
    }
    System.out.println("Total de votos: " + total);
  }
}