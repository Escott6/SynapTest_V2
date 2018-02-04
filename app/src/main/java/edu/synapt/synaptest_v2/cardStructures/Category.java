package edu.synapt.synaptest_v2.cardStructures;

import java.util.ArrayList;

/**
 * Created by Evan on 1/17/2018.
 */

public class Category extends CardItem {

    public String name;
    public boolean isCourse;
    private ArrayList<Deck> decks;

    public static final String NAME_PREFIX = "Name_";

    public Category(){
    }

    /** A Category consists of a name and a list of decks */
    public Category(String name, ArrayList<Deck> decks){
        super(name);
        this.decks = decks;
    }


    public ArrayList<Deck> getDecks() {
        return decks;
    }

    public void setDecks(ArrayList<Deck> decks) {
        this.decks = decks;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCourse(boolean isCourse){
        this.isCourse = isCourse;
    }

}
