public class Product {

  public boolean isProduct (int codProduct) {
    return(codProduct%10 == 0 && codProduct > 0);
  }
  
  public int stock(int codProduct) {
    return(codProduct / 10);
  }

  public double getPrice (int codProduct) {
    return(codProduct / 5);
  }
  
}