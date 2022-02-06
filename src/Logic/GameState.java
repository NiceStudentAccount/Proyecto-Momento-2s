/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import GUI.ChoiceCard;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author samyg
 */
public class GameState {
    private int turnCounter;
    private ChoiceCard choiceCardMenu;

    public int getTurnCounter() {
        return turnCounter;
    }

    public void setTurnCounter(int turnCounter) {
        this.turnCounter = turnCounter;
    }

    public GameState(ChoiceCard choiceCardMenu) {
        this.turnCounter = 0;
        this.choiceCardMenu = choiceCardMenu;
    }
    
    public void checkIfWon(JPanel parentComponent) {
        if (turnCounter == 20) {
            choiceCardMenu.showWinPanel();
        }
    }
    
}
