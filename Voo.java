public class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;
    private String aeroportoOrigem;
    private String aeroportoDestino;

    public Voo(String codigo, int totalAssentos, String aeroportoOrigem, String aeroportoDestino) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
        this.aeroportoOrigem = aeroportoOrigem;
        this.aeroportoDestino = aeroportoDestino;
    }

    public void reservarAssento() {

        if (assentosOcupados < totalAssentos){
            assentosOcupados++;
            System.out.println("Assento reservado!");
        } else {
            System.out.println("Não existem assentos livres.");
        }
        
    }

    public int getAssentosDisponiveis() {
        return totalAssentos - assentosOcupados;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getAeroportoOrigem() {
        return aeroportoOrigem;
    }

    public String getAeroportoDestino() {
        return aeroportoDestino;
    }

    //criada só pra teste, excluir depois
    public int getTotalAssentos() {
        return totalAssentos;
    }
}