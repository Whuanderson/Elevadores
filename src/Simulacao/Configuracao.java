package Simulacao;

public class Configuracao {
  private int tempoDeSimuacao;
  private int tempoMilissegundos;
  private int andares;
  private int elevadores;
  private int capacidadeElevador;
  private int pessoasPorFila;

  public Configuracao(int tempoDeSimulacao, int tempoMilissegundos, int andares, int elevadores,
      int capacidadeElevador, int pessoasPorFila) {
    this.tempoDeSimuacao = tempoDeSimulacao;
    this.tempoMilissegundos = tempoMilissegundos;
    this.andares = andares;
    this.elevadores = elevadores;
    this.capacidadeElevador = capacidadeElevador;
    this.pessoasPorFila = pessoasPorFila;
  }

  public int getTempoDeSimulacao() {
    return tempoDeSimuacao;
  }
  public int getTempoMilissegundos() {
    return tempoMilissegundos;
  }
  public int getAndares() {
    return andares;
  }
  public int getElevadores() {
    return elevadores;
  }
  public int getCapacidadeElevador() {
    return capacidadeElevador;
  }
  public int getPessoasPorFila() {
    return pessoasPorFila;
  }
}
