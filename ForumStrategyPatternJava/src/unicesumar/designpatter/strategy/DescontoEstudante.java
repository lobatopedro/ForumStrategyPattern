package unicesumar.designpatter.strategy;

import java.math.BigDecimal;

public class DescontoEstudante implements DescontoProduto {

	public BigDecimal calcularDesc(BigDecimal precoProduto) {
		BigDecimal descontoProduto = new BigDecimal("1.2");
		return precoProduto.multiply(descontoProduto);
	}
}
