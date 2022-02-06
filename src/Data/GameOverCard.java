/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import GUI.ChoiceCard;
import GUI.DeathCard;
import GUI.GameOverPanel;
import javax.swing.Icon;

/**
 *
 * @author samyg
 */
public class GameOverCard extends Card {
    private GameOverPanel deathCard;

    public GameOverCard(GameCharacter character, String situation, String failureSituation, Icon failureIcon, ChoiceCard choiceCardMenu) {
        super(character, situation);
        this.deathCard = new GameOverPanel(failureSituation, failureIcon, choiceCardMenu);
    }

    public GameOverPanel getDeathCard() {
        return deathCard;
    }

    public void setDeathCard(GameOverPanel deathCard) {
        this.deathCard = deathCard;
    }

   
    
}
