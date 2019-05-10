package onlinebettingsystem;

public class Bet {

    private int betId;
    private int amount;
    private Player player;
    private Contestant contestant;

    public Bet(int betId, int amount, Player player, Contestant contestant){

        this.betId = betId;
        this.amount = amount;
        this.player = player;
        this.contestant = contestant;


    }



}


/*
Create a Bet class, this will represent the bets made by the Player. It has 4 private fields (all of them must be set through the constructor)
betId - a random number between 1000 - 9999
amount - an integer, it represents the amount of money made on the bet
player - it represents the owner of the bet
contestant - it represents the contestant the bet was made on

 */