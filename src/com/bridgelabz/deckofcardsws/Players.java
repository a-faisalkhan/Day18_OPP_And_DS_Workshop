package com.bridgelabz.deckofcardsws;

import java.util.Scanner;

public class Players {
    int player;

    public void getPlayers() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Players betn 2 and 4");
        player = sc.nextInt();
        if (player <=4 || player <= 2) {
            getPlayers();
        } else{
            sequenceOfPlayers();
        }
    }
    public void sequenceOfPlayers(){
        System.out.println("Sequence of players");
        for(int i =0;i<player;i++){
            System.out.println("Sequence is " +(i+i) +"\n");
        }
    }
}
