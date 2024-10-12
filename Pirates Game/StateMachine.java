package task1;
import task1.AllStates.*;
import java.util.Scanner;
/**
 * Class representing the finite state machine.
 * @author Mohamed Aziz Ennabli
 * @version 13/05/2024
 */
public class StateMachine {
    private State currentState;  
    private boolean isGoalReached; 

    /**
     * Constructs a state machine 
     * initial state set to Pirates' Island.
     */
    public StateMachine() {
        this.currentState = new PiratesIsland(); 
        this.isGoalReached = false; 
    }

    /**
     * Performs a transition based on the given action.
     * @param action gives the direction.
     */
    public void doTransition(Action action) {
        // Transition to the next state based on the current state and the action
        this.currentState = this.currentState.transition(action);

        
        if (this.currentState instanceof TreasurIsland) {
            this.isGoalReached = true;
        }
    }

    /**
     * Returns the Name of the  current state 
     * @return The string representation of the current state.
     */
    public String getCurrentState() {
        return this.currentState.str();
    }

    /**
     * helps to knowwether the final state was reached or not 
     * @return True if the goal state has been reached,
     */
    public boolean isGoalReached() {
        return this.isGoalReached;
    }

    /**
     * Main method .
     * @author Mohamed Aziz Ennabli
     * @version 13/05/2024.
     */
    public static void main(String[] args) {
        
        StateMachine stateMachine = new StateMachine();
        Scanner scanner = new Scanner(System.in);
        String res=stateMachine.getCurrentState();

        // Loop until the goal state is reached
        while (!stateMachine.isGoalReached()) {
            System.out.println(stateMachine.getCurrentState());
            System.out.println(stateMachine.currentState.info());

            System.out.println("Choose action (A/B): ");

            String input = scanner.nextLine().toUpperCase();


            // Validate the user input
            if (input.equals("A") || input.equals("B")) {
                stateMachine.doTransition(Action.valueOf(input));
                res+="--->";
                res+=stateMachine.getCurrentState();
            } else {
                // Invalid input
                System.out.println("Invalid action. Please choose 'A' or 'B'.");
            }
        }

        /*System.out.println(stateMachine.getCurrentState());
        System.out.println(stateMachine.currentState.info());
        stateMachine.doTransition(Action.B);
        System.out.println(stateMachine.getCurrentState());
        System.out.println(stateMachine.currentState.info());
        stateMachine.doTransition(Action.B);
        System.out.println(stateMachine.getCurrentState());
        System.out.println(stateMachine.currentState.info());
        stateMachine.doTransition(Action.A);
        System.out.println(stateMachine.getCurrentState());
        System.out.println(stateMachine.currentState.info());
        stateMachine.doTransition(Action.B);
        System.out.println(stateMachine.getCurrentState());
        System.out.println(stateMachine.currentState.info());*/
        
        

        // Check if the goal state has been reached
        if (stateMachine.isGoalReached()) {
            System.out.println(res);
        } else {
            System.out.println("Goal state (Treasure Island) not reached yet.");
        }
    }
}
