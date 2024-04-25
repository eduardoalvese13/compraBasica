import java.util.Scanner;

public class Main {
  public static void main(String[] args) {

    Scanner teclado = new Scanner(System.in);
    Product produto = new Product();
    shopCart cart = new shopCart();
    Client cliente = new Client();

    double totalPurchase = 0;
    int[][] cartPurchase = new int[10][2];
    int qtdItems = 0, qtdProduct = 0;

    System.out.println(">> Bem-vindo (a) à nossa loja! <<");
    System.out.println(">> Deseja comprar algo? (Y/N)");
    String decision = teclado.next();

    do {

        if (qtdItems < 10) {
          
          System.out.println(">> Digite o código do produto:");
          int codProduct = teclado.nextInt();

            if (produto.isProduct(codProduct)) {

              do {
              System.out.println(">> R$ "+produto.getPrice(codProduct)+" a unidade. Quantas unidades deseja comprar?");
              System.out.println("("+produto.stock(codProduct)+"und disponíveis)");
              qtdProduct = teclado.nextInt();

                if (produto.stock(codProduct) >= qtdProduct) {
                  cartPurchase[qtdItems][0] = codProduct;
                  cartPurchase[qtdItems][1] = qtdProduct;
                  qtdItems++;
                  totalPurchase = totalPurchase + (qtdProduct * produto.getPrice(codProduct));

                  System.out.println(">> Produto adicionado ao carrinho!");
                  System.out.println(">> Deseja adicionar mais produtos? (Y/N)");
                  decision = teclado.next();
                  break;

                } else {
                 System.out.println(">> Não há estoque suficiente para essa quantidade! Apenas " + produto.stock(codProduct) + " unidades disponíveis.");
                }

              } while (produto.stock(codProduct) < qtdProduct);

                
            } else {
              System.out.println(">> Código de produto inválido!");
            }

        } else {
          System.out.println(">> Seu carrinho está cheio! Finalizando compra...");
        }

    } while (decision.equals("Y")); 

    System.out.println(">> Finalizando compra...");
    cart.resumeCart(cartPurchase, qtdItems, totalPurchase);

    System.out.println(">> Digite seu CPF: ");
    String cpf = teclado.next();
    
    if (cliente.getCPF()) {
      System.out.println(">> Bem-vindo(a) de volta!");
    } else {
      totalPurchase = totalPurchase*0.9;
      cliente.cadastrar(cartPurchase, qtdItems, totalPurchase);
    }

    cart.payment();
  }
}