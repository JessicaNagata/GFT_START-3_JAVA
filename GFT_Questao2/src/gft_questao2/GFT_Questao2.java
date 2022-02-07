package gft_questao2;

import classes.Cofins;
import classes.Icms;
import classes.Ipi;
import java.util.Scanner;

public class GFT_Questao2 {

    public static void main(String[] args) {
        double valor;
        
        Scanner ler = new Scanner(System.in);
        Icms ICMS = new Icms();
        Ipi IPI = new Ipi();
        Cofins COFINS = new Cofins();
        
        System.out.print("Digite um valor: R$ ");
        valor = ler.nextDouble();
        ICMS.setValor(valor);
        IPI.setValor(valor);
        COFINS.setValor(valor);
        
        
        System.out.println("ICMS: R$ " + ICMS.calculaImposto(ICMS.getValor()));
        System.out.println("IPI: R$ " + IPI.calculaImposto(IPI.getValor()));
        System.out.println("COFINS: R$ " + COFINS.calculaImposto(COFINS.getValor()));
        System.out.println("Valor final: R$" + (valor + (+ (ICMS.calculaImposto(valor)+ IPI.calculaImposto(valor)+ COFINS.calculaImposto(valor)))));
    }
    
}
