package task1.AllStates;
import task1.Action;
/**
 * Interface representing a state 
 * tis is the father class of all State classes
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public interface State {

    /**
     * Performs a transition based on the current state and the given action.
     * @param action The action triggering the transition.
     * @return The resulting state after the transition.
     */
    public State transition(Action action);

    /**
     * Returns a string representation of the state.
     * @return The string representation of the state.
     */
    public String str();

    /**
     * Provides information about the current state and its possible transitions.
     * @return Information about the state and its transitions as a string.
     */
    public String info();
}
