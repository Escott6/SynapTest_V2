package edu.synapt.synaptest_v2.cardStructures;

/**
 * Created by Evan on 1/17/2018.
 */

public abstract class CardItem {

    private String title;
    private long id;
    private int color;


    protected CardItem(){

    }

    protected CardItem(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public long getId(){
        return id;
    }

    public void setId(long ID){
        this.id = ID;
    }

    public int getColor(){
        return color;
    }

    public void setColor (int color){
        this.color = color;
    }
}
