import java.util.Random;
import java.util.Scanner;

  
public class Client {

  String nameClient, emailClient, phoneClient;

  shopCart carrinho = new shopCart();
  Random rd = new Random();
  Scanner teclado = new Scanner(System.in);
  
  public boolean getCPF() {
    return rd.nextBoolean();
  }

  // Considerando que ainda não aprendi banco de dados, o programa 'valida' o CPF com base em um random boleano. Essa análise 'hipotética' serve para simbolizar a análise de um cliente já cadastrado na base de dados da loja.

  
  public void cadastrar(int[][] cart, int qtd, double total) {
    System.out.println(">>>>> CADASTRO <<<<<");
    System.out.println(">> Digite seu nome: ");
    nameClient = teclado.next();
    System.out.println(">> Digite seu e-mail: ");
    emailClient = teclado.next();
    System.out.println(">> Digite seu telefone: ");
    phoneClient = teclado.next();
    System.out.println("_______________________");
    System.out.println(">> Prazer em conhecê-lo(a), " + nameClient + "! Desconto de 1ª compra aplicado:");
    carrinho.resumeCart(cart, qtd, total);
    System.out.println("");
  }

  // É feito um cadastro simples de cliente, sem exigência de qualquer tipo de validação.
}