package EstruturasCondicionais;
public class CaixaEletronico {

     //Estrutura Simples

public static void main(String[] args) {
     double saldo = 25.0;
     double valorSolicitado = 26.0;

     if(valorSolicitado < saldo)
          saldo = saldo - valorSolicitado;

     System.out.println(saldo);
    //Se "Valor Solicitado" for menor que meu saldo, o bloco abaixo será executado.
    //Essa execução precisa ser verdadeira para funcionar. 


}
}

