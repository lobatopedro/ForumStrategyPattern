package unicesumar.designpatter.strategy;

public class MainStrategy {
	
	public static void main(String[] args) {
	
		Produto p1 = new Produto("Bolacha Trakinas", 4);
		Produto p2 = new Produto("Coca Cola", 5);
		Produto p3 = new Produto("Sorvete de chocolate", 6);
		
		p1.aplicarDesconto(new DescontoNovoCliente());
		p2.aplicarDesconto(new DescontoEstudante());
		
		OrdemServico ordem = new OrdemServico();
		ordem.adicionarProduto(p1);
		ordem.adicionarProduto(p2);
		ordem.adicionarProduto(p3);
		
		System.out.println("Preço total do produto eh: " + ordem.ordensPreco());
	}

}
