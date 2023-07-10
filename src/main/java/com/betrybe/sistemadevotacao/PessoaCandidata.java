package com.betrybe.sistemadevotacao;

public abstract class PessoaCandidata extends Pessoa {

  protected int numero;
  protected int votos;

  public PessoaCandidata(int numero, int votos) {
    this.numero = numero;
    this.votos = votos;
  }
}
