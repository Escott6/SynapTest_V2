package edu.synapt.synaptest_v2.cardStructures;

/**
 * Created by Evan on 1/17/2018.
 */

public class FlashCard extends CardItem {

    private Category category;
    private Deck deck;
    private String content, answer;

    public FlashCard(){
    }

    /** flashcards consist of a category, a deck, a title, content, and an answer */
    public FlashCard(Category category, Deck deck, String title, String content, String answer){
        super(title);
        this.category = category;
        this.deck = deck;
        this.content = content;
        this.answer = answer;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Deck getDeck() {
        return deck;
    }

    public void setDeck(Deck deck) {
        this.deck = deck;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}
