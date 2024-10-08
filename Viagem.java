public class Viagem {
    
    public static void main(String[] args) {
        
        CompanhiaAerea companhiaAerea = new CompanhiaAerea("Companhia ABC");
        Voo voo = new Voo("1234", 20, "Aeroporto A", "Aeroporto B");
        Passagem passagem = new Passagem(voo, "Bruna", 150.5, 49.5);

        companhiaAerea.adicionarVoo(voo);

        //for(int i = 1; i <= voo.getTotalAssentos(); i++) {
        //    voo.reservarAssento();
        //}

        voo.reservarAssento();
        System.out.println("Assentos disponíveis: " + voo.getAssentosDisponiveis());
        System.out.println("Valor total da passagem: " + passagem.calcularPrecoTotal());
        System.out.println("Aeroporto de Origem: " + voo.getAeroportoOrigem());
        System.out.println("Aeroporto de Destino: " + voo.getAeroportoDestino());

    }

}
