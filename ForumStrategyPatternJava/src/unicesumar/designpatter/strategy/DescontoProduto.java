package unicesumar.designpatter.strategy;

import java.math.BigDecimal;

public interface DescontoProduto {
	
	BigDecimal calcularDesc(BigDecimal precoProduto);

}
