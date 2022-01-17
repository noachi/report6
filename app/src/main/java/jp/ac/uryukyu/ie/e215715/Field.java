package jp.ac.uryukyu.ie.e215715;
import java.util.Random;
import java.util.ArrayList;

public class Field {
    private ArrayList<String>numberList = new ArrayList<String>();
    private ArrayList<String>Type = new ArrayList<String>();
    private ArrayList<Card> cards = new ArrayList<>();
    private ArrayList<Integer> IntegernumberList = new ArrayList<Integer>();
    Field(){
        numberList.add("A"); 
        numberList.add("2"); 
        numberList.add("3");
        numberList.add("4");
        numberList.add("5");
        numberList.add("6"); 
        numberList.add("7"); 
        numberList.add("8"); 
        numberList.add("9"); 
        numberList.add("10"); 
        numberList.add("J"); 
        numberList.add("Q"); 
        numberList.add("K");

        for(var number : numberList){
            if(number == "A"){
                IntegernumberList.add(1);
            }else if(number == "J" || number == "Q" || number == "K"){
                IntegernumberList.add(10);
            }else{
                IntegernumberList.add(Integer.parseInt(number));
            }
        }
            
        Type.add("ハート");
        Type.add("ダイヤ");
        Type.add("クローバー");
        Type.add("スペード");
        
            
        for(var type : Type){
            for(var Number : numberList){
                cards.add(new Card(Number,type));
            } 
        }            
    }

    public ArrayList<Card> first(){
        ArrayList<Card> result = new ArrayList<Card>();
        for(int i=0;i<2;i++){
            result.add(draw());
        }
        return result;
    }

    public Card draw(){
        Random ra = new Random();
        int selector = ra.nextInt(cards.size());
        Card resalt = cards.get(selector);
        cards.remove(selector);
        return resalt;
    }


}
