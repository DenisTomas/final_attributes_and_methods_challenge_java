public class ControladorProduto {
    public static void main(String[] args) {
        Produto produto = new Produto(100.0);
        double precoVenda = produto.calcularPrecoVenda();
        System.out.println("O preço de venda do produto é: " + precoVenda + " reais.");
    }
}
