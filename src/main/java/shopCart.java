import java.util.Scanner;

public class shopCart {

  Scanner teclado = new Scanner(System.in);
  Product p = new Product();
  
  public void resumeCart (int[][] cart, int qtd, double total) {

    System.out.println(">>>>> SEU CARRINHO <<<<<");
    System.out.println("");
    double totalCerto = 0;
    for (int i = 0; i < qtd; i++) {
      System.out.println("Produto: "+ cart[i][0] + " X " + cart[i][1]+"und = R$"+(p.getPrice(cart[i][0])*cart[i][1]));

      totalCerto += (p.getPrice(cart[i][0])*cart[i][1]);
    }
    System.out.println("");
    System.out.println(">>>>> TOTAL: R$ " + totalCerto + " <<<<<");
    System.out.println("");
    }

  public void payment () {
    
    System.out.println("Digite a forma de Pagamento (P/B/C)");
    String gateway= teclado.next();
    
    switch (gateway) {
      case "P":
        System.out.println("O QR Code para pagamento PIX será gerado na próxima tela.");
        break;
      case "B":
        System.out.println("O Código de Barras para pagamento será gerado na próxima tela");
        break;
      case "C":
        System.out.println("Digite o número do cartão de crédito: ");
        break;
      default:
        System.out.println("Opção inválida! Tente novamente.");
        break;
      }

    System.out.println(">>>>>> CARREGANDO...");
    System.out.println("Compra realizada com sucesso! Vote Sempre :)");
  }
}