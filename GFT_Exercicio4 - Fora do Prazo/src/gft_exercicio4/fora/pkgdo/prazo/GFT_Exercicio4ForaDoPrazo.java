package gft_exercicio4.fora.pkgdo.prazo;

import java.util.Scanner;
import java.util.Arrays;

public class GFT_Exercicio4ForaDoPrazo {

    public static void main(String[] args) {

        double soma = 0, valorMaior = 0, valorMenor = 0, media = 0, mediana, numeroRecebido;
        int qtdNumeros = 1;

        Scanner ler = new Scanner(System.in);
        double numeros[] = new double[10];

        for (int i = 0; i < qtdNumeros; i++) {
            System.out.println("Digite um número ou 0 para sair.");
            numeroRecebido = ler.nextDouble();
            if (numeroRecebido != 0) {
                numeros[i] = numeroRecebido;
                qtdNumeros++;

                soma = soma + numeroRecebido;
                
                
                if(numeros[i] > valorMaior){
                valorMaior = numeros[i];
                } else{
                valorMenor = numeroRecebido;
                }
            } else {
                qtdNumeros--;
            }
        }
        media = soma / qtdNumeros ;

        if (qtdNumeros < 1) {
            System.out.println("A Array está vazia.");
        } else {
            System.out.println("SOMA DOS NÚMEROS INFORMADOS: " + soma);
            System.out.println("MAIOR NÚMERO INFORMADO: " + valorMaior);
            System.out.println("MENOR NÚMERO INFORMADO: " + valorMenor);
            System.out.println("MÉDIA ENTRE OS NÚMEROS INFORMADOS: " + media);
            //System.out.println("MEDIANA ENTRE OS NÚMEROS INFORMADOS: " + mediana);
        }
    }
}
