package jp.ac.uryukyu.ie.e215715;

public class Card {
    private String number;
    private String type;

    /**
     * コンストラクタ
     * @param number カードの番号
     * @param type カードのタイプ
     */
    Card(String number,String type){
        this.number = number;
        this.type = type;
    }

    /**
     * カードの番号を文字列型で返す
     * @return カード番号（文字列型）
     */
    public String getNumber(){
        return number;
    }

    /**
     * カードの型を文字列型で返す
     * @return カードタイプ（文字列型）
     */
    public String getType(){
        return type;
    }

    /**
     * 英語表記のカードを数字に変換する
     * @return　カード番号（整数型）
     */
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

