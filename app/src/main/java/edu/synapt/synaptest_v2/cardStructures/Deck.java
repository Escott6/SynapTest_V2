package edu.synapt.synaptest_v2.cardStructures;

/**
 * Created by Evan on 1/17/2018.
 */

import java.util.ArrayList;

public class Deck extends CardItem {
    private Category category;
    private ArrayList<FlashCard> flashCards;


    public Deck(){
    }

    /** Decks consist of a category, a deckName, and an arraylist of flashcards */
    public Deck(Category category, String deckName, ArrayList<FlashCard> flashCards){
        super(deckName);
        this.category = category;
        this.flashCards = flashCards;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ArrayList<FlashCard> getFlashCards() {
        return flashCards;
    }

    public void setFlashCards(ArrayList<FlashCard> flashCards) {
        this.flashCards = flashCards;
    }

}
