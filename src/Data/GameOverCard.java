/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import GUI.GameOverScreen;
import javax.swing.Icon;

/**
 *
 * @author samyg
 */
public class GameOverCard extends Card {
    private GameOverScreen screen;

    public GameOverCard(GameCharacter character, String situation, GameOverScreen screen, String gameOverDescription, Icon gameOverIcon) {
        super(character, situation);
        this.screen = new GameOverScreen(gameOverDescription, gameOverIcon);
    }

    public GameOverScreen getScreen() {
        return screen;
    }

    public void setScreen(GameOverScreen screen) {
        this.screen = screen;
    }
    
}
