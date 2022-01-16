package jp.ac.uryukyu.ie.e215715;

public class Card {
    private String number;
    private String type;

    Card(String number,String type){
        this.number = number;
        this.type = type;
    }

    // public void init(){
    //     numberList.add("A"); 
    //     numberList.add("2"); 
    //     numberList.add("3");
    //     numberList.add("4");
    //     numberList.add("5");
    //     numberList.add("6"); 
    //     numberList.add("7"); 
    //     numberList.add("8"); 
    //     numberList.add("9"); 
    //     numberList.add("10"); 
    //     numberList.add("J"); 
    //     numberList.add("Q"); 
    //     numberList.add("K");
        
    //     Type.add("ハート");
    //     Type.add("ダイヤ");
    //     Type.add("クローバー");
    //     Type.add("スペード");
    
        
    //     for(var type : Type){
    //         for(var Number : numberList){
    //             CardList.add(new Card(Number,type));
    //         }
    //     }

        
    // }

    public String getNumber(){
        return number;
    }

    public String getType(){
        return type;
    }

    public int getIntegerNumber(){
        return Integer.parseInt(getNumber());
    }
}

