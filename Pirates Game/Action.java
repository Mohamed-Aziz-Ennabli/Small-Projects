package task1;
/**
 * Enum type representing actions in the finite automaton.
 * it represents directions that we can use to reach the goal State 
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public enum Action {
    A, // Action A
    B; // Action B

    /**
     * Returns a unique string representation of the action.
     * @return The string representation of the direction.
     */
    public char str() {
        return this.name().charAt(0);
    }
}
