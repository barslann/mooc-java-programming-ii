
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bekirarslan
 */
public class Hand implements Comparable<Hand>{
    private ArrayList<Card> cards;

    public Hand() {
        cards = new ArrayList<>();
    }
    
    
    
    public void add(Card card){
        cards.add(card);
    }
    public void print() {
        for (Card card : cards) {
            System.out.println(card);
        } 
   }
    
    public void sort(){
        Collections.sort(cards);
    }
    
    public int getTotalValue(){
        int total = 0;
            for (Card card : cards) {
                total += card.getValue();
            }
         return total;
    }
    
    public void sortBySuit(){
         Collections.sort(cards, new BySuitInValueOrder());
    }

    @Override
    public int compareTo(Hand o) {
        return this.getTotalValue() - o.getTotalValue();
    }
}
