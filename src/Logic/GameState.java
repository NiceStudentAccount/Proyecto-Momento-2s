/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logic;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author samyg
 */
public class GameState {
    private int turnCounter;

    public int getTurnCounter() {
        return turnCounter;
    }

    public void setTurnCounter(int turnCounter) {
        this.turnCounter = turnCounter;
    }

    public GameState() {
        this.turnCounter = 0;
    }
    
    public void checkIfWon(JPanel parentComponent) {
        if (turnCounter == 20) {
            JOptionPane.showMessageDialog(parentComponent, "Ganaste, papu");
            System.exit(0);
        }
    }
    
}
