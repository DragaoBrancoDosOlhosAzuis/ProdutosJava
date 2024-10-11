package Produtos;
// O código faz parte do pacote "Produtos", que contém classes relacionadas, como Produto, ProdutoUsado e ProdutoImportado.

public class ProdutoUsado extends Produto {
    // A classe 'ProdutoUsado' estende a classe 'Produto', ou seja, herda seus atributos e métodos.
    // Representa um produto usado que, além do nome e preço, possui uma data de fabricação.

    private String dataFabricacao;
    // Atributo privado que armazena a data de fabricação do produto usado.

    public ProdutoUsado(String nome, double preco, String dataFabricacao) {
        // Construtor da classe 'ProdutoUsado'.
        // Chama o construtor da superclasse 'Produto' para inicializar os atributos 'nome' e 'preco', 
        // e inicializa o atributo 'dataFabricacao' com a data passada como parâmetro.
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    @Override
    public String imprimirEtiqueta() {
        // Sobrescreve o método 'imprimirEtiqueta' da classe 'Produto'.
        // Retorna uma string formatada com o nome do produto, o preço (formatado com duas casas decimais) 
        // e a data de fabricação, indicando que o produto é usado.
        return nome + " (usado) $ " + String.format("%.2f", preco) 
                + " (Data de fabricação: " + dataFabricacao + ")";
        // O uso de 'String.format("%.2f", preco)' garante que o preço apareça com duas casas decimais.
    }
}
