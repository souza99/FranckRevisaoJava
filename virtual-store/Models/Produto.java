package Models;

public class Produto {
	
	
	private int idProduto;
		
	int qtEstoqueProduto;
	
	Double precoProduto;
	
	String nomeProduto;
	String fornecedorProduto;
	
	
	public int getIdProduto()
	{
		return idProduto;
	}
	
	public void setIdproduto(int idProduto)
	{
		this.idProduto = idProduto;
	}
	
	public String getNomeProduto()
	{
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto)
	{
		this.nomeProduto = nomeProduto;
	}
	public int getQtEstoqueProduto()
	{
		return qtEstoqueProduto;
	}
	public void setQtEstoqueProduto(int qtEstoqueProduto)
	{
		this.qtEstoqueProduto = qtEstoqueProduto;
	}
	
	public double getPrecoProduto() {
		return precoProduto;
	}

	public void setPrecoProduto(double precoProduto) {
		this.precoProduto = precoProduto;
	}

}
