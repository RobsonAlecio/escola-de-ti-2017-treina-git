public class Pessoa {
  private String nome;
  private int idade;
  private double saldoNaConta;
  private double altura;

  public Pessoa (String nome, int idade, double saldoNaConta, double altura) {
    this.nome = nome;
    this.idade = idade;
    this.saldoNaConta = saldoNaConta;
    this.altura = altura;
  }

  public String getNome() {
    return nome;
  }

  public int getIdade() {
    return idade;
  }

  public double getAltura() {
    return altura;
  }
  public double getSaldoNaConta() {
    return saldoNaConta;
  }

}
