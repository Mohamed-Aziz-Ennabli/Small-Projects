package task1.AllStates;
import task1.Action;
/**
 * Class representing the MutineersIsland  State.
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public class MutineersIsland implements State{

    @Override
    public State transition(Action action){
        if(action==Action.B){
            return new DeadManIsland();
        }else{
            return new SmugglersCove();
        }
    }
    @Override
    public String str(){
        return "MutineersIsland";
    }

    @Override
    public String info(){
        String S="This Position:    "+this.str()+"   possible destinations"+"  Action A -> "+this.transition(Action.A).str() +"  Action B ->"+this.transition(Action.B).str()  + "\n";
        return S;
    }
}