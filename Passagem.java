public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;

    public Passagem(Voo voo, String nomePassageiro, double preco) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
    }

    public double calcularPrecoTotal() {
        return preco + preco * 0.10;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

}
