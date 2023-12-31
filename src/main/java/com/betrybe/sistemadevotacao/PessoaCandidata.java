package com.betrybe.sistemadevotacao;

/**
 * Represents a candidate person in the voting system.
 */
public class PessoaCandidata extends Pessoa {

  protected int votos;
  private int numero;

  /**
   * Constructs a new instance of the {@code PessoaCandidata} class with the specified name and
   * number.
   *
   * @param nome   The name of the candidate.
   * @param numero The number of the candidate.
   */
  public PessoaCandidata(String nome, int numero) {
    super(nome);
    this.numero = numero;
    this.votos = 0;
  }

  /**
   * Returns the nome of the candidate.
   *
   * @return The nome of the candidate.
   */
  @Override
  public String getNome() {
    return super.getNome();
  }

  /**
   * Sets the nome of the candidate.
   *
   * @param nome The nome of the candidate to set.
   */
  @Override
  public void setNome(String nome) {
    super.setNome(nome);
  }


  /**
   * Returns the number of the candidate.
   *
   * @return The number of the candidate.
   */
  public int getNumero() {
    return numero;
  }

  /**
   * Sets the number of the candidate.
   *
   * @param numero The number of the candidate to set.
   */
  public void setNumero(int numero) {
    this.numero = numero;
  }

  /**
   * Returns the number of votes received by the candidate.
   *
   * @return The number of votes received by the candidate.
   */
  public int getVotos() {
    return votos;
  }

  /**
   * Sets the votos of the candidate.
   *
   * @param votos The number of the candidate to set.
   */
  public void setVotos(int votos) {
    this.votos = votos;
  }

  /**
   * Receives a vote for the candidate.
   */
  public void receberVoto() {
    this.votos++;
  }
}
