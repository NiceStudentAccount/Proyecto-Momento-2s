/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import GUI.DeathCard;
import javax.swing.Icon;

/**
 *
 * @author samyg
 */
public class GameOverCard extends Card {
    private DeathCard deathCard;

    public GameOverCard(GameCharacter character, String situation, DeathCard screen, String gameOverDescription, Icon gameOverIcon) {
        super(character, situation);
        this.deathCard = new DeathCard(gameOverDescription, gameOverIcon);
    }

    public DeathCard getDeathCard() {
        return deathCard;
    }

    public void setDeathCard(DeathCard deathCard) {
        this.deathCard = deathCard;
    }
    
}
