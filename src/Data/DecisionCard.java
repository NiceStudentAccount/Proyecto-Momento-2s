/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

/**
 *
 * @author samyg
 */
public class DecisionCard extends Card {
    private Consequence yesConsecuence;
    private Consequence noConsecuence;

    public DecisionCard(GameCharacter character, String situation, Consequence yesConsecuence, Consequence noConsecuence) {
        super(character, situation);
        this.yesConsecuence = yesConsecuence;
        this.noConsecuence = noConsecuence;
    }

    public Consequence getYesConsecuence() {
        return yesConsecuence;
    }

    public void setYesConsecuence(Consequence yesConsecuence) {
        this.yesConsecuence = yesConsecuence;
    }

    public Consequence getNoConsecuence() {
        return noConsecuence;
    }

    public void setNoConsecuence(Consequence noConsecuence) {
        this.noConsecuence = noConsecuence;
    }
    
    public void executeYesConsequence() {
        yesConsecuence.affectStats();
    }
    
    public void executeNoConsequence() {
        noConsecuence.affectStats();
    }
}
