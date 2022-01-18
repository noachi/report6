package jp.ac.uryukyu.ie.e215715;

import java.util.ArrayList;

public class GemeMaster {
    private Field field = new Field(); 
    private ArrayList<Player> player_list = new ArrayList<Player>();
    private boolean isEnd;
    private boolean[] drawEnd = new boolean[2];

    GemeMaster(){
        player_list.add(new Player("プレイヤー"));
        player_list.add(new Player("ディーラー"));
        isEnd = false;
        drawEnd[0] = false;
        drawEnd[1] = false;

        for(int i=0;i<2;i++){
            player_list.get(0).addHand(field.draw());
            player_list.get(1).addHand(field.draw());
        }
    }

    public void start(){
        System.out.println("ゲームを開始します。");

        while(!isEnd){
            System.out.println("現在の手札");
            showHand(player_list);

            for(var player : player_list){
                if(player.isOver() || drawEnd[0] && drawEnd[1]){
                    isEnd = true;
                    showHand(player_list);
                    System.out.println(player_list.get(player_list.indexOf(player)==1 ? 0:1).getName()+"の勝ち！");
                    break;
                }

                if(player.getName() == "プレイヤー" && !drawEnd[0]){
                    var command_selector = new CommandSelector();
                    command_selector.addCommand("カードを引く");
                    command_selector.addCommand("カードを引かない");
                    
                    System.out.println(player.getName() + "のターン");
                    System.out.println("現在の手札の合計は" + player.calculate() + "です。");
                    int selector = command_selector.waitForUsersCommand("カードを引きますか？");
        
                    if(selector == 0){
                        player.addHand(field.draw());
                    }else{
                        drawEnd[0] = true;
                        break;
                    }    
                }else{
                    System.out.println(player.getName() + "のターン");
                    System.out.println("カードを引きますか？");
                    System.out.println("0:カードを引く");
                    System.out.println("1:カードを引かない");

                    if(player.calculate() <= 18){
                        System.out.println("0");  
                        player.addHand(field.draw());
                    }else{
                        System.out.println("1");
                        drawEnd[1] = true;
                        break;
                    }
                }
            }
        }
    }

    public void showHand(ArrayList<Player> player_list){
        int i = 0;
        for(var player : player_list){
            System.out.println("--" + player.getName() +  "--");
            if(player.getName() == "プレイヤー"){
                for(var card : player.getHand()){
                    System.out.println(card.getType() + "の" + card.getNumber());
                }
            }else{
                for(var card : player.getHand()){
                    if(i == 0){
                        System.out.println(card.getType() + "の" + card.getNumber());
                        i++;
                    }else{
                        System.out.println("???" + "の" + "???");
                    }
                }
            }
            
        }
        System.out.println("------------");
    }

    

    

    
}
