package com.mycompany.trabalho_n1;

import com.mycompany.trabalho_n1.Continuacao.PokemonAgua;
import com.mycompany.trabalho_n1.Continuacao.PokemonEletrico;
import com.mycompany.trabalho_n1.Continuacao.PokemonFogo;
import com.mycompany.trabalho_n1.Continuacao.PokemonGelo;
import com.mycompany.trabalho_n1.Continuacao.PokemonGrama;
import com.mycompany.trabalho_n1.Continuacao.PokemonPsiquico;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import com.mycompany.trabalho_n1.Ajudante;

public class Jogo {
    
     static Scanner sc = new Scanner(System.in);
     static Random rand = new Random();
     static Pokemon seuPoke = new Pokemon();
     static Pokemon oponentePoke = new Pokemon();
     static int decisao = 0;
     static int decisaoOponente = 0;
     static ArrayList<Pokemon> poke = new ArrayList<Pokemon>();
     
      public static void main(String[] args) {

        int suaEscolha;
        int escolhaOponente;

        Pokemon[][] pokemons = { PokemonEletrico.p, PokemonFogo.p, PokemonGrama.p, PokemonGelo.p, PokemonPsiquico.p, PokemonAgua.p};

        for (Pokemon[] pokeArr : pokemons) {
            poke.addAll(Arrays.asList(pokeArr));
        }

        poke.sort((poke1, poke2) -> poke1.getTipo().compareTo(poke2.getTipo()));

        int k = 1;
  
        for (Pokemon p : poke) {
            System.out.printf("%s - %s is é do tipo %s. Tem %s pontos de saúde e sabe %s, %s, %s, %s.\n",
                    Integer.toString(k), p.getNome(), p.getTipo().toString(), Double.toString(p.getVida()),
                    p.getMovimento1().getNome(), p.getMovimento2().getNome(), p.getMovimento3().getNome(), p.getMovimento4().getNome());

            k++;
        }

        System.out.print(
                "\nChoose the number that corresponds to the Pokemon you would like to play with in the list above.\n>> ");
        suaEscolha = sc.nextInt();
        System.out.println("\n");
        escolhaOponente = rand.nextInt(poke.size());

        if (suaEscolha <= poke.size() && suaEscolha > 0) {

            seuPoke = poke.get(suaEscolha - 1);
            oponentePoke = poke.get(escolhaOponente);
            System.out.println("Você selecionou " + seuPoke.getNome());
            System.out.println("Seu oponente selecionou " + oponentePoke.getNome());

        } else {

            sc.close();
            throw new IllegalArgumentException(
                    "\n\n" + "Escolha um número inteiro entre 1 e " + poke.size() + ", inclusive.\n");
        }
        
        while (seuPoke.getVida() > 0.0 && oponentePoke.getVida() > 0.0) {

            Ajudante.infoUpdate();

            Ajudante.listaMovimentos();

            Ajudante.usarMove();

            Ajudante.checarVida();

            Ajudante.oponenteMovimento();

            Ajudante.checarVida();

        }
        
        sc.close();
        System.exit(0);

    } 
}