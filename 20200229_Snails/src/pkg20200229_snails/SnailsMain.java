/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg20200229_snails;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lina
 */
public class SnailsMain {

    /**
     * @param args the command line arguments
     */
    public static final int finish = 1000;
    public static final int noOfSnails = 8;

    public static void main(String[] args) {

        Snail s1 = new Snail("snail-1");
        Snail s2 = new Snail("snail-2");
        Snail s3 = new Snail("snail-3");
        Snail s4 = new Snail("snail-4");
        Snail s5 = new Snail("snail-5");
        Snail s6 = new Snail("snail-6");
        Snail s7 = new Snail("snail-7");
        Snail s8 = new Snail("snail-8");

        class SnailRace implements Runnable {

            @Override
            public void run() {
                s1.start();
                s2.start();
                s3.start();
                s4.start();
                s5.start();
                s6.start();
                s7.start();
                s8.start();

                while (true) {
                    synchronized (Snail.class) {
                        if (Snail.times.size() == noOfSnails) {
                            break;
                        }
                    }
                }
                System.out.println("Snail winner is: " + Snail.winner);
            }
        }
        SnailRace rase1 = new SnailRace();
        Thread go = new Thread(rase1);

        go.start();
//        try {
//            go.join();
//
//        } catch (InterruptedException ex) {
//            //Ignore
//        }
//        class SnailWinner implements Runnable {
//
//            @Override
//            public void run() {
//                System.out.println("The Winner snail is: " + Snail.winner);
//            }
//        }
//        SnailWinner winner = new SnailWinner();
//        Thread done = new Thread(winner);
//        done.start();

    }

}
