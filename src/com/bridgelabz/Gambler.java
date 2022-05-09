package com.bridgelabz;

public class Gambler {
    static final int STAKEPERDAY=100;
    static final int BETPERGAME=1;
    static int gamblerearn=100;

        public static void main(String[] args) {
            System.out.println("Stake per day is " + STAKEPERDAY);
            System.out.println("Bet per Game is " + BETPERGAME);

            while (gamblerearn > 50 && gamblerearn < 150) {
                int bet = (int) (Math.random() * 10) % 2 +1;
                switch (bet) {
                    case 1:
                        gamblerearn++;
                        System.out.println("Gambler won the game and the amount now is " + gamblerearn);
                        if (gamblerearn == 150) {
                        System.out.println("Gambler resigned for the day with " + gamblerearn);
                       }
                         break;

                    case 2:
                           gamblerearn--;
                           System.out.println("Gambler lost the game and the amount now is " + gamblerearn);
                           if (gamblerearn == 50) {
                             System.out.println("Gambler resigned for the day with " + gamblerearn);
                    }
                }


            }

        }
    }

