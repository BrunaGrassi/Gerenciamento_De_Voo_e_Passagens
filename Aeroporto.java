public class Aeroporto {
    private String nomeAeroporto;
    private String cidade;

    public Aeroporto(String nomeAeroporto, String cidade) {
        this.nomeAeroporto = nomeAeroporto;
        this.cidade = cidade;
    }

    public String getNomeAeroporto() {
        return nomeAeroporto;
    }

    public String getCidade() {
        return cidade;
    }
}
