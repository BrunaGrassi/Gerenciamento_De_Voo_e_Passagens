public class Voo {
    private String codigo;
    private int totalAssentos;
    private int assentosOcupados;

    public Voo(String codigo, int totalAssentos) {
        this.codigo = codigo;
        this.totalAssentos = totalAssentos;
        this.assentosOcupados = 0;
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
        return assentosOcupados;
    }

    public String getCodigo() {
        return codigo;
    }
}