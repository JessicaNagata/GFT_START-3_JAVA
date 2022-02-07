package classes;

public class Icms implements Imposto {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public double calculaImposto(double valor) {

        return this.valor * 0.3;
    }

}
