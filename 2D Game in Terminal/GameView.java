package Spiel;

import Spiel.Player.NPC;
import Spiel.Objects.GameObjects;


/**
        * This Class is the Simulation of the Game and creats the Gameboard.
        in This Class you have access to the Gameboard and you can make the game difficulty as you want bey changing the constructur
        * @author Mohamed Aziz Ennabli 
        * @version 21.04.2024
    */

public class GameView {
    private GameObjects[][] gameBoard;
    private NPC npc;

    public GameView() {
        // Initialisiere das 2D-GameObject-Array 
        gameBoard = new GameObjects[3][20];

        

        // Jede Spalte wird mit bestimmt Gameobject gefühlt
        for (int i = 0; i < gameBoard[0].length; i++) {
            switch (i) {
                case 0:
                    //Spalte 0 und zeilen 0,1,2
                    gameBoard[2][i]=GameObjects.GROUND;   
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;

                    break;
                case 2:
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.AIROBSTACLE;
                    gameBoard[2][i]=GameObjects.GROUND;
                    break;
                case 4:
                    gameBoard[2][i]=GameObjects.LAVA;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;
                    break;
                case 6:
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.AIROBSTACLE;
                    gameBoard[2][i]=GameObjects.GROUND;
                    break;
                case 8:
                    gameBoard[2][i]=GameObjects.LAVA;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;
                    break;
                case 10:
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.AIROBSTACLE;
                    gameBoard[2][i]=GameObjects.GROUND;
                    break;
                case 12:
                    gameBoard[2][i]=GameObjects.LAVA;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;
                    break;
                case 14:
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.AIROBSTACLE;
                    gameBoard[2][i]=GameObjects.GROUND;
                    break;
                case 16:
                    gameBoard[2][i]=GameObjects.LAVA;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;   
                    break;
                case 18:
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.AIROBSTACLE;
                    gameBoard[2][i]=GameObjects.GROUND;   
                    break;
                case 19:
                    gameBoard[2][i]=GameObjects.GOAL;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;
                    break;
                default:
                    gameBoard[2][i]=GameObjects.GROUND;
                    gameBoard[1][i]=GameObjects.EMPTY;
                    gameBoard[0][i]=GameObjects.EMPTY;
                    break;
        
            }

        }
    
        npc = new NPC();
    }


    /**
     *  string representation of the current game state.
     * if the player is craouchung the Carrecter will not be shown on the first line 
     * every move of the player (NPC) will be here represented 
     * @return A string visualisation of the gameboard.
    */



    public String str() {
        
        StringBuilder sb = new StringBuilder();

        
        for (int y = 0; y < 3; y++) {
            for (int x = 0; x < 20; x++) {
                // NPC position in Zeil nummer 1
                if (x == npc.getXCoordinate()&&(y==1)){
                    sb.append("P");
        
                }else if (x == npc.getXCoordinate()&&(y==0)) {
                    // NPC position in zeil 0 und entweder iscraouchung oder nicht 
                    if (!npc.isCrouching()) {
                        
                        sb.append("P");
                    } else {
                        
                        sb.append(gameBoard[y][x].getSymbol());
                    }
                }else{
                    // hinzufügen  GameObject der in dieser  Position ist
                    sb.append(gameBoard[y][x].getSymbol());
                }
            }
        sb.append("\n"); // Neue Zeile für die nächste Zeil
        }

        return sb.toString();
    }


    /**
        * This method contains the game gameplay
        * The NPC's actions are determined by its current position on the game field:
        * - If the NPC stands on the goal or lava, the game ends.
        * After each action, the game state is printed
        
    */



    
    public void play() {
        int i=1;
        while(true) {
            int t=npc.getXCoordinate();
            // print the Gameboard 
            System.out.println(this.str());
            i+=1;
            //To know in what step we are 
            System.out.println(i);

        
            
            
            if ((gameBoard[2][npc.getXCoordinate()] == GameObjects.LAVA) || (gameBoard[2][npc.getXCoordinate()] == GameObjects.GOAL)) {
                System.out.println(" leider Spiel beendet!");
                break;
            }
            
            // NPC vor einem AIROBSTACLE steht
            else if ((gameBoard[0][npc.getXCoordinate() +1] == GameObjects.AIROBSTACLE)&&(!npc.isCrouching())) {
                npc.crouch();
                


            }
            
            // existanz von LAVA vor der NPC
            else if ((gameBoard[2][npc.getXCoordinate() + 1] == GameObjects.LAVA)&&((npc.getXCoordinate() )<18)) {
                if (npc.isCrouching()) {
                    npc.standUp();
                    

                } else {
                    
                
                    npc.dashRight();
                    gameBoard[1 ][npc.getXCoordinate()]=GameObjects.EMPTY;
                    //gameBoard[npc.getXCoordinate() ][0]=GameObjects.EMPTY;
                    
                    //gameBoard[npc.getXCoordinate()+2 ][0]=GameObjects.Player;
                }

            }else{
            npc.walkRight();
            gameBoard[ 1][npc.getXCoordinate()]=GameObjects.EMPTY;
            //gameBoard[npc.getXCoordinate() ][0]=GameObjects.EMPTY;

            
            //gameBoard[npc.getXCoordinate()+1 ][0]=GameObjects.Player;
            }

        }

 
    }
    
    public static void main(String[] args) {
        //  Instanz von GameView
        GameView game = new GameView();

        // lets play
        game.play();
    }   

}
