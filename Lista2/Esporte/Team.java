package Lista2.Esporte;

class Team {
    String nomeTime;
    String corUniforme;
    int quantidadeJogadores;
    int posicaoCampeonato;

      Team(String nomeTime, String unicor, int qtj, int pc){
         this.nomeTime = nomeTime;
         corUniforme = unicor;
         quantidadeJogadores = qtj;
         posicaoCampeonato = pc;
     }

     void imprimirTime(){
         System.out.println("Time: " + nomeTime);
         System.out.println("Cor Uniforme: " + corUniforme);
         System.out.println("Quantidade de Jogafores: " + quantidadeJogadores );
         System.out.println("Posição no Campeonato: " + posicaoCampeonato);
}
}