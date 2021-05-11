package com.mycompany.trabalho_n1;

public class Ajudante {
    
    static void usarMove() {
        Jogo.decisao = Jogo.sc.nextInt();
        System.out.println("\n");

        switch (Jogo.decisao) {
            case 1 -> {
                if (Jogo.seuPoke.getMovimento1().getPontos() > 0) {
                    Movimentos.ataque(Jogo.seuPoke, Jogo.oponentePoke, Jogo.seuPoke.getMovimento1());
                } else {
                    System.out.println("Nenhum ponto restante para este movimento!");
                    usarMove();
                }
            }
            case 2 -> {
                if (Jogo.seuPoke.getMovimento2().getPontos() > 0) {
                    Movimentos.ataque(Jogo.seuPoke, Jogo.oponentePoke, Jogo.seuPoke.getMovimento2());
                } else {
                    System.out.println("Nenhum ponto restante para este movimento!");
                    usarMove();
                }
            }
            case 3 -> {
                if (Jogo.seuPoke.getMovimento3().getPontos() > 0) {
                    Movimentos.ataque(Jogo.seuPoke, Jogo.oponentePoke, Jogo.seuPoke.getMovimento3());
                } else {
                    System.out.println("Nenhum ponto restante para este movimento!");
                    usarMove();
                }
            }
            case 4 -> {
                if (Jogo.seuPoke.getMovimento4().getPontos() > 0) {
                    Movimentos.ataque(Jogo.seuPoke, Jogo.oponentePoke, Jogo.seuPoke.getMovimento4());
                } else {
                    System.out.println("Nenhum ponto restante para este movimento!");
                    usarMove();
                }
            }
            case 5 -> {
                int k = 1;

                for (Pokemon p : Jogo.poke) {

                    System.out.print(k + " - " + p.getNome() + " é do tipo " + p.getTipo() + ". Tem " + p.getVida() + " pontos de saúde e sabe " + p.getMovimento1().getNome() + ", " + p.getMovimento2().getNome() + ", " + p.getMovimento3().getNome() + ", " + p.getMovimento4().getNome() + ".\n");
                    k++;
                }

                System.out.print("\nEscolha o número que corresponde ao Pokémon com o qual você gostaria de jogar na lista acima.\n>> ");
                int novaEscolha = Jogo.sc.nextInt();

                if (novaEscolha <= Jogo.poke.size() && novaEscolha > 0) {

                    Jogo.seuPoke = Jogo.poke.get(novaEscolha - 1);
                    System.out.println("Você selecionou " + Jogo.seuPoke.getNome());
                    System.out.println("Seu oponente foi selecionado " + Jogo.oponentePoke.getNome());

                } else {

                    Jogo.sc.close();
                    System.gc();
                    throw new IllegalArgumentException("\n\n" + "Escolha um número inteiro entre 1 e " + Jogo.poke.size()
                            + ", inclusive.\n");
                }
            }

            default -> throw new IllegalArgumentException("\n\n" + "Selecione um número inteiro entre 1 e 5, inclusive.");
        }
    }
    
    static void oponenteMovimento() {
        
    Jogo.decisaoOponente = Jogo.rand.nextInt(4);
        switch (Jogo.decisaoOponente) {
            case 0 -> {
                Movimentos.ataque(Jogo.oponentePoke, Jogo.seuPoke, Jogo.oponentePoke.getMovimento1());
                System.out.println(Jogo.oponentePoke.getNome() + " usava " + Jogo.oponentePoke.getMovimento1().getNome());
            }
            case 1 -> {
                Movimentos.ataque(Jogo.oponentePoke, Jogo.seuPoke, Jogo.oponentePoke.getMovimento2());
                System.out.println(Jogo.oponentePoke.getNome() + " usava " + Jogo.oponentePoke.getMovimento2().getNome());
            }
            case 2 -> {
                Movimentos.ataque(Jogo.oponentePoke, Jogo.seuPoke, Jogo.oponentePoke.getMovimento3());
                System.out.println(Jogo.oponentePoke.getNome() + " usava " + Jogo.oponentePoke.getMovimento3().getNome());
            }
            case 3 -> {
                Movimentos.ataque(Jogo.oponentePoke, Jogo.seuPoke, Jogo.oponentePoke.getMovimento4());
                System.out.println(Jogo.oponentePoke.getNome() + " usava " + Jogo.oponentePoke.getMovimento4().getNome());
            }
        }

    static void checarVida() {
        if (Jogo.oponentePoke.getVida() <= 0.0 && Jogo.oponentePoke.getVida() > 0.0) {

            System.out.println("Sinto muito, seu oponente venceu...");
            System.out.println(Jogo.seuPoke.getNome() + " desmaiou.");
            System.out.println(Jogo.oponentePoke.getNome() + " tem " + Jogo.oponentePoke.getVida() + " health left.");
            System.exit(0);

        } else if (Jogo.seuPoke.getVida() > 0.0 && Jogo.oponentePoke.getVida() <= 0.0) {

            System.out.println("Parabèns! Você venceu!");
            System.out.println("Do inimigo " + Jogo.oponentePoke.getNome() + " desmaiou.");
            System.out.println(Jogo.seuPoke.getNome() + " tem " + Jogo.oponentePoke.getVida() + " saúde retante.");
            System.exit(0);

        }
    }
    static void listaMovimentos() {
        System.out.println(Jogo.seuPoke.getNome() + " conhece\n1 - " + Jogo.seuPoke.getMovimento1().getNome() + "\t2 - " + Jogo.seuPoke.getMovimento2().getNome() + "\n3 - " + Jogo.seuPoke.getMovimento3().getNome() + "\t4 - " + Jogo.seuPoke.getMovimento4().getNome());
        System.out.print("Digite o número correspondente ao movimento que você gostaria " + Jogo.seuPoke.getNome() + " de usar. Selecione '5' para mudar para um Pokémon diferente.\n>> ");
   }  
    static void infoUpdate() {
        System.out.println(Jogo.seuPoke.getNome() + " tem " + Jogo.seuPoke.getVida() + " saúde restante.");
        System.out.println("Do inimigo " + Jogo.oponentePoke.getNome() + " has " + Jogo.oponentePoke.getVida() + " saúde restante.\n");
    }
 }   