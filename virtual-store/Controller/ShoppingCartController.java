public class ShoppingCartController{

    private List<ShoppingCartItensDTO> shoppingCartItens;

    public void adicionarItem(Carrinho carrinho, Produto produto, Double valorUnitario, Double quantidade){
        ShoppingCartItensDTO itens = new ShoppingCartItensDTO();
        itens.setProduto(produto);
        itens.setValorUnitario(valorUnitario);
        itens.setQuantidade(quantidade);
        itens.setCarrinho(carrinho);
        shppingCartItens.add();
    }

    @Override
    public String toString(){
        
        return "";
    }

}