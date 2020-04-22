package unicesumar.designpatter.strategy;

import java.math.BigDecimal;

public class Produto {
	
	private String nomeProduto;
	private BigDecimal precoProduto;
	private DescontoProduto descontoProdStrategy;
	
	public Produto(String nomeProduto, BigDecimal precoProduto) {
		this.nomeProduto = nomeProduto;
		this.precoProduto = precoProduto;
		this.descontoProdStrategy = new SemDesconto();
	}
	
	public Produto(String nomeProduto2, int i) {}

	public BigDecimal calcularPrecoProduto() {
		return descontoProdStrategy.calcularDesc(precoProduto);
	}
	
	public void aplicarDesconto(DescontoProduto desconto) {
		this.descontoProdStrategy = desconto;
	}

	public void remove(Produto produto) {
		this.remove(produto);
	}

}
