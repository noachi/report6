package jp.ac.uryukyu.ie.e215715;

public class Card {
    private String number;
    private String type;

    Card(String number,String type){
        this.number = number;
        this.type = type;
    }

    public String getNumber(){
        return number;
    }

    public String getType(){
        return type;
    }

    public int getIntegerNumber(){
        if(number == "A"){
            return 1;
        }else if(number == "J" || number == "Q" || number == "K"){
            return 10;
        }else{
            return Integer.parseInt(getNumber());
        }
        
    }

}

