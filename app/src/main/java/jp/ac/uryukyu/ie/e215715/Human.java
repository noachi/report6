package jp.ac.uryukyu.ie.e215715;
import java.util.ArrayList;

abstract class Human{
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();

    Human(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
    
    public void addHand(Card card){
        hand.add(card);
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

    public abstract void execute();
}

