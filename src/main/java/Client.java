import java.util.Random;
  
public class Client {

  String nameClient, emailClient, phoneClient;

  shopCart carrinho = new shopCart();
  Random rd = new Random();
  
  public boolean getCPF() {
    return rd.nextBoolean();
  }

  public void cadastrar(int[][] cart, int qtd, double total) {
    System.out.println(">>>>> CADASTRO <<<<<");
    System.out.println(">> Digite seu nome: ");
    nameClient = System.console().readLine();
    System.out.println(">> Digite seu e-mail: ");
    emailClient = System.console().readLine();
    System.out.println(">> Digite seu telefone: ");
    phoneClient = System.console().readLine();
    System.out.println("_______________________");
    System.out.println(">> Prazer em conhecê-lo(a) " + nameClient + "! Desconto de 1ª compra aplicado:");
    carrinho.resumeCart(cart, qtd, total);
    System.out.println("");
  }
  
}