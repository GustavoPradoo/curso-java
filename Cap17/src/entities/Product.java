package entities;

public class Product {

	private String nome;
	private Double preco;
	private Integer quantidade;
	
	public Product(String nome, Double preco, Integer quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public String getName() {
		return nome;
	}

	public void setName(String nome) {
		this.nome = nome;
	}

	public Double getPrice() {
		return preco;
	}

	public void setPrice(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantity() {
		return quantidade;
	}

	public void setQuantity(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double total() {
		return preco * quantidade;
	}
}