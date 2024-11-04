class ItemCarrinho {
        private Produto produto;
        private int quantidade;

        public ItemCarrinho(Produto produto, int quantidade) {
            this.produto = produto;
            this.quantidade = quantidade;
        }

        public Produto getProduto() { return produto; }
        public int getQuantidade() { return quantidade; }
        public double getTotal() { return produto.getPreco() * quantidade; }

        @Override
        public String toString() {
            return produto.getNome() + " | Quantidade: " + quantidade + " | Total: " + getTotal();
        }
    }


