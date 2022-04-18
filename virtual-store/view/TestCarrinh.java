package View;

import java.util.Random;

import Controller.CarrinhoControle;
import Models.Carrinho;
import Models.Cliente;
import Models.Produto;

public class LojaInterface {

	List<int> listIds = new ArrayList();
	
	public static void main(String[] args)
	{

		Cliente cliente = new Cliente();

		Random altNumber = new Random();

		int value = altNumber.nextInt()*100;

		//Chama o conferidor de numeros para sabermos de o id é existe e se tem que gerar um novo;
		int pegaValor = value.randonNumber();

		System.out.println("NUMERO GERADO É:" + value);

		cliente.setCpfCliente("0000000000");
		cliente.setEmailCliente("algo@hotmail.com");
		cliente.setEnderecoCliente("Rua a");


		cliente.setIdCliente(1);
		cliente.setNomeCliente("Fulano");
		cliente.setTelefoneCliente(44999999);
		
		Produto produto = new Produto();
		produto.setIdproduto(1);
		produto.setNomeProduto("sab�o");
		produto.setPrecoProduto(5.0);
		produto.setQtEstoqueProduto(10);
		
		Produto produto2 = new Produto();
		produto2.setIdproduto(2);
		produto2.setNomeProduto("detergente");
		produto2.setPrecoProduto(4.50);
		produto2.setQtEstoqueProduto(10);
		
		Carrinho carrinho = new Carrinho();
		carrinho.setCliente(cliente);
		carrinho.setIdCarrinho(1);
		
		CarrinhoControle carrinhoControle = new CarrinhoControle();
		carrinhoControle.adicionarItem(produto, 30.0, 22.0, carrinho);
		carrinhoControle.adicionarItem(produto2, 70.0, 15.0, carrinho);
		System.out.println(carrinhoControle);
	}

	public class randonNumber(int randonId){

		//Refazer esse metodo para não ser tão custoso computacionalmente, usar como exemplo de .now() das horas

			for(int x =0;x < listIds.legth; x++){
			if(randonId == listIds[x]){
				Random altNumber = new Random();
				int value = altNumber.nextInt()*100;
				randonId.randonNumber;
			}
		}
		return randonId;
	}
}
