package Spiel.Objects;

/**

This enum represents the various game objects 
*/
public enum GameObjects {
    GROUND('G'),
    LAVA('L'),
    AIROBSTACLE('O'),
    EMPTY(' '),
    GOAL('Z');
    

    private char symbol;

    GameObjects(char symbol) {
        this.symbol = symbol;
    }

    /**
    Returns the character that represents the object in the game .
    @return the character 
    */



    public char getSymbol() {
        return symbol;
    }
}
