public class Passagem {
    private Voo voo;
    private String nomePassageiro;
    private double preco;
    private double taxaEmbarque;

    public Passagem(Voo voo, String nomePassageiro, double preco, double taxaEmbarque) {
        this.voo = voo;
        this.nomePassageiro = nomePassageiro;
        this.preco = preco;
        this.taxaEmbarque = taxaEmbarque;
    }

    public double calcularPrecoTotal() {
        return preco + taxaEmbarque;
    }

    public String getNomePassageiro() {
        return nomePassageiro;
    }

}
