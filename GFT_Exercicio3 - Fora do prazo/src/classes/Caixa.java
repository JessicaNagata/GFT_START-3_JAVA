package classes;


public class Caixa {
    
    public double calculaValorFinal(Produto produto, int quantidade){
    double valorFinal = 0;
     if(produto.getTipo()== 1){
     valorFinal = (produto.getValor() - (produto.getValor() * 0.1)) * quantidade;
     }else if(produto.getTipo()== 2){
     valorFinal = (produto.getValor() - (produto.getValor() * 0.2)) * quantidade;
     }else if (produto.getTipo()== 3 && quantidade > 5){
     valorFinal = (produto.getValor() - (produto.getValor() * 0.1))* quantidade;
     }else{
     valorFinal = produto.getValor();
     };   
        
        
    return valorFinal;
    };
}
