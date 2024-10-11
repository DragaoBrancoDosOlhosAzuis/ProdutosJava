package Produtos;
// O código faz parte do pacote "Produtos", que contém classes relacionadas, como Produto, ProdutoUsado e ProdutoImportado.

public class ProdutoImportado extends Produto {
    // A classe 'ProdutoImportado' estende a classe 'Produto', ou seja, herda seus atributos e métodos.
    // Representa um produto que, além de ter um nome e um preço, também possui uma taxa alfandegária.

    private double taxaAlfandega;
    // Atributo privado que representa a taxa alfandegária associada ao produto importado.

    public ProdutoImportado(String nome, double preco, double taxaAlfandega) {
        // Construtor da classe 'ProdutoImportado'.
        // Chama o construtor da superclasse 'Produto' para inicializar os atributos 'nome' e 'preco' e inicializa a 'taxaAlfandega' deste produto.
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public double precoTotal() {
        // Método público que calcula o preço total do produto importado.
        // Soma o preço do produto com a taxa alfandegária.
        return preco + taxaAlfandega;
    }

    @Override
    public String imprimirEtiqueta() {
        // Sobrescreve o método 'imprimirEtiqueta' da classe 'Produto'.
        // Retorna uma string formatada com o nome do produto, o preço total (que inclui a taxa alfandegária),
        // e a taxa alfandegária de forma detalhada.
        return nome + " (importado) $ " + String.format("%.2f", precoTotal()) 
                + " (Taxa alfândega: $ " + String.format("%.2f", taxaAlfandega) + ")";
        // Utiliza 'String.format("%.2f", ...)' para garantir que os valores numéricos apareçam com duas casas decimais.
    }
}
