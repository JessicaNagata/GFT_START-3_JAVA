package classes;

public class Ipi implements Imposto {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculaImposto(double valor) {
        if (this.valor < 25000) {
            return this.valor * 0.05;
        } else {
            return this.valor * 0.1;
        }
    }

}
