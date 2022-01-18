package jp.ac.uryukyu.ie.e215715;
import java.util.ArrayList;

public class Player{
    private String name;
    private ArrayList<Card> hand = new ArrayList<Card>();

    /**
     * コンストラクタ
     * @param name
     */
    Player(String name){
        this.name = name;
    }

    /**
     * プレイヤー、ディーラーの名前を取得する
     * @return　名前
     */
    public String getName(){
        return name;
    }
    
    /**
     * 追加した手札
     * @param card
     */
    public void addHand(Card card){
        hand.add(card);
    }

    /**
     *　持っている手札全てをリストに保存
     * @return　手札
     */
    public ArrayList<Card> getHand(){
        return hand;
    }

    /**
     * 所持している手札の数の合計を計算する
     * @return　数字の合計
     */
    public int calculate(){
        int num = 0;
        for(var card : hand){
            num += card.getIntegerNumber();
        }
        return num;
    }

    /**
     * ゲームが終わる判定
     * @return　どちらかが21を超えたらゲーム終了
     */
    public Boolean isOver(){
        if(calculate() > 21){
            return true;
        }else{
            return false;
        }
    }

    // public abstract void execute();
}

