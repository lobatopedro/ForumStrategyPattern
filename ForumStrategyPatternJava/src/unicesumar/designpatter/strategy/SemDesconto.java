package unicesumar.designpatter.strategy;

import java.math.BigDecimal;

public class SemDesconto implements DescontoProduto{
	
	public BigDecimal calcularDesc(BigDecimal precoProduto) {
		return precoProduto;
	}

}
