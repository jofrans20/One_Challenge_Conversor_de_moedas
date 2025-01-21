package alura.com.br.moedas_conversor;

public class Dinheiro {
    private final double valor;
    private final String moeda;

    public Dinheiro(double valor, String moeda) {
        this.valor = valor;
        this.moeda = moeda;
    }

    public double getValor() {
        return valor;
    }

    public String getMoeda() {
        return moeda;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f", moeda, valor);
    }
}
