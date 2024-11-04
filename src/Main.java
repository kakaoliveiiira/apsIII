import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LojaVirtual loja = new LojaVirtual();
        CarrinhoCompras carrinho = new CarrinhoCompras();

        Produto p1 = new Produto(1, "Smartphone", "Modelo XYZ", 1500.0, 10);
        Produto p2 = new Produto(2, "Notebook", "Modelo ABC", 3000.0, 5);

        loja.adicionarProduto(p1);
        loja.adicionarProduto(p2);

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Menu ---");
            System.out.println("1. Listar Produtos");
            System.out.println("2. Adicionar Produto ao Carrinho");
            System.out.println("3. Remover Produto do Carrinho");
            System.out.println("4. Exibir Itens no Carrinho");
            System.out.println("5. Calcular Total da Compra");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    loja.listarProdutos();
                    break;
                case 2:
                    System.out.print("Digite o ID do produto: ");
                    int idProduto = scanner.nextInt();
                    Produto produto = loja.buscarProdutoPorId(idProduto);
                    if (produto != null) {
                        System.out.print("Digite a quantidade: ");
                        int quantidade = scanner.nextInt();
                        carrinho.adicionarItem(produto, quantidade);
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;
                case 3:
                    System.out.print("Digite o ID do produto para remover: ");
                    int idRemover = scanner.nextInt();
                    Produto produtoRemover = loja.buscarProdutoPorId(idRemover);
                    if (produtoRemover != null) {
                        carrinho.removerItem(produtoRemover);
                    } else {
                        System.out.println("Produto não encontrado no carrinho.");
                    }
                    break;
                case 4:
                    carrinho.exibirItens();
                    break;
                case 5:
                    System.out.println("Total da compra: " + carrinho.calcularTotal());
                    break;
                case 6:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }
}
