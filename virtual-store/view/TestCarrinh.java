public class TestCarrinh {
    public static void main(String[] args){
        Cliente cliente = new Cliente();
        cliente.setCpf("2742682734");
        cliente.seName("Alice");

        ProductDTO produto1 = new ProductDTO();
        produto1.setDescricao("Mouse Gamer");
        produto1.setEstoque(9.);
        produto1.setValorVenda(99.);

        ProductDTO produto2 = new ProductDTO();
        produto2.setDescricao("Teclado mecânico");
        produto2.setEstoque(0.);
        produto2.setValorVenda(199.);

        CarrinhoCompra carrinho = new CarrinhoCompra();
        carrinho.setCliente(cliente);

        carrinhoControle carrinhoControle = new CarrinhoControle();
        carrinhoControle.adicionarItem(carrinho, produto1, 33., 2.);
        carrinhoControle.adicionarItem(carrinho, produto2, 70., 3.);

    }
}
