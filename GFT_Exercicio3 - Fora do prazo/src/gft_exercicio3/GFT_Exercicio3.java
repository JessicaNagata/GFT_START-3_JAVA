package gft_exercicio3;

import classes.Caixa;
import classes.Produto;

public class GFT_Exercicio3 {

    public static void main(String[] args) {

        Caixa caixa = new Caixa();

        Produto produto1 = new Produto("Banana", 0.99, 2);
        System.out.println(produto1.getNome() + " = R$ " + caixa.calculaValorFinal(produto1, 3));

        Produto produto2 = new Produto("Energético", 5.49, 3);
        System.out.println(produto2.getNome() + " = R$ " + caixa.calculaValorFinal(produto2, 7));

        Produto produto3 = new Produto("Arroz", 20.00, 1);
        System.out.println(produto3.getNome() + " = R$ " + caixa.calculaValorFinal(produto3, 1));

        Produto produto4 = new Produto("Chocolate", 4.50, 1);
        System.out.println(produto4.getNome() + " = R$ " + caixa.calculaValorFinal(produto4, 12));

        Produto produto5 = new Produto("Leite", 3.73, 3);
        System.out.println(produto5.getNome() + " = R$ " + caixa.calculaValorFinal(produto5, 5));

        Produto produto6 = new Produto("Abacaxi", 2.40, 2);
        System.out.println(produto6.getNome() + " = R$ " + caixa.calculaValorFinal(produto6, 1));
    }
}
