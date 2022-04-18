package Controller;

import java.util.ArrayList;
import java.util.List;

import Models.Carrinho;
import Models.ItensCarrinho;
import Models.Produto;

public class CarrinhoControle {
	
	private List<ItensCarrinho> itensCarrinho = new ArrayList<ItensCarrinho>();
	
	public void adicionarItem(Produto produto, Double valorUnitario, Double qtItensCarrinho, Carrinho carrinho )
	{
		ItensCarrinho itens = new ItensCarrinho();
		itens.setCarrinho(carrinho);
		itens.setProduto(produto);
		itens.setValorUnitario(valorUnitario);
		itens.setQtItensCarrinho(qtItensCarrinho);
		itensCarrinho.add(itens);
	}
	
	public void removerItem()
	{
		
	}
	
	@Override 
	public String toString()
	{
		//Descri��o do produto, quantidae adicionada ...
		return "";
	}
}
