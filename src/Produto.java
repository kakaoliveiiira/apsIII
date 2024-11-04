 class Produto {
        private int id;
        private String nome;
        private String descricao;
        private double preco;
        private int quantidadeEmEstoque;

        public Produto(int id, String nome, String descricao, double preco, int quantidadeEmEstoque) {
            this.id = id;
            this.nome = nome;
            this.descricao = descricao;
            this.preco = preco;
            this.quantidadeEmEstoque = quantidadeEmEstoque;
        }

        public int getId() { return id; }
        public String getNome() { return nome; }
        public double getPreco() { return preco; }
        public int getQuantidadeEmEstoque() { return quantidadeEmEstoque; }

        public void reduzirEstoque(int quantidade) throws Exception {
            if (quantidade > quantidadeEmEstoque) {
                throw new Exception("Estoque insuficiente para o produto: " + nome);
            }
            quantidadeEmEstoque -= quantidade;
        }

        @Override
        public String toString() {
            return nome + " - " + descricao + " | Preço: " + preco + " | Estoque: " + quantidadeEmEstoque;
        }
    }


