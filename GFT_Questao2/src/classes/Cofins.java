package classes;

public class Cofins implements Imposto {

    private double valor;

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    @Override
    public double calculaImposto(double valor) {
        if(this.valor > 17000){
        return this.valor * 0.08;
        }else {
        return 0;
        }
    }

}
