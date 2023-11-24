public class Produto {
    
   private double precoCompra;
   private static final double MARKUP = 1.54;
   
   public Produto(double precoCompra) {
        this.precoCompra = precoCompra;
   }

   public double calcularPrecoVenda () {
        return precoCompra * MARKUP;
   }
}
