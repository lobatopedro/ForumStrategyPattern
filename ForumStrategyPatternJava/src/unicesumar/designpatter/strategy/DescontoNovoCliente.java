package unicesumar.designpatter.strategy;

import java.math.BigDecimal;

public class DescontoNovoCliente implements DescontoProduto {

	public BigDecimal calcularDesc(BigDecimal precoProduto) {
		BigDecimal descontoProduto = new BigDecimal("0.7");
		return precoProduto.multiply(descontoProduto);
	}
}
