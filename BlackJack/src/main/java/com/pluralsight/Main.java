package com.pluralsight;

import com.pluralsight.models.Card;
import com.pluralsight.models.Deck;
import com.pluralsight.models.Player;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Player> players = new ArrayList<>();

        System.out.print("Enter number of players: ");
        int numPlayers = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= numPlayers; i++){
            System.out.println("Name of players" + i + " ");
            players.add(new Player(scanner.nextLine()));
        }

        for (Player player: players){
            String card = "";
            Player.getHand().deal(new Card(card));
            Player.getHand().deal(new Card(card));
        }

        Player winner = null;
        int highestScore = 0;

        for (Player player : players){
            System.out.println(player.getName() + "s hand:" + Player.getHand());

            int score = Player.getHand().getValue();
            if (score > highestScore && score <= 21){
                highestScore = score;
                winner = player;
            }
        }
        if (winner != null){
            System.out.println("Winner is" + winner.getName() + "with a score of" + highestScore);
        }else {
            System.out.println("All players busted no winners");
        }
    }



}
