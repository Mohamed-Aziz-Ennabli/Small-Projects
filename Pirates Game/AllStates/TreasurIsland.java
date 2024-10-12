package task1.AllStates;
import task1.Action;
/**
 * Class representing the TreasurIsland  State.Which is the final State (Goal)
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public class TreasurIsland implements State{

    @Override
    public State transition(Action action){
        if(action==Action.A){
            return new TreasurIsland();
        }else{
            return new TreasurIsland();
        }
    }
    @Override
    public String str(){
        return "TreasurIsland";
    }

    @Override
    public String info(){
         String S="This Position:    "+this.str()+"  any other direction leads to here you  found the One Piece";
         return S;
    }
}