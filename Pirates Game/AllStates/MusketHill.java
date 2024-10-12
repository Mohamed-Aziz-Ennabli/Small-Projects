package task1.AllStates;
import task1.Action;
/**
 * Class representing the MusketHill State.
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */

public class MusketHill implements State{

    @Override
    public State transition(Action action){
        if(action==Action.A){
            return new PiratesIsland();
        }else{
            return new MutineersIsland();
        }
    }
    @Override
    public String str(){
        return "MusketHill";
    }

    @Override
    public String info(){
        String S="This Position:    "+this.str()+"   possible destinations"+"  Action A -> "+this.transition(Action.A).str() +"  Action B ->"+this.transition(Action.B).str()  + "\n";
        return S;
    }
}