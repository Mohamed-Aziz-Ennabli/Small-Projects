package task1.AllStates;
import task1.Action;
/**
 * Class representing the SmugglersCove State.
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public class SmugglersCove implements State{

    @Override
    public State transition(Action action){
        if(action==Action.A){
            return new PiratesIsland();
        }else{
            return new TreasurIsland();
        }
    }
    @Override
    public String str(){
        return "SmugglersCove";
    }

    @Override
    public String info(){
        String S="This Position:    "+this.str()+"   possible destinations"+"  Action A -> "+this.transition(Action.A).str() +"  Action B ->"+this.transition(Action.B).str()  + "\n";
        return S;
    }
}