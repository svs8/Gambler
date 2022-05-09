package com.bridgelabz;

public class Gambler {
    static final int STAKEPERDAY=100;
    static final int BETPERGAME=1;

        public static void main(String[] args) {
            System.out.println("Stake per day is "+ STAKEPERDAY );
            System.out.println("Bet per Game is "+ BETPERGAME );
               int gamblerearn=0;
               int gamblerlost=0;
                int game = (int) (Math.random() * 10) % 2;
                if(game==1)
                {

                    gamblerearn=STAKEPERDAY+1;
                    System.out.println("Gambler won the game and the amount now is "+gamblerearn);

                }
                else{
                    gamblerlost=STAKEPERDAY-1;
                    System.out.println("gambler lost the game and the amount now is "+gamblerlost);
                }


            }

        }

