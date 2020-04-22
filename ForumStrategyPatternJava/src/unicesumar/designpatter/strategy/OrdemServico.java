package unicesumar.designpatter.strategy;

import java.math.BigDecimal;
import java.util.ArrayList;

public class OrdemServico {

	private ArrayList<Produto> produtos = new ArrayList<Produto>();

	private String ordens() {
		BigDecimal ordensPreco = new BigDecimal("0");
		for(Produto : produtos) {
			ordensPreco = BigDecimal.add(produtos.calcularPrecoProduto());
		}
	}

	public void adicionarProduto(Produto produto) {
		produtos.add(produto);
	}

	public void deletarProduto(Produto produto) {
		if (produtos.contains(produto)) {
			produto.remove(produto);
		}
	}

}
