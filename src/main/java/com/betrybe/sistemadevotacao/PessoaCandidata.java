package com.betrybe.sistemadevotacao;

public abstract class PessoaCandidata extends Pessoa {
  private int numero;
  private int voto;

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVoto() {
    return voto;
  }

  public void setVoto(int voto) {
    this.voto = voto;
  }

}
