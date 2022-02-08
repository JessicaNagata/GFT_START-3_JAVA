
package gft_exercico1;

import java.util.Scanner;

public class GFT_Exercico1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva uma frase: ");
        
        String str = ler.nextLine();
        String[] newStr = str.split(" ");   
        String ultimaPalavra = newStr[newStr.length - 1];
        
        System.out.println("Quantidade de letras: " + ultimaPalavra.chars().count());
        

    }
    
}
