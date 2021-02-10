package com.company;

import java.util.ArrayList;

public class ShuffleManager {

    ArrayList<Integer> cards = new ArrayList<>();
    ArrayList<Integer> cardsShuffled = new ArrayList<>();

    public void shuffleCards(){
        for(int i = 1; i <= 52; i++){
            cards.add(i);
        }

        int max = 52;

        while(!cards.isEmpty()){
            int randomIndex = (int)((Math.random() * max));
            max--;
            cardsShuffled.add(cards.get(randomIndex));
            cards.remove(randomIndex);
        }
        System.out.println(cardsShuffled);
    }
}
