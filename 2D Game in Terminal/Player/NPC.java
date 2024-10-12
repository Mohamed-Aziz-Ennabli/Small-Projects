package Spiel.Player;


public class NPC {
    private int xCoordinate;
    private boolean isCrouching;

    /*
     * The Constructor of NPC
    */


    public NPC() {
        // Standardkonstruktor
        this.xCoordinate = 0; // Startposition
        this.isCrouching = false; 
    }

    public void standUp() {
        isCrouching = false;
    }

    public void crouch() {
        isCrouching = true;
    }

    public void walkRight() {        
        xCoordinate += 1; // Bewegung um 1 nach rechts    
    }

    public void dashRight() {
        // Der NPC kann nur dashen, wenn er steht
        if (!isCrouching) {
            xCoordinate += 2; // Bewegung um 2 nach rechts
        }
    }

    // Getter und Setter für xCoordinate
    public int getXCoordinate() {
        return xCoordinate;
    }

    public void setXCoordinate(int xCoordinate) {
        this.xCoordinate = xCoordinate;
    }

    /*
     * Returns the status of the player NPC
     * is Craouchung or not 
     * @return isCrouching type of Boolean 
     */


    // Getter für isCrouching
    public boolean isCrouching() {
        return isCrouching;
    }
}
