package jp.ac.uryukyu.ie.e215715;

public class Player extends Human {
    Player(String name){
        super(name);
    }

    @Override
    public void execute(){
        
        var command_selector = new CommandSelector();
        command_selector.addCommand();

        
    }
}
