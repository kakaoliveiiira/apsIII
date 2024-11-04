import java.util.ArrayList;
import java.util.List;

    class LojaVirtual {
        private List<Produto> produtos;

        public LojaVirtual() {
            this.produtos = new ArrayList<>();
        }

        public void adicionarProduto(Produto produto) {
            produtos.add(produto);
            System.out.println("Produto adicionado na loja: " + produto.getNome());
        }

        public void removerProduto(int id) {
            produtos.removeIf(produto -> produto.getId() == id);
            System.out.println("Produto removido da loja.");
        }

        public void listarProdutos() {
            produtos.forEach(System.out::println);
        }

        public Produto buscarProdutoPorId(int id) {
            return produtos.stream().filter(produto -> produto.getId() == id).findFirst().orElse(null);
        }
    }


