package jp.ac.uryukyu.ie.e215715;
import java.util.ArrayList;

public class Player{
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();

    Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void addHand(Card card){
        hand.add(card);
    }

    public ArrayList<Card> getHand(){
        return hand;
    }

    public int calculate(){
        int num = 0;
        for(var card : hand){
            num += card.getIntegerNumber();
        }
        return num;
    }


    public Boolean isOver(){
        if(calculate() > 21){
            return true;
        }else{
            return false;
        }
    }

    // public abstract void execute();
}

