package Produtos;
// O código faz parte do pacote "Produtos", que contém classes relacionadas, como Produto, ProdutoUsado e ProdutoImportado.

public class Produto {
    // A classe 'Produto' é a classe base (superclasse) que representa um produto genérico com nome e preço.

    protected String nome;
    protected double preco;
    // Os atributos 'nome' e 'preco' são protegidos (protected), o que significa que podem ser acessados por subclasses
    // e outras classes no mesmo pacote, mas não diretamente por classes fora do pacote.

    public Produto(String nome, double preco) {
        // Construtor da classe 'Produto'.
        // Inicializa os atributos 'nome' e 'preco' com os valores fornecidos pelos parâmetros.
        this.nome = nome;
        this.preco = preco;
    }

    public String imprimirEtiqueta() {
        // Método público que retorna a etiqueta de preço do produto.
        // Este método pode ser sobrescrito (override) por subclasses para modificar a formatação ou adicionar mais informações.
        return nome + " $ " + String.format("%.2f", preco);
        // Utiliza 'String.format("%.2f", preco)' para garantir que o preço seja exibido com duas casas decimais.
    }
}
