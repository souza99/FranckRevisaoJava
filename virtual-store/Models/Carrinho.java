package Models;

import java.util.Date;

public class Carrinho {
	
	private int idCarrinho;
	
	private Cliente cliente;
	
	Date dataCompra = new Date();
	
	public int getIdCarrinho() {
		return idCarrinho;
	}
	public void setIdCarrinho(int idCarrinho) {
		this.idCarrinho = idCarrinho;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Date getDataCompra() {
		return dataCompra;
	}
	
}
