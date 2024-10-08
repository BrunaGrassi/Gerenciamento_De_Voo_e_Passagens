public class Viagem {
    
    public static void main(String[] args) {
        
        CompanhiaAerea companhiaAerea = new CompanhiaAerea("Companhia ABC");
        Aeroporto aeroportoOrigem = new Aeroporto("Aeroporto X", "Brasília");
        Aeroporto aeroportoDestino = new Aeroporto("Aeroporto Y", "São Paulo");
        Voo voo = new Voo("1234", 20, aeroportoOrigem, aeroportoDestino);
        Passagem passagem = new Passagem(voo, "Bruna", 150.5, 49.5);

        companhiaAerea.adicionarVoo(voo);

        //for(int i = 1; i <= voo.getTotalAssentos(); i++) {
        //    voo.reservarAssento();
        //}

        voo.reservarAssento();
        System.out.println("Assentos disponíveis: " + voo.getAssentosDisponiveis());
        System.out.println("Valor total da passagem: " + passagem.calcularPrecoTotal());
        System.out.println("Aeroporto de origem: " + voo.getAeroportoOrigem());
        System.out.println("Aeroporto de destino: " + voo.getAeroportoDestino());

    }

}
