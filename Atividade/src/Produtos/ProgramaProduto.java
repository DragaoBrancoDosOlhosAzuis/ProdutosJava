package Produtos;
// O código faz parte do pacote "Produtos", que provavelmente contém outras classes relacionadas, como Produto, ProdutoUsado e ProdutoImportado.

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

// Importa bibliotecas necessárias:
// - ArrayList e List para trabalhar com listas dinâmicas.
// - Locale para definir o formato de saída (como números e datas).
// - Scanner para a entrada de dados via terminal.

public class ProgramaProduto {
    public static void main(String[] args) {
        // Definição do método principal, onde o programa será executado.
        
        Locale.setDefault(Locale.US);
        // Define o padrão de localidade para os EUA, ajustando a saída de números decimais (usa ponto ao invés de vírgula).
        
        Scanner sc = new Scanner(System.in);
        // Cria um objeto Scanner para capturar a entrada do usuário.

        List<Produto> produtos = new ArrayList<>();
        // Cria uma lista de objetos do tipo Produto para armazenar os produtos inseridos pelo usuário.

        System.out.print("Digite o número de produtos: ");
        int n = sc.nextInt();
        // Solicita ao usuário o número de produtos que ele deseja inserir e armazena esse valor na variável 'n'.

        for (int i = 1; i <= n; i++) {
            // Um laço 'for' que itera de 1 até 'n', onde 'i' representa o número do produto sendo inserido.

            System.out.println("Dados do produto #" + i + ":");
            // Exibe o número do produto que está sendo inserido.

            System.out.print("Produto comum, usado ou importado (c/u/i)? ");
            char tipo = sc.next().charAt(0);
            // Pergunta ao usuário se o produto é comum ('c'), usado ('u') ou importado ('i') e armazena a resposta como um caractere.
            // O método 'next().charAt(0)' captura o primeiro caractere da entrada.

            System.out.print("Nome: ");
            sc.nextLine(); // consumir a quebra de linha
            String nome = sc.nextLine();
            // Solicita o nome do produto. O 'sc.nextLine()' anterior consome a quebra de linha deixada após o uso do 'next()' para evitar problemas de leitura de strings.

            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            // Solicita o preço do produto e armazena o valor como um 'double'.

            if (tipo == 'c') {
                // Se o produto for comum ('c'), cria um novo objeto Produto com nome e preço, e o adiciona à lista 'produtos'.
                produtos.add(new Produto(nome, preco));
            } else if (tipo == 'u') {
                // Se o produto for usado ('u'), solicita a data de fabricação.
                System.out.print("Data de fabricação (DD/MM/YYYY): ");
                String dataFabricacao = sc.next();
                // Cria um objeto ProdutoUsado com o nome, preço e data de fabricação, e o adiciona à lista.
                produtos.add(new ProdutoUsado(nome, preco, dataFabricacao));
            } else if (tipo == 'i') {
                // Se o produto for importado ('i'), solicita a taxa de alfândega.
                System.out.print("Taxa alfândega: ");
                double taxaAlfandega = sc.nextDouble();
                // Cria um objeto ProdutoImportado com nome, preço e taxa de alfândega, e o adiciona à lista.
                produtos.add(new ProdutoImportado(nome, preco, taxaAlfandega));
            }
        }

        System.out.println("\nETIQUETAS DE PREÇO:");
        // Exibe uma mensagem para indicar que as etiquetas de preço serão listadas.

        for (Produto produto : produtos) {
            // Um laço 'for-each' que percorre todos os produtos da lista 'produtos'.
            // Para cada produto, chama o método 'imprimirEtiqueta()' que retorna uma string com as informações formatadas do produto.
            System.out.println(produto.imprimirEtiqueta());
        }

        sc.close();
        // Fecha o objeto Scanner, liberando o recurso.
    }
}
