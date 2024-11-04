import java.util.ArrayList;
import java.util.List;

    class CarrinhoCompras {
        private List<ItemCarrinho> itens;

        public CarrinhoCompras() {
            this.itens = new ArrayList<>();
        }

        public void adicionarItem(Produto produto, int quantidade) {
            try {
                produto.reduzirEstoque(quantidade);
                itens.add(new ItemCarrinho(produto, quantidade));
                System.out.println("Produto adicionado ao carrinho com sucesso!");
            } catch (Exception e) {
                System.out.println("Erro: " + e.getMessage());
            }
        }

        public void removerItem(Produto produto) {
            itens.removeIf(item -> item.getProduto().getId() == produto.getId());
            System.out.println("Produto removido do carrinho.");
        }

        public void exibirItens() {
            if (itens.isEmpty()) {
                System.out.println("O carrinho está vazio.");
            } else {
                itens.forEach(System.out::println);
            }
        }

        public double calcularTotal() {
            return itens.stream().mapToDouble(ItemCarrinho::getTotal).sum();
        }
    }


