public class Pessoa {
  private String nome;
  private int idade;
  private double saldoNaConta;

  public Pessoa (String nome, int idade, double saldoNaConta) {
    this.nome = nome;
    this.idade = idade;
    this.saldoNaConta = saldoNaConta;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getSaldoNaConta() {
    return saldoNaConta;
  }

}
