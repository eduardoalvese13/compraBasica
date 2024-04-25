public class Product {

  int pdEstoque;
  double pdPrice;
  boolean isProduct;

  
  public boolean isProduct (int codProduct) {
    return(codProduct%10 == 0 && codProduct > 0);
    // Considerando que ainda não aprendi banco de dados, o programa faz uma análise de existência de um código de produto hipotética a partir de um código simples: Todo código múltiplo de 10 existe no 'banco de dados', caso contrário, envia a mensagem negativa.
  }
  
  public int stock(int codProduct) {
    return(codProduct / 10);
    // Considerando que ainda não aprendi banco de dados, o programa gera um estoque hipotético a partir de um código de produto anteriormente 'validado'. Para gerar o estoque de forma 'dinâmica' ele divide o código por 10, resultando nas unidades disponíveis. Essa foi uma forma simples que encontrei para lidar com a análise de estoque proposta.
  }

  public double getPrice (int codProduct) {
    return(codProduct / 5);
    // Considerando que ainda não aprendi banco de dados, o programa gera um preço hipotético a partir de um código de produto anteriormente 'validado'. Para gerar o preço de forma 'dinâmica' ele divide o código por 5, resultando no preço de cada uma das unidades.
  }
  
}